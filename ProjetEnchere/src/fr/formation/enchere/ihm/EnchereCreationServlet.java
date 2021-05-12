package fr.formation.enchere.ihm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.enchere.bll.EnchereException;
import fr.formation.enchere.bo.Enchere;

/**
 * Servlet implementation class EnchereCreationServlet
 */
@WebServlet("/EnchereCreationServlet")
public class EnchereCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EnchereCreationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calcul calcul = new Calcul(0,0,"");
		if (request.getParameter("a") != null) {
			Integer a = Integer.parseInt(request.getParameter("a"));
			Integer b = Integer.parseInt(request.getParameter("b"));
			String op = request.getParameter("op");
			
			calcul = new Calcul(a, b, op);
			try {
				calcul = manager.calculate(calcul);
			} catch (CalculManagerException e) {
				request.setAttribute("erreur", e.getMessage());
			}
		}

		request.setAttribute("calcul", calcul);
		request.getRequestDispatcher("WEB-INF/calcul.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
