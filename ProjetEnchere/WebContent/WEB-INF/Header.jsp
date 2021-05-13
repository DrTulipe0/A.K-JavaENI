<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
ENI - Ench�res
<c:if test = "${sessionScope.user != null}">
	<a href="/ProjetEnchere/AccueilServlet">Ench�res</a>
	<a href="/ProjetEnchere/EnchereCreationServlet">Vendre un article</a>
	<a href="/ProjetEnchere/ProfilServlet">Mon profil</a>
	<a href="/ProjetEnchere/LogoutServlet">D�connexion</a>
</c:if>
<c:if test = "${sessionScope.user == null}">
	<a href="/ProjetEnchere/LoginServlet">S'inscrire - se connecter ...</a>
</c:if>