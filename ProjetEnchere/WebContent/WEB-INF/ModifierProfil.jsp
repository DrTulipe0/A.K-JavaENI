<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du profil</title>
</head>
<body>
	<form action="ProfilModifServlet">
		<jsp:include page="Header.jsp"/>
		<jsp:include page="Profil.jsp"/>
		Mot de passe actuel : <input type="text" name="mdpActuel" />
		Crédit : ${credit}
		<input type="submit" value="Enregistrer"> 
	</form>
	<form action="ProfilSupprimServlet">
		<input type="submit" value="Supprimer mon compte">
	</form>
</body>
</html>