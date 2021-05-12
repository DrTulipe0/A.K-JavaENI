package fr.formation.enchere.bll;

public class EnchereSingl {
	private static EnchereInterface instance;
	
	public static EnchereInterface getInstance() {
		if(instance == null) {
			instance = new EnchereImpl();
		}
		return instance;
	}

}
