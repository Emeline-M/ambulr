package fr.ambulR.controller;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ambulR.dao.patientDAO;
import fr.ambulR.model.ConfirmPassword;
import fr.ambulR.model.Patient;
import fr.ambulR.validator.PatientValidator;

@Controller
public class Controller_inscriptionInvalide extends HttpServlet  {

	@Autowired
	private patientDAO patient1DAO;

	
	private Patient inscrit2= new Patient();
	

	 
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
		
		inscrit2.getNom();
		inscrit2.getPrenom();
		inscrit2.getDateDeNaissance();
		inscrit2.getSexe();
		inscrit2.getAdresse();
		inscrit2.getTel();
		inscrit2.getNomU();
		inscrit2.getPrenomU();
		inscrit2.getTelU();
		inscrit2.getDMP();
		inscrit2.getNumSecu();
		inscrit2.getIdentifiant();
		inscrit2.getPassword();
		
		System.out.println(inscrit2); 
		
		inscrit2 = (Patient)this.patient1DAO.save(inscrit2); 
		
		return "redirect:/page_accueil/" /*+ confirmPassword.getPrenom()*/;
	} 
	
	
	
	
}