package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Categorie;

public interface CategorieDAO {
	//S�lectionner une cat�gorie
	public Categorie selectCategorie() throws DALException;
}
