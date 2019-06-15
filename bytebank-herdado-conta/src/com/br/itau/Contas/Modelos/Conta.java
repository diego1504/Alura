package com.br.itau.Contas.Modelos;

/**
 * 
 * @author Diego Maciel
 * 
 *
 */

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
   
    /**
     * Construtor para iniciar uma agencia
     * 
     * @param agencia
     * @param numero
     */
    
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) {
    	if(this.saldo < valor) {
    		throw new ExcessaoGeral("Saldo Insuficiente: Saldo: " + this.saldo + ", " +
    	                            "ValorSaque: " + valor  );
    	}
    
    	this.saldo -= valor;
    }
    
    
    
    //public boolean saca(double valor) {
    //    if(this.saldo >= valor) {
    //      this.saldo -= valor;
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}

    public void transfere(double valor, Conta destino) {
        this.saca(valor) ;
        destino.deposita(valor);
        		
        
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    @Override
    public String toString() {
    	
    	return  "Numero" + this.numero;
    }
    
    
    
    
    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}