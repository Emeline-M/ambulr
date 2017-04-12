package fr.ambulR.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.ws.spi.http.HttpContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ambulR.model.Connexion;
import fr.ambulR.model.Patient;

@Controller
public class Controller_pageurgenceindex {


	@RequestMapping(value = "/accueilurgenceindex")
	public String home2(@Valid @ModelAttribute("user") Patient connexion, BindingResult result, Model model,
			HttpSession session) {
		if (!result.hasErrors()) {
	
			System.out.println("connexion :" + connexion);
			System.out.println("session :" + session);
	
				session.setAttribute("connexion", connexion);
				session.setAttribute("username", connexion.getIdentifiant());
				session.setAttribute("id_user", connexion.getConnexion_id());
				return "page-urgenceindex";
		
		}

		return "page_accueil";
	}


	
	
	@RequestMapping(value = "/urgenceindex")
	public String home(@Valid @ModelAttribute("user") Patient connexion, BindingResult result, Model model,
			 HttpServletRequest req) {
	
			System.out.println("connexion :" + connexion);
			
			
			if (req.getSession().getAttribute("username") != null) {
				
				return "page-urgenceindex";
			}


		return "redirect:/accueil";
	}

}