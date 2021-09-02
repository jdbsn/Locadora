package br.com.locadora.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.command.CadastrarCarroCommand;
import br.com.locadora.command.CadastrarCategoriaCommand;
import br.com.locadora.command.ConsultarCarroCommand;
import br.com.locadora.command.ConsultarCategoriaCommand;
import br.com.locadora.command.NovaCategoriaCommand;
import br.com.locadora.command.NovoCarroCommand;
import br.com.locadora.entity.Categoria;

/**
 * Servlet implementation class CategoriaServlet
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Categoria> categorias = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processRequest(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processRequest(request, response);
		
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var acao = request.getParameter("action");
		var pagina = "index.html";
				
		if(acao.equals("novaCategoria")) {
			pagina = new NovaCategoriaCommand().execute(request, response);
		}
		if(acao.equals("cadastrarCategoria")) {
			pagina = new CadastrarCategoriaCommand().execute(request, response);
		}
		if(acao.equals("consultarCategoria")) {
			pagina = new ConsultarCategoriaCommand().execute(request, response);
		}
		if(acao.equals("novoCarro")) {
			pagina = new NovoCarroCommand().execute(request, response);
		}
		if(acao.equals("cadastrarCarro")) {
			pagina = new CadastrarCarroCommand().execute(request, response);
		}
		if(acao.equals("consultarCarro")) {
			pagina = new ConsultarCarroCommand().execute(request, response);
		}
		
	request.getRequestDispatcher(pagina).forward(request, response);
}
	
}
