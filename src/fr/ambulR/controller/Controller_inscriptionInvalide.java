package fr.ambulR.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import fr.ambulR.dao.patientDAO;
import fr.ambulR.model.Connexion;
import fr.ambulR.model.Patient;

@Controller
public class Controller_inscriptionInvalide  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	   public void init(ServletConfig config) throws ServletException {
	      super.init(config);
	      SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	    }
	
	@Autowired
	private patientDAO patient1DAO;

	/*@RequestMapping(value = "/validation", method = RequestMethod.PATCH)
	public String modifierprofil(@ModelAttribute("utilisateur")
	Connexion connexion, Patient inscrit2, BindingResult result, Model model, HttpSession session, HttpServletRequest req, HttpSession sessionutilisateur) {
		
		System.out.println("coucouGETVAlidation");
		/*model.addAttribute("utilisateur", new Patient());	*/
		
		/*if(req.getSession().getAttribute("username") != null); {
		
			Patient patientdb = patient1DAO.findByLogin(connexion.getIdentifiant(), connexion.getPassword());
		
			System.out.println("coucouGETVAlidation2");
		
			if (!result.hasErrors() && !(inscrit2==patientdb)) {

				System.out.println("sessionutilisateur :" + sessionutilisateur);
				System.out.println("inscrit2 :" + inscrit2);

				System.out.println("coucouGETVAlidation3");
				
				sessionutilisateur.setAttribute("utilisateur2", inscrit2);
				
				inscrit2 = (Patient) this.patient1DAO.save(inscrit2);
				
				return "page_validation";
			
				} else if (!result.hasErrors() && (inscrit2==patientdb))
				{
				System.out.println("coucouGETVAlidation4");
				return "page_accueil";
			}
		
			System.out.println("Validation errors:");
			
			return "page_validation"; 
		
		}
		
	}*/
	
	
	@RequestMapping(value = "/validation", method = RequestMethod.POST)
	public String inscriptionsession(@Valid @ModelAttribute("utilisateur")
	Patient inscrit2, BindingResult result, Model model, HttpSession sessionutilisateur) {

		model.addAttribute("utilisateur", new Patient());

		if (!result.hasErrors()) {

			System.out.println("sessionutilisateur :" + sessionutilisateur);
			System.out.println("inscrit2 :" + inscrit2);

			sessionutilisateur.setAttribute("utilisateur2", inscrit2);
		

			inscrit2 = (Patient) this.patient1DAO.save(inscrit2);

			return "page_validation";
		}

		System.out.println("Validation errors:");

		return "page_inscription";
	}

	
	
}