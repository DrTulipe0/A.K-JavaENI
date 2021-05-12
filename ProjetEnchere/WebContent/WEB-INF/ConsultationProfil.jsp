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
		Pseudo : ${pseudo}
		Nom : ${nom}
		Prénom : ${prenom}
		Email : ${email}
		Teléphone : ${telephone}
		Rue : ${rue}
		Code Postal : ${codePostal}
		Ville : ${ville}
		<c:if test = "${MonProfil == 1}">
			<input type="submit" value="Modifier">
		</c:if>
	</form>
</body>
</html>