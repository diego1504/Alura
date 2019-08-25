package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.Acao;

/**
 * Servlet Filter implementation class AutorizacaoFilter
 */
//@WebFilter("/entrada")
public class ControladorFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	@Override
	public void destroy() { }
   

	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		
		System.out.println("ControladorFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse)  servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		//importante que como é o ultimo filtro da cadeia, nao temos o dochain
		
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
	
	
	
	}

	
	
}
