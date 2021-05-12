package fr.formation.enchere.dal;

import java.util.List;

import fr.formation.enchere.bo.ArticleVendu;

public interface ArticleVenduDAO {
	// Sélectionner un article
	public ArticleVendu selectArticle(int no_article, int no_utilisateur, int no_categorie, boolean etat_vente) throws DALException;
	
	//modifier un article
	public ArticleVendu updateArticle(ArticleVendu art) throws DALException;
	
	//insérer un article
	public ArticleVendu insertArticle(ArticleVendu art) throws DALException;
	
	//supprimer un article
	public ArticleVendu deleteArticle(int no_article) throws DALException;
}
