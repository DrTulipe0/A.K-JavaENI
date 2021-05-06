package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Enchere_perso;;

public interface EnchereDAO {
	//S�lectionner une ench�re
	public Enchere_perso select(int idEnchere) throws DALException;
	
	//Cr�er une ench�re
	public Enchere_perso insert(Enchere_perso enchere) throws DALException;
	
	//Modifier une ench�re
	public Enchere_perso update(Enchere_perso enchere) throws DALException;
	
	//S�lectionner toutes les ench�res
	public Enchere_perso selectAll(int idEnchere, String categorieEnchere) throws DALException;
	
	//Supprimer une ench�re
	public Enchere_perso delete(int idEnchere) throws DALException;
	
}
