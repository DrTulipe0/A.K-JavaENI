package fr.formation.enchere.dal;

import fr.formation.enchere.bo.Retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetraitDAOImpl implements RetraitDAO {
	
	private static final String sqlSelectRetrait		= "select * from RETRAITS where no_article = ?";
	private static final String sqlUpdateRetrait		= "update RETRAITS set rue = ?, code_postal = ?, ville = ? where no_article = ?";
	private static final String sqlDeleteRetrait		= "delete from RETRAITS where no_article = ?";
	private static final String sqlInsertRetrait		= "insert into retrait(no_article, rue, code_postal, ville) values (?,?,?,?)";

	// Sélectionner un Retrait
	public Retrait selectRetrait(int no_article) throws DALException {
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Retrait ret = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println(connection);

			try {
				rqt = connection.prepareStatement(sqlSelectRetrait);
				rqt.setInt(1, no_article);

				rs = rqt.executeQuery();
				while (rs.next()) {
					ret = new Retrait(rs.getInt("no_article"), rs.getString("rue"), rs.getInt("code_postal"), rs.getString("ville"));
				}
			} catch (SQLException e) {
				throw new DALException("select retrait failed - ", e);
			} 
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - ", e1);
		}
		return ret;
	}
	
	//modifier un Retrait
	public Retrait updateRetrait(Retrait ret) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
		System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlUpdateRetrait);
				rqt.setInt(1, ret.getNo_article());
				rqt.setString(2, ret.getRue());
				rqt.setInt(3, ret.getCodePostal());
				rqt.setString(4, ret.getVille());
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Update coureur failed - " + ret, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + ret, e1);
		}
		return ret;
	}
	
	//insérer un Retrait
	public Retrait insertRetrait(Retrait ret) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlInsertRetrait, Statement.RETURN_GENERATED_KEYS);
				rqt.setInt(1, ret.getNo_article());
				rqt.setString(2, ret.getRue());
				rqt.setInt(3, ret.getCodePostal());
				rqt.setString(4, ret.getVille());
								
				int nbRows = rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Insert coureur failed - " + ret, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + ret, e1);
		}
		return ret;
	}
	
	//supprimer un Retrait
	public Retrait deleteRetrait(int no_article) throws DALException {
		PreparedStatement rqt = null;
		try (Connection connection = ConnectionProvider.getConnection()) {
			System.out.println("Connexion: " + connection);

			try {
				rqt = connection.prepareStatement(sqlDeleteRetrait);
				rqt.setInt(1, no_article);
				rqt.executeUpdate();
			} catch (SQLException e) {
				throw new DALException("Delete retrait failed - " + no_article, e);
			}
		} catch (SQLException e1) {
			throw new DALException("CONNEXION failed - " + no_article, e1);
		}
		return null;
	}

}
