package fr.formation.enchere.ihm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.enchere.bll.EnchereException;
import fr.formation.enchere.bll.EnchereInterface;
import fr.formation.enchere.bll.EnchereSingl;
import fr.formation.enchere.bo.ArticleVendu;
import fr.formation.enchere.bo.Enchere;
import fr.formation.enchere.bo.Utilisateur;

/**
 * Servlet implementation class AccueilServletNonConnecte
 */
@WebServlet("/AccueilServletNonConnecte")
public class AccueilServletNonConnecte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnchereInterface manager = EnchereSingl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServletNonConnecte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EnchereModel model;
		List<EnchereModel> listeEnchereModel = new ArrayList();
		List<Enchere> lstEnchere;
		String filtre = "";
		String categorie = "";
		if (request.getParameter("Filtre") != null || request.getParameter("categorie") != null) {
			if(request.getParameter("Filtre") != null) {
				filtre = request.getParameter("Filtre");
			}
			
			if(request.getParameter("categorie") != null) {
				categorie = request.getParameter("categorie");
			}
			
			try {
				lstEnchere = manager.listeEnchere(filtre,categorie);
				for( Enchere uneEnchere : lstEnchere ) {
					ArticleVendu article = manager.articleEnchere(uneEnchere.getNoArticle());
					Utilisateur util = manager.utilisateurEnchere(uneEnchere.getNoUtilisateur());
		            model = new EnchereModel(article.getNomArticle(),article.getDescription(),article.getDateDebutEncheres(),article.getDateFinEncheres(),article.getMiseAPrix(),article.getPrixVente(),util.getPseudo());
		            listeEnchereModel.add(model);
		        }
			} catch (EnchereException e) {
				request.setAttribute("erreur", e.getMessage());
			}
		}

		request.setAttribute("listeEnchere", listeEnchereModel);
		request.getRequestDispatcher("WEB-INF/AccueilNonConnecte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
