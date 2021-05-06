package fr.formation.enchere.bo;

public class Enchere {
	private String dateEnchere;
	private float montant_enchere;
	
	public Enchere(String dateEnchere, float montant_enchere) {
		super();
		
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}
	public Enchere( ) {
		super();
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
