package fr.formation.enchere.bo;

public class Enchere_perso {
	private String libelleArticle;
	private String descriptionArticle;
	private String categorie;
	private String cheminImage;
	private int prixDepart;
	private String dateDebut;
	private String dateFin;
	
	private String adresseRueRetrait;
	private String codePostalRetrait;
	private String villeRetrait;
	
	private boolean statutEnchere;
	
	public Enchere_perso(String libelleArticle, String descriptionArticle, String categorie, String cheminImage, int prixDepart,
				String dateDebut, String dateFin, String adresseRueRetrait, String codePostalRetrait, String villeRetrait, boolean statutEnchere) {
		super();
		this.libelleArticle = libelleArticle;
		this.descriptionArticle= descriptionArticle;
		this.categorie = categorie;
		this.cheminImage = cheminImage;
		this.prixDepart = prixDepart;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		
		this.adresseRueRetrait = adresseRueRetrait;
		this.codePostalRetrait = codePostalRetrait;
		this.villeRetrait = villeRetrait;
		this.statutEnchere = statutEnchere;
	}
	
	public Enchere_perso() {
		super();
	}
	
	public String getLibelleArticle() {
		return libelleArticle;
	}
	
	public void setLibelleArticle(String libelleArticle) {
		this.libelleArticle = libelleArticle;
	}
	//
	public String getDescriptionArticle() {
		return descriptionArticle;
	}
	public void setDescriptionArticle(String descriptionArticle) {
		this.descriptionArticle = descriptionArticle;
	}
	@Override
	public String toString() {
		return "Enchere_perso [libelleArticle=" + libelleArticle + ", descriptionArticle=" + descriptionArticle
				+ ", categorie=" + categorie + ", cheminImage=" + cheminImage + ", prixDepart=" + prixDepart
				+ ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", adresseRueRetrait=" + adresseRueRetrait
				+ ", codePostalRetrait=" + codePostalRetrait + ", villeRetrait=" + villeRetrait + ", statutEnchere="
				+ statutEnchere + "]";
	}

	//
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	//
	public String getCheminImage() {
		return cheminImage;
	}
	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}
	//
	public int getPrixDepart() {
		return prixDepart;
	}
	public void setPrixDepart(int prixDepart) {
		this.prixDepart = prixDepart;
	}
	//
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	//
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	//
	public String getAdresseRueRetrait() {
		return adresseRueRetrait;
	}
	public void setAdresseRueRetrait(String adresseRueRetrait) {
		this.adresseRueRetrait = adresseRueRetrait;
	}
	//
	public String getCodePostalRetrait() {
		return codePostalRetrait;
	}
	public void setCodePostalRetrait(String codePostalRetrait) {
		this.codePostalRetrait = codePostalRetrait;
	}
	//
	public String getVilleRetrait() {
		return villeRetrait;
	}	
	public void setVilleRetrait(String villeRetrait) {
		this.villeRetrait = villeRetrait;
	}
	//
	public boolean getStatutEnchere() {
		return statutEnchere;
	}
	public void setStatutEnchere(boolean statutEnchere) {
		this.statutEnchere = statutEnchere;
	}
	//
	
	
}


