package fr.formation.enchere.bll;

import java.util.ArrayList;
import java.util.List;

import fr.formation.enchere.bo.ArticleVendu;
import fr.formation.enchere.bo.Enchere;
import fr.formation.enchere.bo.Utilisateur;
import fr.formation.enchere.dal.DALException;
import fr.formation.enchere.dal.DAO;

public class EnchereImpl implements EnchereInterface {
	
	protected List<Enchere> lstEnchere = new ArrayList<Enchere>();
	
	@Override
	public List<Enchere> listeEnchere(String filtre, String categorie) throws EnchereException{
		int numCategorie = 0;
		List<Enchere> lstEnchere= new ArrayList();
		switch (categorie) {
		case "toute":
			numCategorie = 0;
			break;
		case "Informatique":
			numCategorie = 1;
			break;
		case "Ammeublement":
			numCategorie = 2;
			break;
		case "Vêtement":
			numCategorie = 3;
			break;
		case "Sport&Loisirs":
			numCategorie = 4;
			break;
		}
		try {
			lstEnchere = DAO.getEnchereDAO().selectAll(numCategorie, filtre,-1);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstEnchere;
	}
	public ArticleVendu articleEnchere(int no_Article) throws EnchereException{
		ArticleVendu article = new ArticleVendu();
		try {
			article=DAO.getArticleDAO().selectArticle(no_Article,0,0,false);
		} catch (DALException e) {
			e.printStackTrace();
		}
		return article;
	}
	public Utilisateur utilisateurEnchere(int no_Utilisateur) throws EnchereException{
		Utilisateur util = new Utilisateur();
		try {
			util=DAO.getUtilisateurDAO().selectUtilisateur(no_Utilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return util;
	}
	public boolean verifIdentifiant(String login, String mdp) throws EnchereException{
		boolean verif = false;
		verif = DAO.getUtilisateurDAO().selectUtilisateurLogin(login,mdp);
		return verif;
	}
	public void creationUtilisateur(Utilisateur util) throws EnchereException{
		try {
			DAO.getUtilisateurDAO().insertUtilisateur(util);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int existancePseudo(String pseudo) throws EnchereException{
		int test=-1;
		test = DAO.getUtilisateurDAO().selectUtilisateurExist(pseudo);
		return test;
	}
	public List<Enchere> listeEnchereVente(String filtre, String categorie, int numUtil) throws EnchereException{

		int numCategorie = 0;
		List<Enchere> lstEnchere= new ArrayList();
		switch (categorie) {
		case "toute":
			numCategorie = 0;
			break;
		case "Informatique":
			numCategorie = 1;
			break;
		case "Ammeublement":
			numCategorie = 2;
			break;
		case "Vêtement":
			numCategorie = 3;
			break;
		case "Sport&Loisirs":
			numCategorie = 4;
			break;
		}
		try {
			lstEnchere = DAO.getEnchereDAO().selectAll(numCategorie, filtre,numUtil);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstEnchere;
	}
}
