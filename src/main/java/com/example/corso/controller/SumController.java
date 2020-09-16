package com.example.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.corso.viewmodel.SumOkViewBean;

@Controller
@RequestMapping("/sum")
public class SumController {

	// URL da intercettare è /sum?a1=<numero>&a2=<numero>
	// come da consiglio vivissimo, dichiariamo comunque i parametri come String e
	// li dichiariamo non obbligatori
	@GetMapping
	public String getPage(@RequestParam(name = "a1", required = false) String a1,
			@RequestParam(name = "a2", required = false) String a2, Model model) {
		// a fronte di situazioni diverse rispondo con viste diverse
		// per esempio posso chiamare le due viste sum-ok e sum-ko
		// si usa il trattino perché il consiglio di W3C per le URL è quella di usare i
		// trattini, il cosiddetto kebab-case
		if (a1 == null || a2 == null) {
			// se non è presente una o entrambe le chiavi allora la risposta è ko
			return "sum-ko";
		}
		long l1, l2;
		try {
			l1 = Long.parseLong(a1);
			l2 = Long.parseLong(a2);
		} catch (NumberFormatException nfe) {
			return "sum-ko";
		}
		// resta da definire il viewBean di sum-ok.jsp
		// la convenzione è che la classe del viewBean ha il prefisso uguale al nome
		// della view e il suffisso ViewBean
		// Quindi il nome della class sarà per convenzione SumOkViewBean
		SumOkViewBean viewBean = new SumOkViewBean();
		viewBean.setLeft(l1);
		viewBean.setRight(l2);
		viewBean.setSum(l1 + l2);

		model.addAttribute("viewBean", viewBean);

		return "sum-ok";
	}
}
