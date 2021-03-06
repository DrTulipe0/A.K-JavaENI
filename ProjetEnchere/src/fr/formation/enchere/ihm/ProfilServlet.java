package fr.formation.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.enchere.bll.EnchereException;
import fr.formation.enchere.bll.EnchereInterface;
import fr.formation.enchere.bll.EnchereSingl;
import fr.formation.enchere.bo.Utilisateur;

/**
 * Servlet implementation class ProfilServlet
 */
@WebServlet("/ProfilServlet")
public class ProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnchereInterface manager = EnchereSingl.getInstance();

    /**
     * Default constructor. 
     */
    public ProfilServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numUtil;
		String pseudo = (String) request.getSession().getAttribute("login");
		Utilisateur util= new Utilisateur();
		try {
			numUtil = manager.existancePseudo(pseudo);
			util = manager.utilisateurEnchere(numUtil);
		} catch (EnchereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("pseudo", pseudo);
		request.setAttribute("util", util);
		request.getRequestDispatcher("/ProfilServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
