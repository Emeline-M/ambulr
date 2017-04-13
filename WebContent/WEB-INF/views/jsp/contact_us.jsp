<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
>


	<!--contact us-->
	<section id="contact" class="section-padding">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h2 class="ser-title">Nous contacter</h2>
				<hr class="botm-line">
			</div>
			<div class="col-md-4 col-sm-4">
				<h3>Contacts</h3>
				<div class="space"></div>
				<p>
					<i class="fa fa-map-marker fa-fw pull-left fa-2x"></i>DEFE <br>
					Notre Ville, NV 140217
				</p>
				<div class="space"></div>
				<p>
					<i class="fa fa-envelope-o fa-fw pull-left fa-2x"></i>ambulr13@gmail.com
				</p>
				<div class="space"></div>
				<p>
					<i class="fa fa-phone fa-fw pull-left fa-2x"></i>+33 0105052017
				</p>
			</div>
			<div class="col-md-8 col-sm-8 marb20">
				<div class="contact-info">
					<h3 class="cnt-ttl">Vous avez des questions?</h3>
					<div class="space"></div>
					<div id="sendmessage">Merci! Votre message a bien été envoyé!</div>
					<form action="contact" method="post" role="form"
						class="contactForm">
						<div class="form-group">
							<input type="mail" class="form-control br-radius-zero"
								name="mail" id="mail" placeholder="Votre mail" data-rule="mail"
								data-msg="Please enter a valid email" />
							<div class="validation"></div>
						</div>
						<div class="form-group">
							<textarea class="form-control br-radius-zero" name="message"
								rows="5" data-rule="required" data-msg="Redigez votre message"
								placeholder="Message"></textarea>
							<div class="validation"></div>
						</div>

						<div class="form-action">
							<button type="submit" class="btn btn-form">Envoyer</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--/ contact-->
