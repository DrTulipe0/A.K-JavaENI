package fr.formation.enchere.dal;

public class DAO {
	public static EnchereDAO getCourseDAO() {
		return new EnchereDAOImpl();
	}
}
