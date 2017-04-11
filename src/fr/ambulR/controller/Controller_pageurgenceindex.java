package fr.ambulR.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ambulR.model.Connexion;

@Controller
public class Controller_pageurgenceindex {


	@RequestMapping(value = "/accueilurgenceindex")
	public String home2(@Valid @ModelAttribute("user") Connexion connexion, BindingResult result, Model model,
			HttpSession session) {
		if (!result.hasErrors()) {
	
			System.out.println("connexion :" + connexion);
			System.out.println("session :" + session);
	
				session.setAttribute("connexion", connexion);
				session.setAttribute("username", connexion.getIdentifiant());
				return "page-urgenceindex";
		
		}

		return "page_accueil";
	}


	
	
	@RequestMapping(value = "/urgenceindex")
	public String home(@Valid @ModelAttribute("user") Connexion connexion, BindingResult result, Model model,
			 HttpServletRequest req) {
	
			System.out.println("connexion :" + connexion);
			
			
			if (req.getSession().getAttribute("username") != null) {
				
				return "page-urgenceindex";
			}


		return "redirect:/accueil";
	}

}