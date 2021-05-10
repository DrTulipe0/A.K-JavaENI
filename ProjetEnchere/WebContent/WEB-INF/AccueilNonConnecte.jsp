<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<jsp:include page="Header.jsp"/>
	<form action="AccueilServlet">
		<h3>Filtres : </h3>
		<input type="text" name="Filtre" /> 
		<h4>Catégorie </h4> <select name="toute" size="4">
			<option value="Informatique">Informatique</option>
			<option value="Ammeublement">Ammeublement</option>
			<option value="Vêtement">Vêtement</option>
			<option value="Sport&Loisirs">Sport&Loisirs</option>
		</select>
		<input type="submit" value="Rechercher">
		
		<table class="lesEncheres">
			<c:forEach items="${ encheres }" var="enchere" varStatus="status">
				<h4>${enchere.cheminImage}</h4>
				<h4>${enchere.libelleArticle}</h4>
				<h4>Prix : ${enchere.montant_enchere}</h4>
				<h4>Fin de l'enchère : ${enchere.dateFin}</h4>
				<h4>Vendeur : ${enchere.vendeurEnchere}</h4>
			</c:forEach>
		</table>
	</form>
	
</body>
</html>