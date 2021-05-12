package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	// S�lectionner un utilisateur
	public Utilisateur selectUtilisateur(int no_utilisateur) throws DALException;
	
	//modifier un utilisateur
	public Utilisateur updateUtilisateur(Utilisateur user) throws DALException;
	
	//ins�rer un utilisateur
	public Utilisateur insertUtilisateur(Utilisateur user) throws DALException;
	
	//supprimer un utilisateur
	public Utilisateur deleteUtilisateur(int no_utilisateur) throws DALException;
}
