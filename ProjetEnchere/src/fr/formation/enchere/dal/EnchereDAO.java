package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Enchere;

public interface EnchereDAO {
	//Sélectionner une enchère
	public Enchere select(int idEnchere) throws DALException;
	
	//Créer une enchère
	public Enchere insert(Enchere enchere) throws DALException;
	
	//Modifier une enchère
	public Enchere update(Enchere enchere) throws DALException;
	
	//Sélectionner toutes les enchères
	public Enchere selectAll(int idEnchere, String categorieEnchere) throws DALException;
	
	//Supprimer une enchère
	public Enchere delete(int idEnchere) throws DALException;
	
}
