<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<h1>ENI-Enchere</h1>								<a href="url">S'inscrire - Se connecter</a>
								<h2>Liste des enchères</h2>
	<h3>Filtres : </h3>
	<input type="text" name="Filtre" /> 
	<h4>Catégorie </h4> <select name="toute" size="3">
	<%@page import="java.sql.Connection"%>
	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.PreparedStatement"%>
	<%@page import="java.sql.ResultSet"%>
	<% Connection laConnection;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		laConnection =  (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Encheres","sa","Pa$$w0rd"); 
		PreparedStatement statement = laConnection.prepareStatement("select libelle from CATEGORIES");
		try(ResultSet Rs = statement.executeQuery()) {
			while(Rs.next()){
				String categorie= Rs.getString("libelle");
	%>
	<option value="<%=categorie%>"><%=categorie%></option>
	<%
			}
		}
	}
	catch (Exception e){
		System.out.print("impossible de se connecter à la base");
		e.printStackTrace();
	} %>
	</select>
	<form action="AccueilServlet">
		<input type="radio" id="achat" name="typeTransaction" value="achat">
		<label for="achat">achat</label><br>
			<input type="checkbox" id="EnchereOuverte" name="EnchereOuverte" value="EnchereOuverte">
			<label for="EnchereOuverte"> Enchères Ouvertes</label><br>
			<input type="checkbox" id="MesEncheres" name="MesEncheres" value="MesEncheres">
			<label for="MesEncheres"> Mes Enchères</label><br>
			<input type="checkbox" id="MesEncheresGagnees" name="MesEncheresGagnees" value="MesEncheresGagnees">
			<label for="MesEncheresGagnees"> Mes Enchères Remportées</label><br><br>
		<input type="radio" id="vente" name="typeTransaction" value="vente">
		<label for="vente">vente</label><br>
			<input type="checkbox" id="VenteCours" name="VenteCours" value="VenteCours">
			<label for="VenteCours"> Mes Ventes En Cours</label><br>
			<input type="checkbox" id="VenteAttente" name="VenteAttente" value="VenteAttente">
			<label for="VenteAttente"> Ventes non débutées</label><br>
			<input type="checkbox" id="VenteTerminee" name="VenteTerminee" value="VenteTerminee">
			<label for="VenteTerminee"> Ventes Terminées</label><br><br>
	</form>
	<input type="submit" value="Rechercher">
</body>
</html>