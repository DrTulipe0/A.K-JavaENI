package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.ArticleVendu;

public class ArticleVenduDAOImpl implements ArticleVenduDAO {
	private static final String sqlSelectArticle		= "Select * from ARTICLES_VENDUS where no_article = ?";
	private static final String sqlUpdateArticle		= "Update ARTICLES_VENDUS "
														+ "set nom_article = ?, description = ?, date_debut_encheres = ?, date_fin_encheres = ?, prix_initial = ?, prix_vente = ?, no_categorie = ? "
														+ "where no_article = ?";
	private static final String sqlDeleteArticle		= "Delete from ARTICLES_VENDUS where no_article = ?";
	private static final String sqlInsertArticle		= "Insert into ARTICLES_VENDUS (no_article,nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) "
														+ "values (?,?,?,?)";
	
	
	// Sélectionner un article
	public ArticleVendu selectArticle(int no_article, boolean etat_vente) throws DALException {
		PreparedStatement rqt = null;
		ResultSet rs = null;
		ArticleVendu art = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println(connection);

			try {
				rqt = connection.prepareStatement(sqlSelectArticle);
				rqt.setInt(1, no_article);

				rs = rqt.executeQuery();
				while (rs.next()) {
					art = new ArticleVendu(rs.getInt("no_article"), rs.getString("nom_article"),rs.getString("description"),rs.getString("date_debut_encheres"),rs.getString("date_fin_encheres"), 
							rs.getFloat("prix_initial"), rs.getFloat("prix_vente"), etat_vente);
				}
			} catch (SQLException e) {
				throw new DALException("select article failed - ", e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - ", e1);
		}
		return art;
	}
	
	//modifier un article
	public ArticleVendu updateArticle(ArticleVendu art) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlUpdateArticle);
				rqt.setString(1, art.getNomArticle());
				rqt.setString(2, art.getDescription());
				rqt.setString(3, art.getDateDebutEncheres());
				rqt.setString(4, art.getDateFinEncheres());
				rqt.setFloat(5, art.getMiseAPrix());
				rqt.setFloat(6, art.getPrixVente());
				rqt.setInt(7, art.getNo_categorie());
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Update article failed - " + art, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + art, e1);
		}
		return art;
	}
	
	//insérer un article
	public ArticleVendu insertArticle(ArticleVendu art) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlInsertArticle);
				rqt.setString(1, art.getNomArticle());
				rqt.setString(2, art.getDescription());
				rqt.setString(3, art.getDateDebutEncheres());
				rqt.setString(4, art.getDateFinEncheres());
				rqt.setFloat(5, art.getMiseAPrix());
				rqt.setFloat(6, art.getPrixVente());
				rqt.setInt(7, art.getNo_categorie());
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Insert article failed - " + art, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + art, e1);
		}
		return art;
	}
	
	//supprimer un article
	public ArticleVendu deleteArticle(int no_article) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlDeleteArticle);
				rqt.setInt(1, no_article);
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Delete article failed - " + no_article, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + no_article, e1);
		}
		return null;
	}
	}
}
