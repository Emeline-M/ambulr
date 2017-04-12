package fr.ambulR.controller;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.ambulR.dao.DroneDAO;
import fr.ambulR.dao.patientDAO;
import fr.ambulR.model.Drone;
import fr.ambulR.model.Patient;

@RestController
@RequestMapping("/api/generator")
public class generatorcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
   @Override
   public void init(ServletConfig config) throws ServletException {
      super.init(config);
      SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }
      //methode init appel�e � l'instanciation
      //on lui dit de injecter dans l'objet courant .this tous les Autowired
     
	
	
	@Autowired
	private patientDAO patientDAO ;
	
	@Autowired
	private DroneDAO droneDAO;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity generate() {
		
	
		/* CREATION D'UN PATIENT TEST */
		Patient testpatient = new Patient();
		testpatient.setConnexion_id(0);;
		testpatient.setNom("Pioline");
		testpatient.setPrenom("Cedric");
		testpatient.setAge("47");
		testpatient.setSexe("H");
		testpatient.setAdresse("15, rue de la Clinique");
		testpatient.setTel("0123456789");
		testpatient.setNomU("Bolt");
		testpatient.setPrenomU("Usain");
		testpatient.setTelU("0987654321");
		testpatient.setDMP("9698798734");
		testpatient.setNumSecu("453219728");
		testpatient.setIdentifiant("bouh");
		testpatient.setPassword("sport");
		testpatient.setAdresse_mail("emeline.mennereau@wanadoo.fr");
		testpatient.setFormule("Abonnement 1 mois");
		
		System.out.println(testpatient); 
		
		testpatient = (Patient)this.patientDAO.save(testpatient); 
		
		
	
		/* CREATION D'UN DRONE TEST */
		Drone testdrone = new Drone();
		testdrone.setLatitude("121");
		testdrone.setLongitude("100");
		testdrone.setDisponibility(true);
		testdrone.setModule("terre");
		testdrone = (Drone)this.droneDAO.save(testdrone); 
	
		return new ResponseEntity(HttpStatus.OK); 
	} 
}