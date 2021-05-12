package fr.formation.enchere.bll;

import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.Enchere;

public class EnchereImpl implements EnchereInterface {
	
	protected List<Enchere> lstEnchere = new ArrayList<Enchere>();
	
	@Override
	public List<Enchere> listeEnchere(String filtre, String categorie) throws EnchereException{
		int numCategorie;
		switch (categorie) {
		case "toute":
			numCategorie = 0;
			break;
		case "Informatique":
			numCategorie = 1;
			break;
		case "Ammeublement":
			numCategorie = 2;
			break;
		case "Vêtement":
			numCategorie = 3;
			break;
		case "Sport&Loisirs":
			numCategorie = 4;
			break;
		}
		List<Enchere> lstEnchere = DAO.getEnchereDAO().selectAll(numCategorie, filtre);
		return lstEnchere;
	}
}
