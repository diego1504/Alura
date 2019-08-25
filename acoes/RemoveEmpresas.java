package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Removendo Empresas");
		Integer idEmpresaInt = Integer.parseInt(request.getParameter("id"));
		System.out.println(idEmpresaInt);
		
		Integer idEmpresaInt2 = Integer.valueOf(request.getParameter("id"));
		System.out.println(idEmpresaInt2);
		Banco bd = new Banco();
		
		bd.remove(idEmpresaInt);
		
		//response.sendRedirect("entrada?acao=ListaEmpresas");
		
		return "redirect:entrada?acao=ListaEmpresas";
		
	}
	

}
