package fr.formation.enchere.bo;

public class Utilisateur {
	private int idUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private int codePostal;
	private String ville;
	private String motDePasse;
	private float credit;
	private boolean administrateur;
	
	
	public Utilisateur(int idUtilisateur, String pseudo, String nom, String prenom, String email, String telephone, String rue, int codePostal, String ville, String motDePasse,
			float credit, boolean administrateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}
	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + "]";
	}

	public Utilisateur() {
		super();
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	//
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	//
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	//
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	//
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	//
	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	//
	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}
	//
	public boolean isAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}
	
	
}
