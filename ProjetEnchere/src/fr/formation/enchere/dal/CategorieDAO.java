package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Categorie;

public interface CategorieDAO {
	//S�lectionner les cat�gories
	public List<Categorie> selectCategorie() throws DALException;
}
