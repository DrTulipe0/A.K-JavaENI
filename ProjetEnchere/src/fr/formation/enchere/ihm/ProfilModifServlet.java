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
 * Servlet implementation class ProfilModifServlet
 */
@WebServlet("/ProfilModifServlet")
public class ProfilModifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnchereInterface manager = EnchereSingl.getInstance();

    /**
     * Default constructor. 
     */
    public ProfilModifServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean verif = false;
		if (request.getParameter("pseudo") != null || request.getParameter("nom") != null || request.getParameter("prenom") != null || request.getParameter("email") != null || request.getParameter("telephone") != null || request.getParameter("rue") != null || request.getParameter("codePostal") != null || request.getParameter("ville") != null || request.getParameter("mdp") != null || request.getParameter("mdpVerif") != null || request.getParameter("mdpActuel") != null) {
			if (request.getParameter("pseudo") != "" || request.getParameter("nom") != "" || request.getParameter("prenom") != "" || request.getParameter("email") != "" || request.getParameter("telephone") != "" || request.getParameter("rue") != "" || request.getParameter("codePostal") != "" || request.getParameter("ville") != "" || request.getParameter("mdp") != "" || request.getParameter("mdpVerif") != "" || request.getParameter("mdpActuel") != "") {
				try {
					verif = manager.verifIdentifiant(request.getParameter("pseudo"),request.getParameter("mdpActuel"));
				} catch (EnchereException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(verif == true) {
					if(request.getParameter("mdp") == request.getParameter("mdpVerif")) {
						Utilisateur util = new Utilisateur(1,request.getParameter("pseudo"), request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("email"), request.getParameter("telephone"), request.getParameter("rue"), Integer.parseInt(request.getParameter("codePostal")), request.getParameter("ville"), request.getParameter("mdp"),0,false);
						try {
							manager.modifUtilisateur(util);
						} catch (EnchereException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else {
						request.setAttribute("erreur", "la confirmation du mot de passe n'est pas valide");
					}
				}
				else {
					request.setAttribute("erreur", "Le pseudo, mdp ne corresponde pas");
				}
			}
			else {
				request.setAttribute("erreur", "Au moins l'une des cases est vide");
			}
		}
		else {
			request.setAttribute("erreur", "Au moins l'une des cases est vide");
		}
		
		request.getRequestDispatcher("WEB-INF/ModifierProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
