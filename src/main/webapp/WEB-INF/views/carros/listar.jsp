<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.locadora.entity.Carro" %>
    <%@page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de carros</title>
</head>
<body>

<% List<Carro> carros = (List<Carro>) request.getAttribute("carros"); %>

<% 
for(Carro carro : carros){	
%>
<h2> Placa: <%= carro.getPlaca() %></h2>
<h3> Marca: <%= carro.getMarca() %></h3>
<h3> Modelo: <%= carro.getModelo() %></h3>
<h3> Ano: <%= carro.getAno() %></h3>
<%
}
%>

<div class="div"> <a href="index.html"> Voltar </a> </div>

</body>
</html>