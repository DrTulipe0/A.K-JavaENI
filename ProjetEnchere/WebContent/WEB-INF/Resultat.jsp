${enchere.cheminImage}
${enchere.libelleArticle}
Description : ${descriptionEnchere}
<c:if test = "${categorie != null}">
Cat�gorie : ${categorie}
</c:if>
Meilleur offre : ${enchere.montant_enchere}
Mise � prix : ${prixOrigine}
<c:if test = "${dateFin != null}">
Fin de l'ench�re : ${dateFin}
</c:if>
<c:if test = "${adresseRecup == 1}">
Retrait : ${adresseRecup}
</c:if>
Vendeur		${vendeur}