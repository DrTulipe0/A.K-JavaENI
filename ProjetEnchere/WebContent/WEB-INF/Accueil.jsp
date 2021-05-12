<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<jsp:include page="Header.jsp"/>
	<form action="AccueilServlet">
		<h2>Liste des enchères</h2>
		<h3>Filtres : </h3>
		<input type="text" name="Filtre" /> 
		<h4>Catégorie </h4> <select name="toute" size="5">
			<option value="toute">toute</option>
			<option value="Informatique">Informatique</option>
			<option value="Ammeublement">Ammeublement</option>
			<option value="Vêtement">Vêtement</option>
			<option value="Sport&Loisirs">Sport&Loisirs</option>
		</select>
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