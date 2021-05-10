<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultat</title>
</head>
<body>
	<jsp:include page="Header.jsp"/>
	${utilisateur} a remporté l'enchère
	<jsp:include page="Resultat.jsp"/>
	<input type="submit" value="Retrait effectué">
</body>
</html>