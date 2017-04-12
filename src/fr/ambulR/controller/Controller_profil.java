package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ambulR.model.ConfirmPassword;

@Controller
public class Controller_profil {

	@RequestMapping("/profil")
	public String profil(Model model) {
		ConfirmPassword user_01 = new ConfirmPassword();
		// simulation des données serveur 
		// ----------------------------------------------------
		user_01.setNom("René");
		user_01.setSexe("homme");
		// ----------------------------------------------------
		model.addAttribute("utilisateur", user_01);
		return "page_profil";
	}
	
}
