package fr.formation.enchere.ihm;

import java.util.List;

import fr.formation.enchere.bo.ArticleVendu;
import fr.formation.enchere.bo.Enchere;
import fr.formation.enchere.bo.Utilisateur;

public class EnchereModel {

	private Enchere enchere;
	private List<Enchere> lstEnchere;
	private ArticleVendu article;
	private List<ArticleVendu> lstArticle;
	private Utilisateur util;
	public EnchereModel() {
	}
	public EnchereModel(Enchere enchere, List<Enchere> lstEnchere, ArticleVendu article, List<ArticleVendu> lstArticle,
			Utilisateur util) {
		super();
		this.enchere = enchere;
		this.lstEnchere = lstEnchere;
		this.article = article;
		this.lstArticle = lstArticle;
		this.util = util;
	}
	public Enchere getEnchere() {
		return enchere;
	}
	public void setEnchere(Enchere enchere) {
		this.enchere = enchere;
	}
	public List<Enchere> getLstEnchere() {
		return lstEnchere;
	}
	public void setLstEnchere(List<Enchere> lstEnchere) {
		this.lstEnchere = lstEnchere;
	}
	public ArticleVendu getArticle() {
		return article;
	}
	public void setArticle(ArticleVendu article) {
		this.article = article;
	}
	public List<ArticleVendu> getLstArticle() {
		return lstArticle;
	}
	public void setLstArticle(List<ArticleVendu> lstArticle) {
		this.lstArticle = lstArticle;
	}
	public Utilisateur getUtil() {
		return util;
	}
	public void setUtil(Utilisateur util) {
		this.util = util;
	}
	@Override
	public String toString() {
		return "EnchereModel [enchere=" + enchere + ", lstEnchere=" + lstEnchere + ", article=" + article
				+ ", lstArticle=" + lstArticle + ", util=" + util + "]";
	}
	
}
