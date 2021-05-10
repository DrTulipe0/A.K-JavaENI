<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création enchère</title>
</head>
<body>
			<h1>Nouvelle Vente</h1>
	Article : <input type="text" name="article" />
	Description : <input type="text" name="login" /> 
	Catégorie : <select name="toute" size="3">
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
	Photo de l'article : <input type="submit" value="UPLOADER">
	Mise à prix :
	Début de l'enchère : 
	Fin de l'enchère :
	Retrait
	Rue : 
	Code Postal :
	Ville : 
	<input type="submit" value="Enregistrer">
	<input type="submit" value="Annuler">
	<input type="submit" value="Annuler la vente">
</body>
</html>