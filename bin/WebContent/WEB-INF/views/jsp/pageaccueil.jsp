<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	

	
	<div class="titre">
		<h1>Ambul'R</h1>
	</div>
	<div>
		<p2>Une seule minute peut-être décisive pour sauver une vie..
		N'attendez pas, faites le bon choix. Ambul'R.. On respecte l'heure
		d'or, on respecte votre vie.</p2>
	</div>
	<ul class="ﬂex-container">
		<div class="sscont">
			<img src="projetub.gif">
		</div>
		<form:form method="post" id="connexion" action="accueilurgenceindex"
			modelAttribute="user">
			<p>Connection</p>
			<table>
				<tr>
					<td><form:label path="identifiant">Identifiant</form:label></td>
					<td><form:input path="identifiant" /></td>
					<td><form:errors path="identifiant" /></td>
				</tr>

				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password" /></td>
				</tr>
				<tr>
<td colspan="2"><input type="submit" value="Valider" /></td>
</tr>
			</table>
			
		</form:form>
		<div class="bordure"></div>
		<p>Pas encore membre?</p>
		<div class=inscription>
			<form id="connexion" action="inscription" method="get">
				<input type="submit" value="Inscription">
		</div>


		</form>

	</ul>

