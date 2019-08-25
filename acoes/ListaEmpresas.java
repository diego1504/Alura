package br.com.alura.gerenciador.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		System.out.println("Listando Empresas");
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		System.out.println(lista);
		
		request.setAttribute("listaEmpresas", lista);
		//retirado estas linhas para seguir o padrao MVC onde apenas o controller faz o direcionamento da pagina
	//	RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp") ;
	//	rd.forward(request, response);
		
		return "forward:ListaEmpresas.jsp";
		
	}
	
	
	
}
