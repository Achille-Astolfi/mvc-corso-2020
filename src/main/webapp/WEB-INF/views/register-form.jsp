<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Registrazione</title>
<c:url var="resources" value="/resources" />
<link rel="stylesheet"
	href="${ resources }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
		<form:form action="#" method="post" modelAttribute="formBean">
			<div class="form-group">
				<form:label path="firstName">Nome</form:label> <form:input
					class="form-control" path="firstName" placeholder="Il tuo nome" />
				<form:errors path="firstName" class="text-danger"></form:errors>
				<p id="firstNameMessage" class="text-danger"></p>
			</div>
			<div class="form-group">
				<form:label path="lastName">Cognome</form:label> <form:input
					class="form-control" path="lastName" placeholder="Il tuo cognome" />
				<form:errors path="lastName" class="text-danger"></form:errors>
				<p id="lastNameMessage" class="text-danger"></p>
			</div><%--
			<div class="form-check form-check-inline">
				<form:radiobutton class="form-check-input" name="isoSex"
					id="isoSex1" value="1" /> <form:label class="form-check-label"
					for="isoSex1">maschio</form:label>
			</div>
			<div class="form-check form-check-inline">
				<form:radiobutton class="form-check-input" name="isoSex"
					id="isoSex2" value="2" /> <form:label class="form-check-label"
					for="isoSex2">femmina</form:label>
			</div>
			<div class="form-check form-check-inline">
				<form:radiobutton class="form-check-input" name="isoSex"
					id="isoSex0" value="0" /> <form:label class="form-check-label"
					for="isoSex0">preferisco non dirlo</form:label>
			</div> --%>
			<div class="form-group">
				<form:label path="emailAddress">Email</form:label> <form:input type="email"
					class="form-control" path="emailAddress"
					placeholder="nome.cognome@example.com" aria-describedby="emailHelp" />
				<small id="emailHelp" class="form-text text-muted">Non la
					condivideremo con nessuno.</small>
				<form:errors path="emailAddress" class="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="password">Password</form:label> <form:password
					class="form-control" path="password"
					placeholder="Il nome del tuo animale domestico" />
				<form:errors path="password" class="text-danger"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="passwordCheck">Conferma password</form:label> <form:password
					class="form-control" path="passwordCheck"
					placeholder="Ripeti il nome del tuo animale domestico" />
				<form:errors path="passwordCheck" class="text-danger"></form:errors>
			</div>
			<div class="form-group form-check">
				<form:checkbox class="form-check-input" path="privacyConsent" />
				<form:label class="form-check-label" path="privacyConsent">Ho
					letto e accetto l'informativa sulla privacy e le condizioni di
					servizio.</form:label><br>
				<form:errors path="privacyConsent" class="text-danger"></form:errors>
				<p id="privacyConsentMessage" class="text-danger"></p>
			</div>
			<form:button type="submit" class="btn btn-primary">Registrami</form:button>
		</form:form>
		<p id="cavallo"></p>
	</div>
	<script type="text/javascript"
		src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript"
		src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript"
		src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
	<script type="text/javascript">
		// i commenti di JavaScript funzionano come quelli di C
		/* commento potenzialmente multilinea */
		// Una costruzione equivalente al metodo annotato @PostConstruct in un component Spring
		// Voglio dire a jQuery di invocare la function docReady quando il documento HTML
		// è pronto per essere "manipolato"
		// Il processor di jQuery si chiama $ come il processor delle JSP
		// capisco che si tratta del $ di jQuery perché è seguito da () anziché da {}
		// document è una parola chiave JavaScript che riferisce il documento HTML
		// il metodo ready vuole un argomento che deve essere un valore di tipo function
		// Siccome non metto le parentesi dopo docReady, io non sto invocando la function
		// in questo momento; è una sorta di "deferred invocation" che sarà eseguita quando
		// decide jQuery
		$(document).ready(docReady)
		// A questo punto ho bisogno di definire la function JavaScript docReady
		// NOTA BENE: in JavaScript le function sono valori; quando io dichiaro una function
		// in realtà sto definendo un valore JavaScript di tipo function e sto assegnando questo
		// valore a una variabile JavaScript che si chiama (in questo caso) docReady
		function docReady() {
			// jQuery funziona con $(<espressione>) quello che ottengo è un "oggetto jQuery"
			// che mi rappresenta il risultato dell'espressione e sul quale posso invocare "metodi"
			// L'espressione può essere per esempio la parola chiave document, ma molto più
			// spesso è una string che ha la stessa sintassi dei selettori CSS
			// In particolare, partiamo dalle specifiche HTML: ogni elemento HTML può avere
			// come attributo opzionale l'attributo id; è richiesto al programmatore HTML
			// che non si possono avere due elementi all'interno del documento HTML con lo stesso id.
			// Il selettore CSS che trova l'elemento HTML che ha per esempio id="cavallo"
			// è #cavallo ossia il carattere # seguito immediatamente dal valore di id.
			// Posso per esempio usare il metodo html(string) per scrivere in modo programmatico
			// del testo come contenuto dell'elemento.
			$("#cavallo").html("Questa scritta non c'è nell'HTML ma è stata aggiunta attraverso un selettore jQuery")
			// VALIDAZIONE LATO CLIENT
			// Il punto migliore da intercettare è dopo il momento tra il clic dell'utente sul pulsante "Registrami"
			// e prima che il browser impachetti la form e la spedisca alla web application.
			// Questo punto ha un nome ed è "onsubmit" (nome ufficiale dell'evento HTML)
			// Il metodo di un jQuery object che intercetta l'evento onsubmit si chiama submit
			// (generalmente: se l'evento si chiama "onabcde" il metodo jQuery si chiama abcde)
			// L'elemento HTML su cui devo invocare il metodo submit deve essere un elemento form
			// Posso individuare l'elemento form con il selettore css; nel nostro caso è #formBean
			// Il metodo submit vuole come argomento un valore function
			$("#formBean").submit(checkForm)
		}
		// la function checkForm può avere un parametro che rappresenta l'evento JavaScript che ha scatenato
		// il punto che sono andato a intercettare
		function checkForm(evt) {
//			$("#cavallo").html("Facciamo finta che ci sia stato un errore.")
			// per evitare che il browser impacchetti tutto e spedisca i dati alla Web Application
			// invoco il metodo preventDefault() sull'argomento evt
//			evt.preventDefault()
			// proviamo a fare un esempio di validazione lato client
			// vado a selezionare l'elemento input che ha come id="password"
			// recupero il valore digitato dall'utente con il metodo val() senza argomenti
			// posso assegnare l'espressione $("#password").val() a una variabile oppure la uso direttamente
			// dentro una if; la lunghezza di una string JavaScript la ottengo interrogando l'attributo length
			// (nota bene: in Java è un metodo length() in JavaScript è un attributo length)
			// Quando devo validare più di un elemento, per evitare la persistenza di vecchi messaggi di 
			// errore allora è necessario azzerare il messaggio di errore prima di validare il campo
			// corrispondente
			$("#cavallo").html("")
			if ($("#password").val().length < 8) {
				evt.preventDefault()
				$("#cavallo").html("La password deve avere almeno 8 caratteri.")
			}
			// Un problema di JavaScript è che non esiste un equivalente del metodo trim() di Java
			// Ci viene in aiuto jQuery che definisce il metodo (sintassi un po' strana)
			// $.trim(<espressione>)
			// Seleziono l'elemento input con id="firstName" e prendo il valore
			var firstName = $("#firstName").val()
			// se la lunghezza del trim è zero allora non supero la validazione
			$("#firstNameMessage").html("")
			if ($.trim(firstName).length == 0) {
				evt.preventDefault()
				$("#firstNameMessage").html("Il nome è obbligatorio")
			}
			// E così via: aggiungiamo un elemento HTML nella div del cognome e scriviamo qui sotto
			// la validazione del campo cognome
			var lastName = $("#lastName").val()
			$("#lastNameMessage").html("")
			if ($.trim(lastName).length == 0) {
				evt.preventDefault()
				$("#lastNameMessage").html("Il cognome è obbligatorio")
			}
			// Attenzione: per il checkbox abbiamo id=privacyConsent1
			// In secondo luogo, il metodo val() restituisce il valore dell'attributo value dell'input
			// In terzo luogo non esiste un metodo checked per scoprire se il checkbox è selezionato o meno
			//    Possiamo però verificare tramite un selettore se l'elemento è selezionato oppure no
			//    il selettore che mi permette di trovare l'elemento selezionato è un filtro
			//    che si chiama :checked
			//    Se l'elemento è selezionato lo trova e la sua .length è pari a 1
			//    Se l'elemento non è selezionato non lo trova e la sua .length è pari a 0
			$("#privacyConsentMessage").html("")
			if ($("#privacyConsent1:checked").length == 0) {
				evt.preventDefault()
				$("#privacyConsentMessage").html("Devi accettare le condizioni di servizio.")
			}
		}
	</script>
</body>
</html>
