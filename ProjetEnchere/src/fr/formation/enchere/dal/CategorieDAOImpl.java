package fr.formation.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import fr.formation.enchere.bo.Categorie;
import fr.formation.enchere.dal.ConnectionProvider;

public class CategorieDAOImpl implements CategorieDAO {
	private static final String sqlSelectCategorie		= "select * from CATEGORIES";
	
	// Sélectionner les catégories
	public List<Categorie> selectCategorie() throws DALException {		
		Statement rqt = null;
		ResultSet rs = null;
		List<Categorie> liste = new ArrayList<Categorie>();
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println(connection);

			try {
				rqt = connection.createStatement();
				rs = rqt.executeQuery(sqlSelectCategorie);
				Categorie cat = null;
				while (rs.next()) {
					cat = new Categorie(rs.getInt("no_categorie"), rs.getString("libelle"));
					liste.add(cat);
				}
			} catch (SQLException e) {
				throw new DALException("selectCategories failed - ", e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - ", e1);
		}
		
		return liste;
	}

}
