<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




<form  method= "POST" action="urgenceindex">

	<input type="hidden" id="localisation_patient_lat" name="localisation_patient_lat" value="" />
	<input type="hidden" id="localisation_patient_long" name="localisation_patient_long" value="" />
	<input type="hidden" id="laDateOji" name="laDateOji" value="" />

	<div class="pull-right">
		<input class="btn btn-danger" type="button" value="Appel urgence"
			onclick="start()" />
	</div> 

</form>






<!-- Initialisation carte google &callback=initMap-->
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhv6k7lBa_nzY4R7wf1oPntVinuNvjOKM"
	async defer></script>

<script src="js/ambulr.js"></script>