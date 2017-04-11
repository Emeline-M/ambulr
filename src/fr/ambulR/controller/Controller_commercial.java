package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_commercial {

	@RequestMapping("/offres")
	public String commercial(Model model) {
		return "page_commercial";
	}

}
