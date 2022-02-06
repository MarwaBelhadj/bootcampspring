package com.sip.ams.controlers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
 
	@RequestMapping("/info")
	public String info() {
	 return "Home/info";
 }
	
	@RequestMapping("/affichage") //ce que je tappe dans l'url
	public String affiche() {
		System.out.println("C'est un changement pour affichage");
	 return "Home/affichage"; //nom de la vue dans le projet
 }
}
