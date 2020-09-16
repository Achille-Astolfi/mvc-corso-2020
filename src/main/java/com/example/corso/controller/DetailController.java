package com.example.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.corso.domain.Item;
import com.example.corso.viewmodel.DetailViewBean;

@Controller
@RequestMapping("/detail")
public class DetailController {

	// La url /detail può avere una query string che mi specifica qual è il singleId
	// che io voglio rappresentare nella mia view
	// La specifica è /detail?id=<il valore del singleId>
	// Per associare la chiave id con un parametro, la prima cosa da fare è
	// dichiarare il parametro; consiglio vivamente di usare sempre String come tipo
	// del parametro per evitare errori 400 durante la conversione da String ad
	// altri tipi, per esempio numerici
	// Per comodità nostra, il nome del parametro lo scriviamo uguale al nome della
	// chiave della query string
	// Infine annotiamo il parametro con l'annotation @RequestParam; consiglio
	// vivamente di dichiarare la chiave come non obbligatoria, sempre per evitare
	// errori 400
	// Casi particolari: se la URL è /detail e basta, il valore di id è null
	// Casi particolari: se la URL è /detail?id= il valore di id è la string vuota ""
	// La normalità: se la URL è /detail?id=12345789 il valore di id è la string "12345789"
	@GetMapping
	public String getPage(@RequestParam(name = "id", required = false) String id, Model model) {
		Item mockItem = new Item();
		// non è un mock molto significativo, ma dovrebbe funzionare
		mockItem.setSingleId(id);
		mockItem.setName("Portachiavi");
		mockItem.setDescription("Portachiavi in acciaio inossidabile con moschettone, lorem ipsum dolor sit amet.");

		DetailViewBean viewBean = new DetailViewBean();
		viewBean.setItem(mockItem);

		model.addAttribute("viewBean", viewBean);

		return "detail";
	}
}
