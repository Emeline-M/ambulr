<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

	<div class="container">
		<div class="col-md-offset-3  col-md-6">
				<div class="contact-info">
					<h3 class="cnt-ttl">Inscription</h3>
					<div class="space"></div>
				<form:form action="validation" method="post"
					modelAttribute="utilisateur">

					<div class="form-group">

						<form:label path="nom">Nom :</form:label>
						<form:input class="form-control" path="nom" type="text"
							placeholder="Saisir le nom" />
						<form:errors path="nom" />

					</div>

					<div class="form-group">

						<form:label path="prenom">Prénom :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Saisir le prénom" path="prenom" />
						<form:errors path="prenom" />
					</div>


					<div class="form-group">

						<form:label path="age">Age :</form:label>
						<form:input type="date" placeholder="Saisir l'age" path="age"></form:input>
						<form:errors path="age" />
					</div>


					<div class="form-group">

						<label>Choisir le sexe:</label> <select class="form-control required" name="sexe">
							<option value="H">Homme</option>
							<option value="F">Femme</option>
							<form:errors path="sexe" />
						</select>
					</div>

					<div class="form-group">

						<form:label path="adresse">Adresse :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Saisir l'adresse" path="adresse" />
						<form:errors path="adresse" />
					</div>



					<div class="form-group">
						<form:label path="tel">Numéro de telephone : </form:label>
						<form:input class="form-control" type="number"
							placeholder="Saisir le numéro de téléphone" path="tel" />
						<form:errors path="tel" type="number" />
					</div>


					<div class="form-group">

						<form:label path="nomU">Nom du contact d'urgence :</form:label>
						<form:input class="form-control" path="nomU" type="text"
							placeholder="Saisir le nom du contact d'urgence" />
						<form:errors path="nomU" />

					</div>

					<div class="form-group">


						<form:label path="prenomU">Prénom du contact d'urgence :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Saisir le prénom du contact d'urgence"
							path="prenomU" />
						<form:errors path="prenomU" />

					</div>

					<div class="form-group">

						<form:label path="telU">Numéro de telephone du contact d'urgence : </form:label>
						<form:input class="form-control" type="number"
							placeholder="Saisir le numéro de téléphone du contact d'urgence"
							path="telU" />
						<form:errors path="telU" type="number" />

					</div>


					<div class="form-group">

						<form:label path="DMP">Numéro d'identification de votre Dossier Medical Personnel :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Saisir le code du DMP" path="DMP" />
						<form:errors path="DMP" />

					</div>

					<div class="form-group">

						<form:label path="numSecu">Numéro de Sécurité Sociale :</form:label>
						<form:input class="form-control" type="number"
							placeholder="Saisir le numéro de sécurité sociale :"
							path="numSecu" />
						<form:errors path="numSecu" />

					</div>


					<div class="form-group">

						<form:label path="password">Password :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Saisir le mot de passe:" path="password" />
						<form:errors path="password" />

					</div>


					<div class="form-group">

						<form:label path="password2">Confirmer le password :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Saisir de nouveau votre mot de passe" path="password2" />
						<form:errors path="password2" />
					</div>


					<div class="form-group">

						<form:label path="identifiant">identifiant :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Entrez votre identifiant" path="identifiant" />
						<form:errors path="identifiant" />
					</div>
					
					
					<div class="form-group">

						<form:label path="adresse_mail">Adresse e-mail :</form:label>
						<form:input class="form-control" type="text"
							placeholder="Entrez votre adresse e-mail" path="adresse_mail" />
						<form:errors path="adresse_mail" />
					</div>

					<div class="form-group">

						<label>Choisir une formule:</label> <select class="required" name="formule">
							<option value="1">Abonnement 1 mois</option>
							<option value="3">Abonnement 3 mois</option>
							<option value="6">Abonnement 6 mois</option>
							<option value="12">All inclusive 12 mois</option>
							<form:errors path="formule" />
						</select>
					</div>

					<div class="pull-right">
						<input class="btn btn-primary" type="submit" value="Valider" />
					</div>
					
				</form:form>
				
			</div>
		</div>
	</div>