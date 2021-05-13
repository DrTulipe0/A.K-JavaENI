<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
</head>
<body>
	<form action="InscriptionServlet">
		${erreur}
		<jsp:include page="Profil.jsp"/>
		<input type="submit" value="Créer">
	</form>
	<input type="submit" value="Annuler">
</body>
</html>