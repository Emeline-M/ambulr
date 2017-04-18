<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!--  
<c:out value="${utilisateur.getSexe()}" />
-->

<p></p>
<c:set var="sexe" scope="session" value="${utilisateur.getSexe()}" />

<div class="cadre_photo_profil size_picture">
	<c:if test="${sexe == 'homme'}">
		<img class="size_picture" src="/AmbulR/images/homme.png">
	</c:if>

	<c:if test="${sexe == 'femme'}">
		<img class="size_picture" src="/AmbulR/images/femme.png">
	</c:if>

</div>

<p></p>




<form:form class="container_profil" action="" method="post"
	modelAttribute="utilisateur">

	<table>

		<tr class="modified_profil">
			<td><form:label path="nom">Nom :</form:label></td>
			<td><form:input path="nom"
					class="FormControl_contactus modified_profil_size_box" type="text"
					placeholder="Saisir le nom" /></td>
			<td><form:errors path="nom" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="prenom">Prénom :</form:label></td>
			<td><form:input type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le prénom" path="prenom" /></td>
			<td><form:errors path="prenom" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="age">Age :</form:label></td>
			<td><form:input type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir l'age" path="age"></form:input></td>
			<td><form:errors path="age" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="sexe">Sexe :</form:label></td>
			<td><form:input type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le sexe" path="sexe" /></td>
			<td><form:errors path="sexe" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="adresse">Adresse :</form:label></td>
			<td><form:input type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir l'adresse" path="adresse" /></td>
			<td><form:errors path="adresse" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="tel">Numéro de telephone : </form:label></td>
			<td><form:input type="number"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le numéro de téléphone" path="tel" /></td>
			<td><form:errors path="tel" type="number" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="nomU">Nom du contact d'urgence :</form:label></td>
			<td><form:input path="nomU" type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le nom du contact d'urgence" /></td>
			<td><form:errors path="nomU" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="prenomU">Prénom du contact d'urgence :</form:label></td>
			<td><form:input type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le prénom du contact d'urgence" path="prenomU" /></td>
			<td><form:errors path="prenomU" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="telU">Numéro de telephone du contact d'urgence : </form:label></td>
			<td><form:input type="number"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le numéro de téléphone du contact d'urgence"
					path="telU" /></td>
			<td><form:errors path="telU" type="number" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="DMP">Dossier Medical Personnel :</form:label></td>
			<td><form:input type="text"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir votre Dossier Medical Personnel" path="DMP" /></td>
			<td><form:errors path="DMP" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="numSecu">Numéro de Sécurité Sociale :</form:label></td>
			<td><form:input type="number"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le numéro de sécurité sociale :" path="numSecu" /></td>
			<td><form:errors path="numSecu" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="password">password :</form:label></td>
			<td><form:input type="number"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir le mot de pass:" path="password" /></td>
			<td><form:errors path="password" /></td>
		</tr>
		<tr class="modified_profil">
			<td><form:label path="password2">Confirmer le password :</form:label></td>
			<td><form:input type="number"
					class="FormControl_contactus modified_profil_size_box"
					placeholder="Saisir de nouveau votre password" path="password2" /></td>
			<td><form:errors path="password2" /></td>
		</tr>


		<tr class="modified_profil">
			<td colspan="2"><input type="submit" value="Modifier"
				class="btn_contactus btn-default_contactus center_profil" /></td>
		</tr>
	</table>
</form:form>