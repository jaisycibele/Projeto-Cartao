package br.com.projetocartao.beans;

public class CartaoDebito extends Cartao{
	
	private double debito;
	private double valorCompra;
	
	public double getDebito() {
		return debito;
	}
	public double getValorCompra() {
		return valorCompra;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}
	public void setValorCompra (double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public CartaoDebito() {
		super();
	}

	public CartaoDebito(double debito, double valorCompra) {
		super();
		this.debito = debito;
		this.valorCompra = valorCompra;
	}

	public CartaoDebito(String portador, String bandeira, int numero, String validade, int cvv, double debito, double valorCompra) {
		super(portador, bandeira, numero, validade, cvv);
		this.debito = debito;
		this.valorCompra = valorCompra;
		
	}
	
	public String identificador() {
		
		return "Cartão de débito";
	}

	public double calculoDebito() {
		if (debito >= valorCompra) {
			return (debito - valorCompra);
		}else {
			return debito;
		}}
		
	public String informacaoDebito() {
		
		if (debito >= valorCompra) {
			return "Compra efetuada com sucesso!";
		}else {
			return "Compra recusada!";
		}
	}
	
	
}
