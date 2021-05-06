package fr.formation.enchere.bo;

public class Categorie {
	private int noCategorie;
	private String libelleCategorie;
	
	public Categorie(int noCategorie, String libelleCategorie) {
		super();
		
		this.noCategorie = noCategorie;
		this.libelleCategorie = libelleCategorie;
	}
	public Categorie( ) {
		super();
	}
	
	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	//
	public String getLibelleCategorie() {
		return libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	
}
