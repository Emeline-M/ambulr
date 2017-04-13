<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


	<!--banner-->
	<section id="banner" class="banner">
	<div class="bg-color">



		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="col-md-offset-3  col-md-9">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>


					<!-- menu des pages -->

					<div class="collapse navbar-collapse navbar-right">
						<ul class="nav navbar-nav">
							<li class="active"><a href="accueil">Home</a></li>
							<!-- si connecté affiche Profil et Modifier son Profil -->
							
							<c:if test="${!(username==null)}">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Profil<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="validation">Modifier son profil</a></li>
							</c:if>
							<c:if test="${username==null}">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Inscription<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="inscription">S'inscrire</a></li>
							</c:if>




							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false">Informations <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="offres">Formules</a></li>
									<li><a href="modules">Modules</a></li>
									<li><a href="temoignage">Témoignages</a></li>
								</ul></li>


							<li class=""><a href="auteurs">Qui sommes nous?</a></li>
							<li class=""><a href="urgenceindex">Urgences</a></li>
							<li class=""><a href="FAQ">FAQ</a></li>
							<li class=""><a href="pagelogout">Déconnexion</a></li>

						</ul>
					</div>
				</div>
			</div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="banner-info">
					<div class="banner-logo text-center">
						<img src="images/image.png" class="img-responsive">
					</div>
					<div class="banner-text text-center">
						<h1 class="white">Ambul'R</h1>
						<p>Une seule minute peut être décisive pour sauver une vie...
							N'attendez pas, faites le bon choix. Ambul'R. On respecte l'heure
							d'or, on respecte votre vie !</p>
						<a href="contact" class="btn btn-appoint">Contactez nous!</a>
					</div>
					<!--  
					<div class="overlay-detail text-center">
						<div class="the-icons">
							<span class="glyphicon glyphicon-chevron-down"></span>
						</div>
					</div>
				</div>
				-->
	</section>



