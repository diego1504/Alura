package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acoes.Acao;



//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			String paramAcao = request.getParameter("acao");
			
			
			
		
			
			
			String pagina = null;
			
			String nomeDaClase = "br.com.alura.gerenciador.acoes." + paramAcao;
			
			
			try {
				Class classe = Class.forName(nomeDaClase); // carrega a classe;
				Object obj = classe.newInstance();
				Acao acao = (Acao) obj;
				pagina = acao.executa(request, response);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				
				throw new ServletException(e);
			} 
			
			String[] TipoEEndereco = pagina.split(":");
			
			
			if (TipoEEndereco[0].equals("forward"))  {
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + TipoEEndereco[1]) ;
				rd.forward(request, response);
			} else {
				response.sendRedirect(TipoEEndereco[1]);
			}
			
		/*	
			if(paramAcao.equals("ListaEmpresas")) {
				ListaEmpresas acao = new ListaEmpresas();
				pagina = acao.executa(request, response);
			} else if(paramAcao.equals("RemoveEmpresas")) {
				RemoveEmpresas acao = new RemoveEmpresas();
				pagina = acao.executa(request, response);
			} else if(paramAcao.equals("AdicionaEmpresas")) {
				AdicionaEmpresas acao = new AdicionaEmpresas();
				pagina = acao.executa(request, response);
			} else if(paramAcao.equals("AlteraEmpresas")) {
				 AlteraEmpresas acao = new AlteraEmpresas();
				 pagina = acao.executa(request, response);
			} else if(paramAcao.equals("MostraEmpresa")) {
				 MostraEmpresa acao = new MostraEmpresa();
				 pagina = acao.executa(request, response);
			} else if(paramAcao.equals("IncluirEmpresa")) {
				 IncluirEmpresa acao = new IncluirEmpresa();
				 pagina = acao.executa(request, response);
			}
			
			*/
			
			
			
			
	}

}
