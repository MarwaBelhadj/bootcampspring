package com.sip.ams.controlers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeControler {
 
	@PostMapping("/result")
	@ResponseBody // cette annotation te crée une fenêtre pour afficher le resulat (c'est pour tester)
	public String result(@RequestParam("nom") String n, @RequestParam("email") String e) {
		// return "<h1> ok </h1>"; //On peut écrire du code html  ou ajouter un style
		return("Votre nom saisie est : "+n + "\n votre email est le suivant :  "+e) ;
	}
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
	 return "Home/affichage"; //nom de la vue dans le projet sous le dossier templates.
 }
}
