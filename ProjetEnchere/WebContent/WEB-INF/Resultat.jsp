${enchere.cheminImage}
${enchere.libelleArticle}
Description : ${descriptionEnchere}
<c:if test = "${categorie != null}">
Cat�gorie : ${categorie}
</c:if>
Meilleur offre : ${enchere.montant_enchere}
Mise � prix : 
<c:if test = "${finEnchere == 1}">
Fin de l'ench�re : 
</c:if>
<c:if test = "${bonProfil == 1}">
Retrait : 
</c:if>
Vendeur