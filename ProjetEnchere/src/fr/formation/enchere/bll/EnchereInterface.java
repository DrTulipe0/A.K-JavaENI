package fr.formation.enchere.bll;

import java.util.List;

import fr.formation.enchere.bo.ArticleVendu;
import fr.formation.enchere.bo.Enchere;
import fr.formation.enchere.bo.Utilisateur;

public interface EnchereInterface {
	public List<Enchere> listeEnchere(String filtre, String categorie) throws EnchereException;
	public ArticleVendu articleEnchere(int no_Article) throws EnchereException;
	public Utilisateur utilisateurEnchere(int no_Utilisateur) throws EnchereException;
	public boolean verifIdentifiant(String login, String mdp) throws EnchereException;
}
