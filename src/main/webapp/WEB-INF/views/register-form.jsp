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
		<form action="#" method="post">
			<div class="form-group">
				<label for="firstName">Nome</label> <input type="text"
					class="form-control" id="firstName" placeholder="Il tuo nome">
			</div>
			<div class="form-group">
				<label for="lastName">Cognome</label> <input type="text"
					class="form-control" id="lastName" placeholder="Il tuo cognome">
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="isoSex"
					id="isoSex1" value="1"> <label class="form-check-label"
					for="isoSex1">maschio</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="isoSex"
					id="isoSex2" value="2"> <label class="form-check-label"
					for="isoSex2">femmina</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="isoSex"
					id="isoSex0" value="0"> <label class="form-check-label"
					for="isoSex0">preferisco non dirlo</label>
			</div>
			<div class="form-group">
				<label for="emailAddress">Email</label> <input type="email"
					class="form-control" id="emailAddress"
					placeholder="nome.cognome@example.com" aria-describedby="emailHelp">
				<small id="emailHelp" class="form-text text-muted">Non la
					condivideremo con nessuno.</small>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password"
					placeholder="Il nome del tuo animale domestico">
			</div>
			<div class="form-group">
				<label for="passwordCheck">Conferma password</label> <input
					type="password" class="form-control" id="passwordCheck"
					placeholder="Ripeti il nome del tuo animale domestico">
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="privacyConsent">
				<label class="form-check-label" for="privacyConsent">Ho
					letto e accetto l'informativa sulla privacy e le condizioni di
					servizio.</label>
			</div>
			<button type="submit" class="btn btn-primary">Registrami</button>
		</form>
	</div>
	<script type="text/javascript"
		src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript"
		src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript"
		src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
