package com.example.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.corso.domain.User;
import com.example.corso.viewmodel.DashboardViewBean;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	// se vogliamo usare un model, il modo a mio avviso più rapido per usarlo è
	// introdurre un parametro di tipo Model
	@GetMapping
	public String getPage(Model model) {
		// come si usa model? se decidiamo di usare un unico viewBean, allora la prima
		// cosa da fare è popolare il DashboardViewBean
		// Normalmente il viewBean si popola andando a orchestrare chiamate a diversi
		// Service
		DashboardViewBean viewBean = new DashboardViewBean();
		viewBean.setTitle("Titolo del cruscotto");
		viewBean.setUserName("AstolfiA");
		User user = new User();
		user.setFirstName("Achille");
		user.setLastName("Astolfi");
		user.setIsoSex(1);
		viewBean.setUser(user);
		// Infine si collega il viewBean con il model usando il metodo addAttribute con due argomenti
		// Il primo argomento è il nome che voglio dare al mio attribute, standardizziamo in viewBean
		// Il secondo è il valore che voglio trasferire alla view
		model.addAttribute("viewBean", viewBean);
		// a questo punto il controllo passa alla JSP, precisamente al preprocessor ossia Tomcat
		return "dashboard";
	}

}
