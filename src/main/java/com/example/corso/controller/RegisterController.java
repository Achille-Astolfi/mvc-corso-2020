package com.example.corso.controller;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.corso.viewmodel.RegisterFormBean;
import com.example.corso.viewmodel.RegisterOkViewBean;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@GetMapping
	// abbiamo bisogno di inizializzare il FormBean da passare poi alla view
	// il primo passaggio è: aggiungo il parametro Model al metodo getPage
	public String getPage(Model model) {
		// anche per il FormBean vale la convenzione generale di EL
		// ossia: i valori null sono interpretati come String vuota
		RegisterFormBean formBean = new RegisterFormBean();
		// quindi non ho particolari inizializzazioni da fare
		// giusto per farne una importante:
		formBean.setPrivacyConsent(false);
		
		// anche il viewBean va messo dentro il model con addAttribute
		model.addAttribute("formBean", formBean);
		
		return "register-form";
	}
	
	// seguendo le convenzioni, se intercetto post il metodo inizia per post
	// restituisco il nome della view, quindi termina per Page
	// public String come visibilità e tipo restituito
	// L'annotation è @PostMapping
	// Intercetto i valori impachettati dal browser con l'annotation @ModelAttribute
	@PostMapping
	public String postPage(@Valid @ModelAttribute RegisterFormBean formBean, BindingResult errors, Model model) {
		// Spring Form si preoccupa di prendere i dati inviati dal browser e di popolare
		// correttamente gli attributi di formBean
		
		// se invece qualcosa va male, per esempio
		// Il metodo Objects.equals(a, b) è l'equivalente null-pointer safe di a.equals(b)
		if (!Objects.equals(formBean.getPassword(), formBean.getPasswordCheck())) {
			// in questo caso posso decidere di "restituire" il form bean alla view
			// register-form; normalmente lo restituisco così mi è arrivato, in questo caso
			// particolare mi preoccupo di "annullare" password e passwordCheck
			formBean.setPassword(null); // se scrivo setPassword("") ottengo lo stesso risultato
			                            // per via della convenzione generale di EL
			formBean.setPasswordCheck(null);
			// adesso scrivo il mio messaggio di errore
			// errorCode dovrebbe essere scritto nella convenzione di javax.validation;
			// può andar bene la String vuota se usiamo un nostro messaggio di errore personalizzato
			errors.rejectValue("passwordCheck", "", "La conferma non coincide con la password.");
		}
		if (errors.hasErrors()) {
			// non mi devo dimenticare di mettere il formBean dentro il model!
			model.addAttribute("formBean", formBean);
			// gli errors non vengono messi automaticamente nel model, quindi devo farlo io a mano
			model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "formBean", errors);
			return "register-form";
		}
		
		
		// Un accorgimento che è da fare in questo caso specifico ed è consigliato
		// negli altri casi: non usare formBean come viewBean di register-ok
		// Eventualmente si può usare un campo di tipo RegisterFormBean in RegisterOkViewBean
		// avendo l'accortezza di "annullare" password e passwordCheck e anche mascherare
		// l'email
		RegisterOkViewBean viewBean = new RegisterOkViewBean();
		viewBean.setFirstName(formBean.getFirstName());
		String maskedEmailAddress =  formBean.getEmailAddress().replaceAll("(?<=.{3}).(?=[^@]*?@)", "*");
		viewBean.setMaskedEmailAddress(maskedEmailAddress);
		model.addAttribute("viewBean", viewBean);
		// se tutto va bene la view sarà:
		return "register-ok";
	}
}
