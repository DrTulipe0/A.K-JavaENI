package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Enchere;

public interface EnchereDAO {
	//S�lectionner une ench�re
	public Enchere select(int idEnchere) throws DALException;
	
	//Cr�er une ench�re
	public Enchere insert(Enchere enchere) throws DALException;
	
	//Modifier une ench�re
	public Enchere update(Enchere enchere) throws DALException;
	
	//S�lectionner toutes les ench�res
	public Enchere selectAll(int idEnchere, String categorieEnchere) throws DALException;
	
	//Supprimer une ench�re
	public Enchere delete(int idEnchere) throws DALException;
	
}
