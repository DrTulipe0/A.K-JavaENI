package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.Utilisateur;

public class UtilisateurDAOImpl {
	private static final String sqlSelectUtilisateur		= "Select * from UTILISATEURS where no_utilisateur = ?";
	private static final String sqlUpdateUtilisateur	= "Update UTILISATEURS "
														+ "set no_utilisateur = ?, pseudo = ?, nom = ?, prenom = ?, email = ?, telephone = ?, rue = ?, "
														+ "code_postal = ?, ville = ?, mot_de_passe = ?, credit = ?, administrateur = ? "
														+ "where no_article = ?";
	private static final String sqlDeleteUtilisateur		= "Delete from UTILISATEURS where no_utilisateur = ?";
	private static final String sqlInsertUtilisateur		= "Insert into UTILISATEURS (no_article,nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) ";
	
	
	
	// Sélectionner un utilisateur
	public Utilisateur selectUtilisateur() throws DALException {
		return null;
	}
	
	//modifier un utilisateur
	public Utilisateur updateUtilisateur() throws DALException {
		return null;
	}
	
	//insérer un utilisateur
	public Utilisateur insertUtilisateur() throws DALException {
		return null;
	}
	
	//supprimer un utilisateur
	public Utilisateur deleteUtilisateur() throws DALException {
		return null;
	}
}
