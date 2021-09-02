<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Cadastro carros</h1>
	
	<form action="FrontController" method ="POST">
	
	<label for="placa">Placa</label>
	<input name="placa"/> <br>
	<label for="marca">Marca</label>
	<input name="marca"/> <br>
	<label for="modelo">Modelo</label>
	<input name="modelo"/> <br>
	<label for="ano">Ano</label>
	<input name="ano"/> <br>
	
	<input type="hidden" name="action" value="cadastrarCarro" />
	<button> Salvar</button>
	
	</form>

</body>
</html>