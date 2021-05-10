<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentification</title>
</head>
<body>
	<p style="color:red">${erreur}</p>
	<form method="post" action="LoginServlet">
		<input type="text" name="login" /> 
		<input type="password" name="pass" /> 
		<input type="submit" value="Se connecter..">
	</form>
	<form method="post" action="InscriptionServlet">
		<input type="submit" value="S'enregistrer">
	</form>
</body>
</html>