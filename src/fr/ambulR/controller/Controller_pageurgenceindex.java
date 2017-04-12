package fr.ambulR.controller;

import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.ambulR.dao.UrgenceDAO;
import fr.ambulR.model.Connexion;
import fr.ambulR.model.Urgence_patient;

@RestController
public class Controller_pageurgenceindex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	   public void init(ServletConfig config) throws ServletException {
	      super.init(config);
	      SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	    }
	
	
	@Autowired
	private UrgenceDAO urgenceDAO;
	
	

	@RequestMapping(value = "/accueilurgenceindex")
	public String home2(@Valid @ModelAttribute("user") Connexion connexion, BindingResult result, Model model,
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
	public String home(@Valid @ModelAttribute("user") Connexion connexion, BindingResult result, Model model,
			HttpServletRequest req) {

		System.out.println("connexion :" + connexion);

		if (req.getSession().getAttribute("username") != null) {

			return "page-urgenceindex";
		}

		return "redirect:/accueil";
	}

	@RequestMapping(value = "/urgenceindex", method = RequestMethod.POST)
	public String inscription(@ModelAttribute("localisation_patient_lat") String localisation_patient_lat,
			@ModelAttribute("localisation_patient_long") String localisation_patient_long,
			@ModelAttribute("LaDateOji") Date LaDateOji, BindingResult result, Model model,
			HttpServletRequest request) {

		HttpSession session = request.getSession();
		String id_user = (String) session.getAttribute("username"); // ATTENTION
																	// IL FAUT L
																	// ID MAIS
																	// CELA NE
																	// FONCTIONNE
																	// PAS
																	// ENCORE !

		double localisation_patient_latitude = Double.parseDouble(localisation_patient_lat);
		double localisation_patient_longitude = Double.parseDouble(localisation_patient_long);
		
		System.out
				.println("Latitude : " + localisation_patient_latitude + "\n" + "Longitude : " + localisation_patient_longitude);
		System.out.println(LaDateOji);
		System.out.println(id_user);
		
		Urgence_patient urgence01 = new Urgence_patient();
		urgence01.setDate_urgence(LaDateOji);
		urgence01.setId_patient(1);
		urgence01.setLat_patient(localisation_patient_latitude);
		urgence01.setLong_patient(localisation_patient_longitude);
		urgence01.setNom("D'Amatto");
		urgence01.setPrenom_patient("Bernard");
		urgence01.setTel_patient("065475236551");
		this.urgenceDAO.save(urgence01); 
		
		

		return "page-urgenceindex";
	}

}