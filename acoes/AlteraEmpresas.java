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

public class AlteraEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando Empresas");
	String nomeEmpresa = request.getParameter("nome");
	String dataEmpresa = request.getParameter("data");
	Integer idEmpresa = Integer.valueOf(request.getParameter("id"));
	
	Date dataAberturaEmpresa = null;
	try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 dataAberturaEmpresa = sdf.parse(dataEmpresa);
	} catch (ParseException e) {
		throw new ServletException(e);
		
	}
	
	System.out.println("Alterando a empresa " + idEmpresa);
	
	Banco bd = new Banco();
	
	Empresa empresa = bd.consultaEmpresa(idEmpresa);
	
	empresa.setNome(nomeEmpresa);
	empresa.setDataAbertura(dataAberturaEmpresa);
	
	//response.sendRedirect("entrada?acao=ListaEmpresas");
	
	return "redirect:entrada?acao=ListaEmpresas";
	
	}
}
