<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.locadora.entity.Categoria" %>
    <%@page import="java.util.List" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de categorias</title>
</head>
<body>

<% List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias"); %>
<% 
for(Categoria categoria : categorias){	
%>
<h3> Nome categoria: <%= categoria.getNome() %></h3>
<h3> Valor: R$: <%= categoria.getValorDiaria() %></h3>
<%
}
%>

<div class="div"> <a href="index.html"> Voltar </a> </div>

</body>
</html>