package fr.formation.enchere.ihm;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.enchere.bll.EnchereException;
import fr.formation.enchere.bll.EnchereInterface;
import fr.formation.enchere.bll.EnchereSingl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnchereInterface manager = EnchereSingl.getInstance();

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String next ="WEB-INF/Login.jsp";
		request.setAttribute("locale", Locale.FRENCH);
		
		if(request.getParameter("login")!=null) {
			if(!"".equals(request.getParameter("pass"))) {
				try {
					if(manager.verifIdentifiant(request.getParameter("login"),request.getParameter("pass"))==true) {
						request.getSession().setAttribute("login", request.getParameter("login"));
						next ="/AccueilServlet";
					}
					else {
						request.setAttribute("erreur","utilisateur inconnu");
					}
				} catch (EnchereException e) {
					request.setAttribute("erreur","probleme de vérification");
				}
			}
			else {
				request.setAttribute("erreur","login impossible");
			}
		}
		request.getRequestDispatcher(next).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
