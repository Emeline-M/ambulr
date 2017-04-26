<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<script language="javascript">
	var nbclic = 0 // Initialisation à 0 du nombre de clic
	function CompteClic(formulaire) { // Fonction appelée par le bouton
		nbclic++; // nbclic+1
		if (nbclic > 1) { // Plus de 1 clic
			alert("Vous avez déjà cliqué ce bouton.\nVotre appel est en cours de traitement... Merci de patienter");
		} else { // 1 seul clic
			alert("Vous venez d'appeler les urgences");
		}
	}
</script>

<div class="container">
	<div class="row">
		<div class="col-md-offset-3  col-md-6">


			<form method="POST" action="urgenceindex">

				<input type="hidden" id="localisation_patient_lat"
					name="localisation_patient_lat" value="" /> <input type="hidden"
					id="localisation_patient_long" name="localisation_patient_long"
					value="" /> <input type="hidden" id="laDateOji" name="laDateOji"
					value="" />
				<div class="space"></div>
				<div class="col-md-offset-4  col-md-7">
					<INPUT class="btn btn-lg btn-danger" type="button" name="bouton"
						value="Appel Urgence" onClick="CompteClic(this.form)">

				</div>



			</form>






			<!-- Initialisation carte google &callback=initMap-->
			<script
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhv6k7lBa_nzY4R7wf1oPntVinuNvjOKM"
				async defer></script>

			<script src="js/ambulr.js"></script>

		</div>
	</div>
</div>


