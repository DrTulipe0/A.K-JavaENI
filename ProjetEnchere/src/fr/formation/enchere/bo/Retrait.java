package fr.formation.enchere.bo;

public class Retrait {
	private int no_article;
	private String rue;
	private int codePostal;
	private String ville;

	public Retrait(int no_article, String rue, int codePostal, String ville) {
		super();
		
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	public Retrait( ) {
		super();
	}
	
	
	public int getNo_article() {
		return no_article;
	}
	public void setNo_article(int no_article) {
		this.no_article = no_article;
	}
	//
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	//
	public int getCodePostal() {
		return codePostal;
	}
	@Override
	public String toString() {
		return "Retrait [no_article=" + no_article + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville
				+ "]";
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	//
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
