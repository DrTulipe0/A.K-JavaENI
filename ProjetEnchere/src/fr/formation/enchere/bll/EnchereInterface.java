package fr.formation.enchere.bll;

import java.util.List;

import fr.formation.enchere.bo.Enchere;

public interface EnchereInterface {
	public List<Enchere> listeEnchere(String filtre, String categorie) throws EnchereException;
}
