package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        Integer idEmpresa = Integer.valueOf(request.getParameter("id"));
		
		Banco bd = new Banco();
		
		Empresa empresa = bd.consultaEmpresa(idEmpresa);
		
	
		request.setAttribute("empresa", empresa);
	
	//retirado para colocar na parte do controller central
	//	RequestDispatcher rd = request.getRequestDispatcher("/MostraEmpresas.jsp") ;
	//	rd.forward(request, response);	
		
		return "forward:MostraEmpresas.jsp";
	}

	
	
	
}
