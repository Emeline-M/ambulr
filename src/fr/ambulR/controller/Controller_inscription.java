package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ambulR.model.ConfirmPassword;

@Controller
public class Controller_inscription {

	
	
	@RequestMapping("/inscription")
	public String inscriptionUser (Model model) {
	model.addAttribute("utilisateur", new ConfirmPassword());
	System.out.println("coucouinscription");
	return "page_inscription";}
	
	
}
