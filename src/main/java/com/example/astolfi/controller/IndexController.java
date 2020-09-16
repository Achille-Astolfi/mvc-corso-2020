package com.example.astolfi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.ApplicationScope;

//Per convenzione si raggruppano i metodi sul "secondo elemento" della path
//Ricordo che il primo elemento è il context ed è gestito direttamente da Tomcat.
//Il controller che gestisce l'elemento /index per convenzione si chiama
//IndexController. In caso di kebab: /hello-world è gestito da HelloWorldController
//Anche qui ho due vincoli: l'annotation @Controller
@Controller
//Il package devo dichiararlo nel ComponentScan dell'oggetto config di SpringMvc
//La prima annotation da usare è @RequestMapping nella quale, come value,
//dichiaro l'elemento della path che gestisco con questo controller.
//Se voglio dichiarare degli alias, value è un array; il trucco per rispondere
//alla path / è scrivere /index.html tra gli alias.
@RequestMapping("/index-astolfi")
//Io lo consiglio sempre, ma non lo usa nessuno, lego il ciclo di vita
//del controller al ciclo di vita della Web Application
@ApplicationScope
public class IndexController {
	// con un'altra annotation lego il metodo http con un metodo Java
	// la convenzione è chiamare il metodo getPage: get perché è il metodo HTTP e page
	// perché restituisco il nome del documento HTML che in realtà è una pagina JSP
	// L'annotation per legare il metodo http GET al metodo Java è @GetMapping
	@GetMapping
	public String getPage() {
		// partiamo, giusto per partire, con un banalissimo return
		// anche qui abbiamo una convenzione: le pagine JSP che sono le VIEW corrispondenti
		// alla path index iniziano tutte per index: index index-ok index-ko index-dashboard eccetera
		// Questo è il nome della pagina JSP. Le pagine si trovano dentro /WEB-INF/views e la pagina
		// si chiama quello-che-restituisco.jsp (nel nostro caso: index.jsp).
		return "index";
	}
}
