package fr.formation.enchere.bo;

public class Enchere {
	private String dateEnchere;
	private float montant_enchere;
	private int no_utilisateur;
	private int no_article;
	
	public Enchere(int no_utilisateur, int no_article, String dateEnchere, float montant_enchere) {
		super();
		
		this.no_utilisateur = no_utilisateur;
		this.no_article = no_article;
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}
	public Enchere( ) {
		super();
	}
	//
	public int getNoUtilisateur() {
		return no_utilisateur;
	}
	public void setNoUtilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}
	//
	public int getNoArticle() {
		return no_article;
	}
	public void setNoArticle(int no_article) {
		this.no_article = no_article;
	}
	//
	public String getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(String dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	//
	public float getMontant_enchere() {
		return montant_enchere;
	}
	public void setMontant_enchere(float montant_enchere) {
		this.montant_enchere = montant_enchere;
	}
	//
}
