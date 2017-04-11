package fr.ambulR.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ambulR.model.Connexion;

@Controller
public class Controller_logout {

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		System.out.println("session :"+session);
	
		session.invalidate();

		return "page_logout";
	}
}
