package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Categorie;

public interface CategorieDAO {
	//Sélectionner une catégorie
	public Categorie selectCategorie() throws DALException;
}
