package fr.formation.enchere.dal;

public class DAO {
	public static EnchereDAO getEnchereDAO() {
		return new EnchereDAOImpl();
	}
	public static ArticleVenduDAO getArticleDAO() {
		return new ArticleVenduDAOImpl();
	}
	public static CategorieDAO getCategorieDAO() {
		return new CategorieDAOImpl();
	}
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOImpl();
	}
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
}
