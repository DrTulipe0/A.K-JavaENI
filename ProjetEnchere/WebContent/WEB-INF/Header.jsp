ENI - Ench�res
<c:if test = "${connectionValide == 1}">
	<a href="/ProjetEnchere/AccueilServlet">Ench�res</a>
	<a href="/ProjetEnchere/EnchereCreationServlet">Vendre un article</a>
	<a href="/ProjetEnchere/ProfilServlet">Mon profil</a>
	<a href="/ProjetEnchere/LogoutServlet">D�connexion</a>
</c:if>
<c:if test = "${connectionValide == 0}">
	<a href="/ProjetEnchere/LoginServlet">S'inscrire - se connecter ...</a>
</c:if>