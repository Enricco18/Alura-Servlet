<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List, model.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciador - Lista Empresas</title>
</head>
<body>
	<h1>Lista de Empresas:</h1>
	<ul>
		<%
			List<Empresa> empresaLista = (List<Empresa>) request.getAttribute("empresas");
			for(Empresa empresa: empresaLista) {
		%>
			<li><%=empresa.getNome() %></li>
		<%
			}
		%>
	</ul>
</body>
</html>