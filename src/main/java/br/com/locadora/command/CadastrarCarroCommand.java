package br.com.locadora.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.command.Command;
import br.com.locadora.entity.Carro;
import br.com.locadora.entity.Categoria;

public class CadastrarCarroCommand implements Command {
	
	private final String pagina = "/WEB-INF/views/carros/listar.jsp";

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		var placa = request.getParameter("placa");
		var marca = request.getParameter("marca");
		var modelo = request.getParameter("modelo");
		var ano = Integer.parseInt(request.getParameter("ano"));
		
		Carro carro = new Carro(placa, marca, modelo, ano);
		
		System.out.println("Placa: " + placa);
		System.out.println("Marca: " + marca + " | " + "Modelo: " + modelo + " | " + "Ano: " + ano);
		
		request.setAttribute("carros", List.of(carro));
		
		return pagina;
	}

}
