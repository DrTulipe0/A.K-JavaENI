package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.Enchere;
//importer fr.formation.enchere..dal.util.ConnectionProvider;
public class EnchereDAOImpl implements EnchereDAO {
	private static final String sqlSelectAllEncheres 	= "Select * from ENCHERES";
	private static final String sqlSelectEnchere		= "Select * from ENCHERES where no_article = ?";
	private static final String sqlUpdateEncheres		= "Update ENCHERES set date_enchere = ?, montant_enchere = ? where no_article = ? and no_utilisateur = ?";
	private static final String sqlDeleteEncheres		= "Delete from ENCHERES where no_article = ?";
	private static final String sqlInsertEncheres		= "Insert into ENCHERES (no_utilisateur, no_article, date_enchere, montant_enchere) values (?,?,?,?)";
	
	
	//Sélectionner une enchère
	public Enchere select(int idEnchere) throws DALException {
		return null;
	}
	
	//Créer une enchère
	public Enchere insert(Enchere ench) throws DALException {
		return null;
	}
	
	//Modifier une enchère
	public Enchere update(Enchere ench) throws DALException {
		return null;
	}
	
	//Sélectionner toutes les enchères
	public Enchere selectAll(int idEnchere, String categorieEnchere) throws DALException {
		return null;
	}
	
	//Supprimer une enchère
	public Enchere delete(int idEnchere) throws DALException {
		return null;
	}
	
	
	
}
