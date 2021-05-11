package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.ArticleVendu;

public class ArticleVenduDAOImpl implements ArticleVenduDAO {
	private static final String sqlSelectArticle		= "Select * from ARTICLES_VENDUS where no_article = ?";
	private static final String sqlUpdateArticle		= "Update ARTICLES_VENDUS "
														+ "set nom_article = ?, description = ?, date_debut_encheres = ?, date_fin_encheres = ?, prix_initial = ?, prix_vente = ?, no_categorie = ? "
														+ "where no_article = ?";
	private static final String sqlDeleteArticle		= "Delete from ARTICLES_VENDUS where no_article = ?";
	private static final String sqlInsertArticle		= "Insert into ARTICLES_VENDUS (no_article,nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) "
														+ "values (?,?,?,?)";
	
	
	// Sélectionner un article
	public ArticleVendu selectArticle() throws DALException {
		return null;
	}
	
	//modifier un article
	public ArticleVendu updateArticle() throws DALException {
		return null;
	}
	
	//insérer un article
	public ArticleVendu insertArticle() throws DALException {
		return null;
	}
	
	//supprimer un article
	public ArticleVendu deleteArticle() throws DALException {
		return null;
	}
}
