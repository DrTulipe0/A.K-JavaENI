package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.Enchere;
//importer fr.formation.enchere..dal.util.ConnectionProvider;
public class EnchereDAOImpl implements EnchereDAO {
	private String sqlSelectAllEncheres 	= "Select av.*, e.date_enchere, e.montant_enchere from ENCHERES e"
														+ "	left join ARTICLES_VENDUS av on av.no_article = e.no_article"
														+ " where av.no_utilisateur = e.no_utilisateur";
	private static final String sqlSelectEnchere		= "Select * from ENCHERES where no_utilisateur =? and no_article = ?";
	private static final String sqlUpdateEncheres		= "Update ENCHERES set date_enchere = ?, montant_enchere = ? where no_article = ? and no_utilisateur = ?";
	private static final String sqlDeleteEncheres		= "Delete from ENCHERES where no_utilisateur = ? and no_article = ?";
	private static final String sqlInsertEncheres		= "Insert into ENCHERES (no_utilisateur, no_article, date_enchere, montant_enchere) values (?,?,?,?)";
	
	
	//Sélectionner une enchère
	public Enchere select(int no_utilisateur, int no_article) throws DALException {
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Enchere ench = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println(connection);
			
			try {
				rqt = connection.prepareStatement(sqlSelectEnchere);
				rqt.setInt(1, no_utilisateur);
				rqt.setInt(2, no_article);
				
				while (rs.next()) {
					ench = new Enchere(rs.getInt("no_utilisateur"), rs.getInt("no_article") ,rs.getString("date_enchere"), rs.getFloat("montant_enchere"));
				}
			} catch (SQLException e) {
				throw new DALException("selectEnchere failed - ", e);
			} 
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - ", e1);
		}
		return ench;
	}
	
	//Créer une enchère
	public Enchere insert(Enchere ench) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlInsertEncheres, Statement.RETURN_GENERATED_KEYS);
				rqt.setInt(1, ench.getNoUtilisateur());
				rqt.setInt(2, ench.getNoArticle());
				rqt.setString(3, ench.getDateEnchere());
				rqt.setFloat(4, ench.getMontant_enchere());
				int nbRows = rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Insert coureur failed - " + ench, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + ench, e1);
		}
		return ench;
	}
	
	//Modifier une enchère
	public Enchere update(Enchere ench) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlUpdateEncheres);
				rqt.setInt(1, ench.getNoUtilisateur());
				rqt.setInt(2, ench.getNoArticle());
				rqt.setString(3, ench.getDateEnchere());
				rqt.setFloat(4, ench.getMontant_enchere());
				int nbRows = rqt.executeUpdate();
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Update coureur failed - " + ench, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + ench, e1);
		}
		return ench;
	}
	
	//Sélectionner toutes les enchères
	public List<Enchere> selectAll(int categorieEnchere, String libelleEnchere) throws DALException {
		
		if(categorieEnchere != 0 && libelleEnchere != null && libelleEnchere != "")
		{
			sqlSelectAllEncheres += " and av.no_categorie =" + categorieEnchere + " and upper(av.nom_article) like upper('%" + libelleEnchere + "%')";
		}
		if(categorieEnchere == 0 && libelleEnchere != null && libelleEnchere != "")
		{
			sqlSelectAllEncheres += " and upper(av.nom_article) like upper('%" + libelleEnchere + "%')";
		}
		if(categorieEnchere != 0 && (libelleEnchere == null || libelleEnchere == ""))
		{
			sqlSelectAllEncheres += " and av.no_categorie = " + categorieEnchere;
		}
		
		Statement rqt = null;
		ResultSet rs = null;
		List<Enchere> liste = new ArrayList<Enchere>();
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println(connection);

			try {
				rqt = connection.createStatement();
				rs = rqt.executeQuery(sqlSelectAllEncheres);
				Enchere ench = null;
				while (rs.next()) {
					ench = new Enchere(rs.getInt("no_utilisateur"), rs.getInt("no_article") ,rs.getString("date_enchere"), rs.getFloat("montant_enchere"));
					liste.add(ench);
				}
			} catch (SQLException e) {
				throw new DALException("selectAllEncheres failed - ", e);
			} 
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - ", e1);
		}
		return liste;
	}
	
	//Supprimer une enchère
	public Enchere delete(int no_utilisateur, int no_article) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);
			try {
				rqt = connection.prepareStatement(sqlDeleteEncheres);
				rqt.setInt(1, no_utilisateur);
				rqt.setInt(2, no_article);
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Delete enchere failed - " + no_utilisateur + " - " + no_article, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + no_utilisateur + " - " + no_article, e1);
		}
		return null;
	}
		
}
