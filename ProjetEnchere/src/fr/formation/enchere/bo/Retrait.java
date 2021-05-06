package fr.formation.enchere.bo;

public class Retrait {
	private String rue;
	private int codePostal;
	private String ville;

	public Retrait(String rue, int codePostal, String ville) {
		super();
		
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	public Retrait( ) {
		super();
	}
	
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
