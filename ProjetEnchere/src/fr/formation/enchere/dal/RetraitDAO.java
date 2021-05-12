package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Retrait;

public interface RetraitDAO {
	// Sélectionner un Retrait
	public Retrait selectRetrait(int no_article) throws DALException;
	
	//modifier un Retrait
	public Retrait updateRetrait(Retrait ret) throws DALException;
	
	//insérer un Retrait
	public Retrait insertRetrait(Retrait ret) throws DALException;
	
	//supprimer un Retrait
	public Retrait deleteRetrait(int no_article) throws DALException;
}
