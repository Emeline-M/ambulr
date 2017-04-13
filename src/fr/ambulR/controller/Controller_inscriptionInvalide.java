package fr.ambulR.controller;

import javax.servlet.http.HttpSession;
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
		public class Controller_inscriptionInvalide {

			@Autowired
			private patientDAO patient1DAO;

			@RequestMapping(value = "/validation", method = RequestMethod.POST)
			public String inscriptionsession(@Valid @ModelAttribute("utilisateur") ConfirmPassword confirmPassword, Patient inscrit2, BindingResult result, Model model,
					HttpSession sessionutilisateur) {
				model.addAttribute("utilisateur", new ConfirmPassword());
				new PatientValidator().validate(confirmPassword, result);
				
				if (!result.hasErrors()) {
			
					
					System.out.println("sessionutilisateur :" + sessionutilisateur);
			
					
					sessionutilisateur.setAttribute("Patient", inscrit2);
					sessionutilisateur.setAttribute("nom", inscrit2.getNom());
					sessionutilisateur.setAttribute("prenom", inscrit2.getPrenom());
					sessionutilisateur.setAttribute("age", inscrit2.getAge());
					sessionutilisateur.setAttribute("sexe", inscrit2.getSexe());
					sessionutilisateur.setAttribute("adresse", inscrit2.getAdresse());
					sessionutilisateur.setAttribute("tel", inscrit2.getTel());
					sessionutilisateur.setAttribute("nomU", inscrit2.getNomU());
					sessionutilisateur.setAttribute("prenomU", inscrit2.getPrenomU());
					sessionutilisateur.setAttribute("telU", inscrit2.getTelU());
					sessionutilisateur.setAttribute("DMP", inscrit2.getDMP());
					sessionutilisateur.setAttribute("NumSecu", inscrit2.getNumSecu());
					sessionutilisateur.setAttribute("identifiant", inscrit2.getIdentifiant());
					sessionutilisateur.setAttribute("password", inscrit2.getPassword());
					sessionutilisateur.setAttribute("formule", inscrit2.getFormule());
					sessionutilisateur.setAttribute("adresse_mail", inscrit2.getAdresse_mail());

					
					System.out.println("Patient :" + inscrit2);
					
					inscrit2 = (Patient)this.patient1DAO.save(inscrit2);
					
						return "page_validation";
				
				}
				
				System.out.println("Validation errors:");
				
				return "page_inscription";
			}

}