<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil</title>
</head>
<body>
	<form action="ProfilServlet">
		Pseudo : ${util.pseudo}
		Nom : ${util.nom}
		Prénom : ${util.prenom}
		Email : ${util.email}
		Teléphone : ${util.telephone}
		Rue : ${util.rue}
		Code Postal : ${util.codePostal}
		Ville : ${util.ville}
		<c:if test = "${pseudo == util.pseudo}">
			<input type="submit" value="Modifier">
		</c:if>
	</form>
</body>
</html>