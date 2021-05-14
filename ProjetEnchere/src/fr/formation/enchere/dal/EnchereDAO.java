package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Enchere;

public interface EnchereDAO {
	//S�lectionner une ench�re
	public Enchere select(int no_utilisateur, int no_article) throws DALException;
	
	//Cr�er une ench�re
	public Enchere insert(Enchere enchere) throws DALException;
	
	//Modifier une ench�re
	public Enchere update(Enchere enchere) throws DALException;
	
	//S�lectionner toutes les ench�res
	public List<Enchere> selectAll(int categorieEnchere, String libelleEnchere,  int no_utilisateur) throws DALException;
	
	//Supprimer une ench�re
	public Enchere delete(int no_utilisateur, int no_article) throws DALException;
	
}
