package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Categorie;

public interface CategorieDAO {
	//Sélectionner les catégories
	public List<Categorie> selectCategorie() throws DALException;
}
