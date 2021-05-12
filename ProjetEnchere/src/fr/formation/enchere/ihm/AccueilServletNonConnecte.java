package fr.formation.enchere.ihm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.enchere.bll.EnchereException;
import fr.formation.enchere.bll.EnchereInterface;
import fr.formation.enchere.bll.EnchereSingl;
import fr.formation.enchere.bo.Enchere;

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
		EnchereModel model = new EnchereModel();
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
			} catch (EnchereException e) {
				request.setAttribute("erreur", e.getMessage());
			}
		}

		request.setAttribute("encheres", cheminImage);
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
