package fr.ambulR.controller;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.ambulR.model.ConfirmPassword;
import fr.ambulR.validator.PatientValidator;

@Controller
public class Controller_inscriptionInvalide extends HttpServlet  {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@RequestMapping("/inscription")
	public String inscriptionUser (Model model) {
	model.addAttribute("utilisateur", new ConfirmPassword()); //modelAttribute="patient" dans le jsp inscription
	return "page_inscription";
	} 

	
	
	@RequestMapping(value = "/inscription", method = RequestMethod.POST)
	public String inscription(@Valid @ModelAttribute("utilisateur") ConfirmPassword confirmPassword, BindingResult result,
			Model model) {
		   new PatientValidator().validate(confirmPassword, result);
		
		if (result.hasErrors()) {
			System.out.println("Validation errors:");
			
			return "page_inscription";
		}
		System.out.println(confirmPassword.toString()); 
		return "redirect:/page_accueil/" /*+ confirmPassword.getPrenom()*/;
	} 
	
	
	
	
}
