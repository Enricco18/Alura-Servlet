<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List, model.Empresa" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciador - Lista Empresas</title>
</head>
<body>
	<h1>Lista de Empresas:</h1>
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
		<li>${ empresa.nome }</li>
		</c:forEach>
	</ul>
</body>
</html>