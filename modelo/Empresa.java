package br.com.alura.gerenciador.modelo;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private Date dataAbertura;
	
	public Empresa (String nome, Date dataAbertura) {
		
		this.nome = nome;
		this.dataAbertura = dataAbertura;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setId(Integer integer) {
		this.id = integer; 
		
	}

	public void setNome(String nomeEmpresa) {
		this.nome = nomeEmpresa;
		
	}

	public void setDataAbertura(Date dataAberturaEmpresa) {
		this.dataAbertura = dataAberturaEmpresa;
		
	}
	
	
	
	
}
