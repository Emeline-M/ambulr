package fr.ambulR.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_pageGoogleAPI {

	@RequestMapping("/API_google")
	public String googlepipi(Model model) {
		return "page_googleAPI";
	}
	
	
}
