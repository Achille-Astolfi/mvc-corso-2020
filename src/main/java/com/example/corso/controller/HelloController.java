package com.example.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Annotation per identificare una class come "stampino" per un controller è:
@Controller
// Annotation per istruire Spring su qual è la path specifica da intercettare:
// Per il principio di Spring "convention over configuration" sarebbe sufficiente specificare solo l'annotation
// @RequestMapping
// Per comodità i programmatori Spring scrivono comunque in modo esplicito la path
@RequestMapping("/hello")
// Convenzione: un controller Spring termina per Controller
// Convenzione: un controller Spring inizia con il nome della path specifica che deve intercettare
public class HelloController {
	// Siccome la richiesta è per una HTTP GET per convenzione il metodo che
	// intercetta la richiesta inizia per get
	// Siccome il metodo restituisce il nome di una view, per convenzione il metodo
	// termina per Page
	// Il metodo - per specifica di Spring - restitusce String (può restituire altri
	// tipi, ma è quello più comodo)
	// Visibilità: per convenzione mettiamo public (ma va bene qualunque visibilità)
	// Elenco dei parametri: dipende da quello di cui ho bisogno, in questo caso non
	// ho bisogno di niente
	// Per dichiarare qual è la richiesta che viene intercettata dal metodo, uso
	// l'annotation specifica per la richiesta da intercettare
	// Nel mondo delle Web Application HTML posso usare @GetMapping oppure
	// @PostMapping
	@GetMapping
	public String getPage() {
		// Partiamo dal caso più semplice: hello world senza nessuna elaborazione
		// Nelle specifiche di Spring, il valore da restituire è il nome della view
		// Per convenzione, le view che vengono usate dallo stesso controller hanno lo
		// stesso prefisso del controller stesso
		// Siccome per convenzione il prefisso del controller è uguale al nome della
		// path specifica che è intercettata dal controller, il nome delle view usate
		// dallo stesso controller inizia con la path specifica intercettata dal
		// controller
		// Nel nostro caso semplicissimo, abbiamo un'unica view che possiamo chiamare
		// hello
		return "hello";
		// Per convenzione, tutte le view vengono messe nella stessa cartella che si
		// trova dentro
		// /webapp/WEB-INF/views
		// Sempre per convenzione, tutte le view hanno estensione .jsp
	}
	
}
