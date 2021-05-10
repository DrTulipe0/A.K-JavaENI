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
		Identifiant : <input type="text" name="login" /> 
		Mot de passe : <input type="password" name="pass" />
		<input type="checkbox" id="souvenirConnexion" name="souvenirConnexion" value="souvenirConnexion">
		<label for="souvenirConnexion"> Se souvenir de moi</label><br>
		<a href="">Mot de passe oublié</a>
		<input type="submit" value="Se connecter..">
	</form>
	<form method="post" action="InscriptionServlet">
		<input type="submit" value="S'enregistrer">
	</form>
</body>
</html>