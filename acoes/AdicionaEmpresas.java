package br.com.alura.gerenciador.acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AdicionaEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
        System.out.println("Acao!! Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		
		Date dataAberturaEmpresa = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 dataAberturaEmpresa = sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
			
		}
		
		Empresa empresa = new Empresa(nomeEmpresa, dataAberturaEmpresa);
		
		Banco bco = new Banco();
		bco.adiciona(empresa);
		System.out.println(empresa.getNome());
		

		request.setAttribute("empresa", empresa.getNome());
		//response.sendRedirect("entrada?acao=ListaEmpresas");
			
		return "redirect:entrada?acao=ListaEmpresas";
		
		
		
	}
	
	
}
