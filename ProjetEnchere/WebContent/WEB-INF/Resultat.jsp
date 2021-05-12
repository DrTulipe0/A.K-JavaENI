${enchere.cheminImage}
${enchere.libelleArticle}
Description : ${descriptionEnchere}
<c:if test = "${categorie != null}">
Catégorie : ${categorie}
</c:if>
Meilleur offre : ${enchere.montant_enchere}
Mise à prix : ${prixOrigine}
<c:if test = "${dateFin != null}">
Fin de l'enchère : ${dateFin}
</c:if>
<c:if test = "${adresseRecup == 1}">
Retrait : ${adresseRecup}
</c:if>
Vendeur		${vendeur}