package fr.formation.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.enchere.bll.EnchereInterface;
import fr.formation.enchere.bll.EnchereSingl;
import fr.formation.enchere.bo.Utilisateur;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnchereInterface manager = EnchereSingl.getInstance();

    /**
     * Default constructor. 
     */
    public InscriptionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("pseudo") != null || request.getParameter("nom") != null || request.getParameter("prenom") != null || request.getParameter("email") != null || request.getParameter("telephone") != null || request.getParameter("rue") != null || request.getParameter("codePostal") != null || request.getParameter("ville") != null || request.getParameter("mdp") != null || request.getParameter("mdpVerif") != null) {
			if (request.getParameter("pseudo") != "" || request.getParameter("nom") != "" || request.getParameter("prenom") != "" || request.getParameter("email") != "" || request.getParameter("telephone") != "" || request.getParameter("rue") != "" || request.getParameter("codePostal") != "" || request.getParameter("ville") != "" || request.getParameter("mdp") != "" || request.getParameter("mdpVerif") != "") {
				if(manager.existancePseudo() == false) {
					if(request.getParameter("mdp") == request.getParameter("mdpVerif")) {
						Utilisateur util = new Utilisateur(1,request.getParameter("pseudo"), request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("email"), request.getParameter("telephone"), request.getParameter("rue"), Integer.parseInt(request.getParameter("codePostal")), request.getParameter("ville"), request.getParameter("mdp"),0,false);
						manager.creationUtilisateur(util);
					}
					else {
						request.setAttribute("erreur", "la confirmation du mot de passe n'est pas valide");
					}
				}
				else {
					request.setAttribute("erreur", "Le pseudo est déja utilisé");
				}
			}
			else {
				request.setAttribute("erreur", "Au moins l'une des cases est vide");
			}
		}
		else {
			request.setAttribute("erreur", "Au moins l'une des cases est vide");
		}
		
		request.getRequestDispatcher("WEB-INF/CreationProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
