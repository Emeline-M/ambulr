<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<p></p>
<div class="row">
	<div class="col-xs-2 col-xs-offset-5">
		<div class="btn-group" role="group" aria-label="...">
			<button type="button" class="btn btn-danger" onclick="getLocation()">Urgence</button>
		</div>
	</div>
</div>

<!--  
<button class="btn_googleAPI" onclick="getLocation()">Urgence</button>
-->

<p id="DefinitionModule"></p>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.2.min.js"></script>

<!-- Initialisation carte google &callback=initMap-->
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhv6k7lBa_nzY4R7wf1oPntVinuNvjOKM"
	async defer></script>

<script src="js/ambulr.js">
	
</script>









