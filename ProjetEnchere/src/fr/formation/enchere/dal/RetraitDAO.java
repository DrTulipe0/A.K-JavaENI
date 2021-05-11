package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Retrait;

public interface RetraitDAO {
	// S�lectionner un Retrait
	public Retrait selectRetrait() throws DALException;
	
	//modifier un Retrait
	public Retrait updateRetrait() throws DALException;
	
	//ins�rer un Retrait
	public Retrait insertRetrait() throws DALException;
	
	//supprimer un Retrait
	public Retrait deleteRetrait() throws DALException;
}
