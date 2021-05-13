<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<jsp:include page="Header.jsp"/>
	<form action="AccueilServletNonConnecte">
		<h3>Filtres : </h3>
		<input type="text" name="Filtre" /> 
		<h4>Catégorie </h4> <select name="categorie" size="5">
			<option value="toute">toute</option>
			<option value="Informatique">Informatique</option>
			<option value="Ammeublement">Ammeublement</option>
			<option value="Vêtement">Vêtement</option>
			<option value="Sport&Loisirs">Sport&Loisirs</option>
		</select>
		<input type="submit" value="Rechercher">
		<c:if test = "${listeEnchere[0].nomArticle != null}">
			<table class="lesEncheres">
				<c:forEach items="${ listeEnchere }" var="enchere" varStatus="status">
					<h4>${enchere.nomArticle}</h4>
					<h4>Prix : ${enchere.prixVente}</h4>
					<h4>Fin de l'enchère : ${enchere.dateFinEncheres}</h4>
					<h4>Vendeur : ${enchere.nomUtilisateur}</h4>
				</c:forEach>
			</table>
		</c:if>
	</form>
	
</body>
</html>