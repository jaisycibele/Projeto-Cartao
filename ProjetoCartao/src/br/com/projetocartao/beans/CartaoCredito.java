package br.com.projetocartao.beans;

public class CartaoCredito extends Cartao {

	private double credito;
	private double valorCompra;
	
	public double getCredito() {
		return credito;
	}
	public double valorCompra() {
		return valorCompra;
	}
	
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public CartaoCredito() {
		super();
	}
	
	
	public CartaoCredito(double credito, double valorCompra) {
		super();
		this.credito = credito;
		this.valorCompra = valorCompra;
	}
	
	public CartaoCredito(String portador, String bandeira, int numero, String validade, int cvv, double credito, double valorCompra) {
		super(portador, bandeira, numero, validade, cvv);
		this.credito = credito;
		this.valorCompra = valorCompra;
	}
	
public String identificador() {
		
		return "Cartão de crédito";
	}
	
	public String informacaoCredito() {
		
		if (credito >= valorCompra) {
			return "Compra efetuada com sucesso!";
		}else {
			return "Compra recusada!";
		}
	}
	
	public double calculoCredito() {
		if (credito >= valorCompra) {
			return (credito - valorCompra);
		}else{
			return credito;
		}
	
}}
