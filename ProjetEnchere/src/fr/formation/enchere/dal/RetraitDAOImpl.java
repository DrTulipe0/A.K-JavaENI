package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Retrait;

public class RetraitDAOImpl implements RetraitDAO {
	
	private static final String sqlSelectRetrait		= "select * from RETRAITS where no_article = ?";
	private static final String sqlUpdateRetrait		= "update RETRAITS set rue = ?, code_postal = ?, ville = ? where no_article = ?";
	private static final String sqlDeleteRetrait		= "delete from RETRAITS where no_article = ?";
	private static final String sqlInsertRetrait		= "insert into retrait(no_article, rue, code_postal, ville) values (?,?,?,?)";

	// Sélectionner un Retrait
	public Retrait selectRetrait() throws DALException {
		return null;
	}
	
	//modifier un Retrait
	public Retrait updateRetrait() throws DALException {
		return null;
	}
	
	//insérer un Retrait
	public Retrait insertRetrait() throws DALException {
		return null;
	}
	
	//supprimer un Retrait
	public Retrait deleteRetrait() throws DALException {
		return null;
	}

}
