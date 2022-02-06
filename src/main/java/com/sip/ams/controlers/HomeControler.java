package com.sip.ams.controlers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
 
	@RequestMapping("/info")
	public String info(Model model) {
		String formation = "Fullstuck";
		
		ArrayList certifs = new ArrayList<>();
		certifs.add("OCA");
		certifs.add("OCP");
		certifs.add("Spring");
		certifs.add("Angular");
		model.addAttribute("certifs", certifs);
		
		model.addAttribute("workshop",formation);
		System.out.println("C'est une méthode  d'information");
	 return "Home/info";
 }
	
	@RequestMapping("/affichage") //ce que je tappe dans l'url
	public String affiche() {
		System.out.println("C'est un changement pour affichage");
	 return "Home/affichage"; //nom de la vue dans le projet
 }
}
