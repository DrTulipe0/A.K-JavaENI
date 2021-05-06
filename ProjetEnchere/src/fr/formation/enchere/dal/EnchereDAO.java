package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.Enchere_perso;;

public interface EnchereDAO {
	//Sélectionner une enchère
	public Enchere_perso select(int idEnchere) throws DALException;
	
	//Créer une enchère
	public Enchere_perso insert(Enchere_perso enchere) throws DALException;
	
	//Modifier une enchère
	public Enchere_perso update(Enchere_perso enchere) throws DALException;
	
	//Sélectionner toutes les enchères
	public Enchere_perso selectAll(int idEnchere, String categorieEnchere) throws DALException;
	
	//Supprimer une enchère
	public Enchere_perso delete(int idEnchere) throws DALException;
	
}
