package br.com.locadora.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.entity.Categoria;

public class CadastrarCategoriaCommand implements Command {

	private final String pagina = "/WEB-INF/views/categorias/listar.jsp";
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		var nomeCategoria = request.getParameter("nome");
		var valorDiaria = Double.parseDouble(request.getParameter("valorDiaria"));
		Categoria categoria = new Categoria(nomeCategoria, valorDiaria);
		
		System.out.println("Nome categoria: " + nomeCategoria + " | " + "Valor diária: " + valorDiaria);
		
		request.setAttribute("categorias", List.of(categoria));
		
		return pagina;
	}

}
