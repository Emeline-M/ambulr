<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h1>Nous contacter</h1>

<ul class="flex-Crea_contactus">
	<li class="flex-Crea2_contactus">
		<form class="form-horizontal_contactus" method="POST" action="contact">
			<div class="FormeGoupe_contactus">
				<label for="mail" class="col_contactus control-label_contactus">E-mail
					<span>*</span>
				</label>
				<div class="col_contactus">
					<input type="mail" class="FormControl_contactus" id="mail"
						name="mail" value="" placeholder=""
						style="width: 500px; height: 20px;" />
				</div>
			</div>
			<div class="FormeGoupe_contactus">
				<label for="message" class="col_contactus control-label_contactus">Votre
					message <span>*</span>
				</label>
				<div class="col_contactus">
					<textarea class="FormControl_contactus" id="message" rows="3"
						name="message" placeholder="" style="width: 500px; height: 250px;"></textarea>
				</div>
			</div>
			<div class="FormeGoupe_contactus text-center_contactus">
				<button type="submit" name="envoyer" value="ok"
					class="btn_contactus btn-default_contactus">Envoyer</button>
				&nbsp;&nbsp;&nbsp; <small>* Champ obligatoire</small>
			</div>
		</form>
	</li>
</ul>