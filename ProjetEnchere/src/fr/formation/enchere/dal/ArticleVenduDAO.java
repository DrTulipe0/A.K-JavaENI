package fr.formation.enchere.dal;

import java.util.List;
import fr.formation.enchere.bo.ArticleVendu;

public interface ArticleVenduDAO {
	// Sélectionner un article
	public ArticleVendu selectArticle() throws DALException;
	
	//modifier un article
	public ArticleVendu updateArticle() throws DALException;
	
	//insérer un article
	public ArticleVendu insertArticle() throws DALException;
	
	//supprimer un article
	public ArticleVendu deleteArticle() throws DALException;
}
