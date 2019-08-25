package br.com.alura.gerenciador.modelo;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

	//importante: para simular um banco de dados, o professor decidiu 
	// criar uma lista estaticca de moodo que a cada nova instancia eu nao perca
	// as refencias
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuarios> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static { //Bloco estatico de codigo para incluir algumas maldades sem compromisso.
		Date dtfake = new Date();
		Empresa empresa1 = new Empresa("Alura", dtfake);
		empresa1.setId(chaveSequencial++);
		Banco.lista.add(empresa1);
		
		
		Empresa empresa2 = new Empresa("Santander", dtfake);
		empresa2.setId(chaveSequencial++);
		Banco.lista.add(empresa2);
		
		Usuarios usr1 = new Usuarios();
		usr1.setLogin("dimacie");
		usr1.setSenha("123");
		
		Usuarios usr2 = new Usuarios();
		usr2.setLogin("meleron");
		usr2.setSenha("321");
		
		Banco.listaUsuarios.add(usr1);
		Banco.listaUsuarios.add(usr2);
		
		
	}

	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial);
		Banco.lista.add(empresa);
		
		
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
		
	}

	
	public void remove(Integer idEmpresaInt) {
		
		Iterator<Empresa> it = Banco.lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId() == idEmpresaInt) {
				it.remove();
			}
			
		}
		
		
	/* o codigo abaixo nao pode ser usado caso exista modificação na lista	
		for (Empresa empresa : lista) {
			if(empresa.getId() == idEmpresaInt) {
				Banco.lista.remove(empresa);
			}
		}
	*/	
		
		
	}

	public Empresa consultaEmpresa(Integer idEmpresa) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == idEmpresa) {
				return empresa;
			}
		}
		
		return null;
		
	}

	public Usuarios existeUsuario(String login, String senha) {
	
		for (Usuarios usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
			
			
		}
			
		return null;
	}
	
	
	


}
