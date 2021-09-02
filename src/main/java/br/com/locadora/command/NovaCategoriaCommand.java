package br.com.locadora.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaCategoriaCommand implements Command {

	private final String pagina = "/WEB-INF/views/categorias/cadastrar.jsp";
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return pagina;
	}

}
