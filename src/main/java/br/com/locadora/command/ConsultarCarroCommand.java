package br.com.locadora.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConsultarCarroCommand implements Command {

	private final String pagina = "/WEB-INF/views/carros/listar.jsp";
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return pagina;
	}

}
