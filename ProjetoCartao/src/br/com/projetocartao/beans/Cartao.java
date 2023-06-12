package br.com.projetocartao.beans;

public class Cartao {

	private String portador;
	private String bandeira;
	private int numero;
	private String validade;
	private int cvv;
	
	
	public String getPortador() {
		return portador;
	}
	public String getBandeira() {
		return bandeira;
	}
	public int getNumero() {
		return numero;
	}
	public String getValidade() {
		return validade;
	}
	public int getCvv() {
		return cvv;
	}
	
	
	public void setPortador(String portador) {
		this.portador = portador;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public Cartao() {
		super();
	}
	
	public Cartao(String portador, String bandeira, int numero, String validade, int cvv) {
		super();
		this.portador = portador;
		this.bandeira = bandeira;
		this.numero = numero;
		this.validade = validade;
		this.cvv = cvv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


