package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Enchere;

public interface EnchereDAO {
	//Sélectionner une enchère
	public Enchere select(int no_utilisateur, int no_article) throws DALException;
	
	//Créer une enchère
	public Enchere insert(Enchere enchere) throws DALException;
	
	//Modifier une enchère
	public Enchere update(Enchere enchere) throws DALException;
	
	//Sélectionner toutes les enchères
	public List<Enchere> selectAll(int categorieEnchere, String libelleEnchere,  int no_utilisateur) throws DALException;
	
	//Supprimer une enchère
	public Enchere delete(int no_utilisateur, int no_article) throws DALException;
	
}
