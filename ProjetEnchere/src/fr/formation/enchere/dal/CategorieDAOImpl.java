package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Categorie;

public class CategorieDAOImpl implements CategorieDAO {
	private static final String sqlSelectCategorie		= "select * from CATEGORIES";
	
	// Sélectionner un article
	public Categorie selectCategorie() throws DALException {
		return null;
	}

}
