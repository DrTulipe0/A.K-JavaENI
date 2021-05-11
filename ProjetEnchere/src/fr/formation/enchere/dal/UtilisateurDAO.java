package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	// Sélectionner un utilisateur
	public Utilisateur selectUtilisateur() throws DALException;
	
	//modifier un utilisateur
	public Utilisateur updateUtilisateur() throws DALException;
	
	//insérer un utilisateur
	public Utilisateur insertUtilisateur() throws DALException;
	
	//supprimer un utilisateur
	public Utilisateur deleteUtilisateur() throws DALException;
}
