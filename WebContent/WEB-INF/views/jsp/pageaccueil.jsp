<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="container">
	<div class="row">
		<div class="col-md-offset-3  col-md-6">
			<h3 class="ser-title">Connexion</h3>


			<form:form method="post" id="connexion" action="accueilurgenceindex"
				modelAttribute="user">

				<div class="form-group">

					<form:label path="identifiant">Identifiant</form:label>
					<form:input path="identifiant" class="form-control" type="text"
						placeholder="Saisir votre identifiant" />
					<form:errors path="identifiant" />

				</div>

				<div class="form-group">

					<form:label path="password">Password</form:label>
					<form:input path="password" class="form-control" type="text"
						placeholder="Saisir votre mot de passe" />
					<form:errors path="password" />
				</div>


				<div class="pull-right">
					<input class="btn btn-primary" type="submit" value="Valider" />
				</div>

			</form:form>
			<div class="space"></div>
			<h4 class="ser-title">Pas encore membre?</h4>
			<div class=inscription>
				<form id="connexion" action="inscription" method="get">
					<input type="submit" value="Inscription"
						class="btn btn-default btn-lg active">
				</form>
			</div>


		</div>
	</div>
</div>



