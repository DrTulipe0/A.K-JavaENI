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

/**
 * Servlet implementation class ProfilSupprimServlet
 */
@WebServlet("/ProfilSupprimServlet")
public class ProfilSupprimServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EnchereInterface manager = EnchereSingl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilSupprimServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numUtil;
		String pseudo = (String) request.getSession().getAttribute("login");
		try {
			numUtil = manager.existancePseudo(pseudo);
			manager.supprimerUtilisateur(numUtil);
		} catch (EnchereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("login", null);
		request.getRequestDispatcher("/AccueilServletNonConnecte").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
