package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuarios;

public class AutenticaUsuario implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Autenticando + " + login);
		
		Banco bd = new Banco();
		
		Usuarios usuario = bd.existeUsuario(login, senha);
		
		if (usuario != null) {
			System.out.println("Entrou no sistema");
			HttpSession sessao = request.getSession(); //obter sessao do usuario
			sessao.setAttribute("usuarioLogado",usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		} else {
			System.out.println("Acesso negado");
			return "redirect:entrada?acao=FormLogin";
			
		}
		
		
		
	}

}
