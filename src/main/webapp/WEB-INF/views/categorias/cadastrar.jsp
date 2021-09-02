<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro categoria</title>
</head>
	<body>

	<h1>Cadastro categoria</h1>
	
	<form action="FrontController" method ="POST">
	
	<label for="nome">Nome</label>
	<input name="nome"/> <br>
	<label for="valorDiaria">Valor diária</label>
	<input name="valorDiaria"/> <br>
	<input type="hidden" name="action" value="cadastrarCategoria" />
	<button> Salvar</button>
	
	</form>

	</body>
</html>