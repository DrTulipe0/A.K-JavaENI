package fr.formation.enchere.dal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

abstract public class ConnectionProvider {
	private static DataSource dataSource;
	static
	{
		Context context;
		try {
			context = new InitialContext();
			ConnectionProvider.dataSource = (DataSource)context.lookup("java:comp/env/jdbc/pool_cnx");
		} catch (NamingException e) {

		}
	}
	
	public static Connection getConnection() throws SQLException
	{
		
		// le datasource existe
		if(ConnectionProvider.dataSource!=null) {
			return ConnectionProvider.dataSource.getConnection();
		}
		// sinon connection JDBC directe via la configuration du settings.properties
		else {
			try {
				Class.forName(Settings.getProperty("driverdb"));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			Connection cnx = null;
			try{
				Class.forName(Settings.getProperty("driverdb"));
				cnx = DriverManager.getConnection(Settings.getProperty("urldb"), Settings.getProperty("userdb"), Settings.getProperty("passworddb"));
			}
			catch(SQLException e){
				throw new SQLException("Impossible d'obtenir une connexion:"+e.getMessage());
			} catch (ClassNotFoundException e) {
				throw new SQLException("Erreur : "+e.getMessage());
			}
			return cnx;			
		}
	}
}
