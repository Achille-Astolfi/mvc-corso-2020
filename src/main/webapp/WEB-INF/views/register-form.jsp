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
			</div>
			<div class="form-group">
				<form:label path="lastName">Cognome</form:label> <form:input
					class="form-control" path="lastName" placeholder="Il tuo cognome" />
				<form:errors path="lastName" class="text-danger"></form:errors>
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
			</div>
			<form:button type="submit" class="btn btn-primary">Registrami</form:button>
		</form:form>
	</div>
	<script type="text/javascript"
		src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript"
		src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript"
		src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
