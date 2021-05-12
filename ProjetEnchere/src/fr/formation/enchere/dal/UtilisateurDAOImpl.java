package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.Retrait;
import fr.formation.enchere.bo.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {
	private static final String sqlSelectUtilisateur		= "Select * from UTILISATEURS where no_utilisateur = ?";
	private static final String sqlUpdateUtilisateur	= "Update UTILISATEURS "
														+ "set no_utilisateur = ?, pseudo = ?, nom = ?, prenom = ?, email = ?, telephone = ?, rue = ?, "
														+ "code_postal = ?, ville = ?, mot_de_passe = ?, credit = ? "
														+ "where no_utilisateur = ?";
	private static final String sqlDeleteUtilisateur		= "Delete from UTILISATEURS where no_utilisateur = ?";
	private static final String sqlInsertUtilisateur		= "Insert into UTILISATEURS (no_article,nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) ";
	
	
	
	// Sélectionner un utilisateur
	public Utilisateur selectUtilisateur(int no_utilisateur) throws DALException {
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur user = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println(connection);

			try {
				rqt = connection.prepareStatement(sqlSelectUtilisateur);
				rqt.setInt(1, no_utilisateur);

				rs = rqt.executeQuery();
				while (rs.next()) {
					user = new Utilisateur(rs.getInt("no_utilisateur"), rs.getString("pseudo"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("telephone"), rs.getString("rue"), rs.getInt("code_postal"), rs.getString("ville"), rs.getString("mot_de_passe"), rs.getFloat("credit"), rs.getBoolean("administrateur"));
				}
			} catch (SQLException e) {
				throw new DALException("select user failed - ", e);
			} 
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - ", e1);
		}
		return user;
	}
	
	//modifier un utilisateur
	public Utilisateur updateUtilisateur(Utilisateur user) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlUpdateUtilisateur);
				rqt.setInt(1, user.getIdUtilisateur());
				rqt.setString(2, user.getPseudo());
				rqt.setString(3, user.getNom());
				rqt.setString(4, user.getPrenom());
				rqt.setString(5, user.getEmail());
				rqt.setString(6, user.getTelephone());
				rqt.setString(7, user.getRue());
				rqt.setInt(8, user.getCodePostal());
				rqt.setString(9, user.getVille());
				rqt.setString(10, user.getMotDePasse());
				rqt.setFloat(11, user.getCredit());
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Update user failed - " + user, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + user, e1);
		}
		return user;
	}
	
	//insérer un utilisateur
	public Utilisateur insertUtilisateur(Utilisateur user) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlInsertUtilisateur);
				rqt.setInt(1, user.getIdUtilisateur());
				rqt.setString(2, user.getPseudo());
				rqt.setString(3, user.getNom());
				rqt.setString(4, user.getPrenom());
				rqt.setString(5, user.getEmail());
				rqt.setString(6, user.getTelephone());
				rqt.setString(7, user.getRue());
				rqt.setInt(8, user.getCodePostal());
				rqt.setString(9, user.getVille());
				rqt.setString(10, user.getMotDePasse());
				rqt.setFloat(11, user.getCredit());
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Update user failed - " + user, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + user, e1);
		}
		return user;
	}
	
	//supprimer un utilisateur
	public Utilisateur deleteUtilisateur(int no_utilisateur) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);
			try {
				rqt = connection.prepareStatement(sqlDeleteUtilisateur);
				rqt.setInt(1, no_utilisateur);
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Delete user failed - " + no_utilisateur, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + no_utilisateur, e1);
		}
		return null;
	}
}
