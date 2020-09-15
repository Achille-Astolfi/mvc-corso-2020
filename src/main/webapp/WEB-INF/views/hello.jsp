<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Ciao Mondo</title>
<c:url var="resources" value="/resources" />
<link rel="stylesheet" href="${ resources }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<%-- Commento JSP che verrà rimosso dal preprocessore di Tomcat
		 Il requisito quando si usa Bootstrap è quello di dichiarare un elemento HTML div
		 con class="container" --%>
	<div class="container">
		<h3>Saluti dal Java Spring intermediate</h3>
		<p>Ciao Mondo!</p>
	</div>
	<script type="text/javascript" src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript" src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript" src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
