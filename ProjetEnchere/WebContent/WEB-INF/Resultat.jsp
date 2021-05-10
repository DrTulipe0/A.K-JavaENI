${enchere.cheminImage}
${enchere.libelleArticle}
Description : ${descriptionEnchere}
<c:if test = "${categorie != null}">
Catégorie : ${categorie}
</c:if>
Meilleur offre : ${enchere.montant_enchere}
Mise à prix : 
<c:if test = "${finEnchere == 1}">
Fin de l'enchère : 
</c:if>
<c:if test = "${bonProfil == 1}">
Retrait : 
</c:if>
Vendeur