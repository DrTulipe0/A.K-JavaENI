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
	
	
	//S�lectionner une ench�re
	public Enchere select(int idEnchere) throws DALException {
		return null;
	}
	
	//Cr�er une ench�re
	public Enchere insert(Enchere ench) throws DALException {
		return null;
	}
	
	//Modifier une ench�re
	public Enchere update(Enchere ench) throws DALException {
		return null;
	}
	
	//S�lectionner toutes les ench�res
	public Enchere selectAll(int idEnchere, String categorieEnchere) throws DALException {
		return null;
	}
	
	//Supprimer une ench�re
	public Enchere delete(int idEnchere) throws DALException {
		return null;
	}
	
	
	
}
