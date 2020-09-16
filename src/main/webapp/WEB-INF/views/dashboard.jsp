<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<c:url var="resources" value="/resources" />
<link rel="stylesheet" href="${ resources }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
	<%-- Questa istruzione per il preprocessor (Tomcat) ha come conseguenza di invocare il metodo
	     getTitle() nell'attributo identificato dal nome viewBean, così come è scritto nel 
	     Controller --%>
	<%-- Quello che scrivo tra ${ e } è uno script nell'EL (Expression Language) di JSP --%>
	<h1>${ viewBean.title }</h1>
	<%-- # è il segnaposto comunente usato quando ancora non si è decisa la URL del collegamento --%>
	<p>Sei collegato come ${ viewBean.userName }, <a href="#">cambia utente</a>.
	<%-- in EL posso concatenare le proprietà con l'operatore . --%>
	<p>Ciao ${ viewBean.user.firstName }. Il tuo cognome è ${ viewBean.user.lastName }
	    e il tuo sesso ISO è ${ viewBean.user.isoSex }.
	</div>

	<script type="text/javascript" src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript" src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript" src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
