let modifAFaire = document.getElementById("DefinitionModule");





/*----------------------------------------------*/
// Fonction ------------------------------------*/
/*----------------------------------------------*/

function start(){
	// coordonée de l'hopital
	let Lat_hospital = 43.535518;
	let long_hospital = 5.441927;
	coordonneeGPS();
	document.getElementById('laDateOji').value = ObtenirDate();
	//$("#localisation_module_M1").val(position.coords.longitude);
}



function getLocation() {
	if (navigator.geolocation) {
		//navigator.geolocation.getCurrentPosition(showPosition);
		navigator.geolocation.getCurrentPosition(DefinitionDuTrajetEnFctDesModules);
		date_de_l_urgence=ObtenirDate();
	} else {
		modifAFaire.innerHTML = "Geolocation is not supported by this browser.";
	}
}


function coordonneeGPS() {
	navigator.geolocation.getCurrentPosition(showPosition);
	//console.log("test");
}

	

function showPosition(position) {
	/*modifAFaire.innerHTML = "Latitude: " + position.coords.latitude + "<br>Longitude: "
			+ position.coords.longitude;*/
	//document.getElementById('localisation_patient').value = "test";
	$("#localisation_patient_lat").val(position.coords.latitude);
	$("#localisation_patient_long").val(position.coords.longitude);
	//console.log(position.coords.latitude);
	$("form").submit();
	
}



function DefinitionDuTrajetEnFctDesModules(coordonneePatient){
	// Rayon d'action
	let distance = 30; // km
	
	// coordonée de l'hopital
	let Lat_hospital = 43.535518;
	let long_hospital = 5.441927;
	
	// Coordonnées aléatoires des modules
	let M1 = zone(Lat_hospital, long_hospital, distance);
	let M2 = zone(Lat_hospital, long_hospital, distance);
	let M3 = zone(Lat_hospital, long_hospital, distance);
	
	// Coordonnée patient
	let Lat_patient = coordonneePatient.coords.latitude;
	let long_patient = coordonneePatient.coords.longitude;
	
	// calcul du trajet aerien Module 2 patient
	let trajet_M1_Patient = DistanceEntreDeuxPoints(M1[0],M1[1],Lat_patient,long_patient);
	let trajet_M2_Patient = DistanceEntreDeuxPoints(M2[0],M2[1],Lat_patient,long_patient);
	let trajet_M3_Patient = DistanceEntreDeuxPoints(M3[0],M3[1],Lat_patient,long_patient);
	
	// calcul du trajet aerien patient 2 hospital
	let trajet_hospital_Patient = DistanceEntreDeuxPoints(Lat_hospital,long_hospital,Lat_patient,long_patient);

	// calcul total du trajet aerien
	let trajet_total_M1 = trajet_M1_Patient + trajet_hospital_Patient;
	let trajet_total_M2 = trajet_M2_Patient + trajet_hospital_Patient;
	let trajet_total_M3 = trajet_M3_Patient + trajet_hospital_Patient;
	
	// Declaration des modules
	let nomDesModules=["M1","M2","M3"]; // juste un rappel
	let distanceAParcourir=[trajet_total_M1,trajet_total_M2,trajet_total_M3]; 
	
	// Calcul du minimum
	let minimum=min(trajet_total_M1,trajet_total_M2,trajet_total_M3);

	// Recherche du module le plus rapide.
	let index = lycos(minimum,distanceAParcourir);
	
	// ecriture des coordonnées GPS des 3 voitures
	/*
	modifAFaire.innerHTML += '<p></p>';
	modifAFaire.innerHTML += "Latitude M1 : " + M1[0] + "<br>"
			+ "Longitude M1 : " + M1[1] + "<br>" + "Distance M1 à parcourir : " + trajet_total_M1;
	modifAFaire.innerHTML += '<p></p>';
	modifAFaire.innerHTML += "Latitude M2 : " + M2[0] + "<br>"
			+ "Longitude M2 : " + M2[1] + "<br>" + "Distance M2 à parcourir : " + trajet_total_M2;
	modifAFaire.innerHTML += '<p></p>';
	modifAFaire.innerHTML += "Latitude M3 : " + M3[0] + "<br>"
			+ "Longitude M3 : " + M3[1] + "<br>" + "Distance M3 à parcourir : " + trajet_total_M3;
	modifAFaire.innerHTML += '<p></p>';
	modifAFaire.innerHTML += "Module le plus rapide : " + nomDesModules[index];
	*/
	let M1_texte = "Latitude M1 : " + M1[0] + " " + "Longitude M1 : " + M1[1] + " " + "Distance M1 à parcourir : " + trajet_total_M1;
	console.log(M1_texte);
	console.log(nomDesModules[index]);
	
}





/* Fonction random */
function random(min, max) {
	let
	nb = min + (max - min + min) * Math.random();
	return nb;
}

/* fonction parametrique cercle */
function zone(cx, cy, distance_km) {
	let distance = distance_km * (360 / (6378 * Math.PI * 2));
	let
	x = cx + random(0, distance)
			* Math.cos((180 / Math.PI) * random(0, 2 * Math.PI));
	let
	y = cy + random(0, distance)
			* Math.sin((180 / Math.PI) * random(0, 2 * Math.PI));
	return [ x, y ];
}


/* calcul de la distance entre deux points */

function DistanceEntreDeuxPoints(lat_1,long_1,lat_2,long_2){
	let R = 6378; // km
	// distance angulaire
	let S = Math.acos(Math.sin(lat_1*Math.PI/180)*Math.sin(lat_2*Math.PI/180)+Math.cos(lat_1*Math.PI/180)*Math.cos(lat_2*Math.PI/180)*Math.cos(long_1*Math.PI/180-long_2*Math.PI/180));
	return S*R;
}


/* calcul de la distance entre deux points plus précis */
function getDistanceFromLatLonInKm(lat1,lon1,lat2,lon2) {
	  var R = 6371; // Radius of the earth in km
	  var dLat = deg2rad(lat2-lat1);  // deg2rad below
	  var dLon = deg2rad(lon2-lon1); 
	  var a = 
	    Math.sin(dLat/2) * Math.sin(dLat/2) +
	    Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * 
	    Math.sin(dLon/2) * Math.sin(dLon/2)
	    ; 
	  var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
	  var d = R * c; // Distance in km
	  return d;
	}

	function deg2rad(deg) {
	  return deg * (Math.PI/180)
	}

	
	/* fonction pour trouver le minimum */	
	function min(...valeurs) {
		let val_min=valeurs[0];
	    for (let i=0; i<valeurs.length; i++) {
	    	// console.log(valeurs[i]);
	    		if(val_min > valeurs[i]){
	    			val_min = valeurs[i];
	    		}
	    	};
	    	return val_min;
	}
	
	
	/* fonction pour chercher */	
	function lycos(minimum,tab){
		for (let i=0; i<tab.length; i++) {
			if(tab[i] == minimum){
				return i;
			}
		}
		return -1;
	}
	
	
	function ObtenirDate(){
		let d = new Date();
		let dateOfThisDay = new Date(d.getFullYear(),(d.getMonth()+1),d.getDate(),d.getHours(),d.getMinutes(),d.getSeconds());
		console.log(dateOfThisDay);
		return dateOfThisDay;
	}
	
	
	
/*----------------------------------------------*/
// Test API ------------------------------------*/
/*----------------------------------------------*/	
	
	
	
