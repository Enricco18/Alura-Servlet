<%
	String nomeEmpresa = (String) request.getAttribute("empresa");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciador - Empresa Criada</title>
</head>
<body>
 Empresa <%= nomeEmpresa %> cadastrada com sucesso!"
</body>
</html>