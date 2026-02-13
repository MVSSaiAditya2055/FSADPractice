package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.klu.model.Message;
import com.klu.service.MessageService;

@Controller
public class HomeController {
	@Autowired
	private MessageService messageService;
	@GetMapping("/")
	public String home(Model model) {
		Message msg=new Message(messageService.getMessage());
		model.addAttribute("message", msg);//"message" is view attribute name
		return "home";//view page where addAttribute has to be displayed //${} append content into controller (from home.html)
		//controller is sending response back to HTML page
		//RestController->Return a plain text or a JSON formatted data
		//Controller->Sends response to a HTML page or JSP page
	}
}
