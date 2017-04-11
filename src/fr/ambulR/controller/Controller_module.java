package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_module {

	@RequestMapping("/modules")
	public String module(Model model) {
		return "page_module";
	}

}
