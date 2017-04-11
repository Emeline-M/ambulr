<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<p>Click the button to get your coordinates.</p>

<button onclick="getLocation()">Try It</button>

<p id="demo"></p>

<script>
var x = document.getElementById("demo");

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else { 
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    x.innerHTML = "Latitude: " + position.coords.latitude + 
    "<br>Longitude: " + position.coords.longitude;
}
</script>


<!--  
<style>
#map {
	height: 400px;
	width: 100%;
}
</style>

<h3>My Google Maps Demo</h3>
<div id="map"></div>
<script>
	function initMap() {
		var uluru = {
			lat : -25.363,
			lng : 131.044
		};
		var map = new google.maps.Map(document.getElementById('map'), {
			zoom : 4,
			center : uluru
		});
		var marker = new google.maps.Marker({
			position : uluru,
			map : map
		});
	}
	
</script>
<script async defer
	src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap">
	
</script>

-->