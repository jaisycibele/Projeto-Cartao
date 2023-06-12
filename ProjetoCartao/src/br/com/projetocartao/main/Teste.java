package br.com.projetocartao.main;

import javax.swing.JOptionPane;

import br.com.projetocartao.beans.CartaoCredito;
import br.com.projetocartao.beans.CartaoDebito;

public class Teste {
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}

	static double decimal (String j) {
	return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	static int inteiro (String j) {
	return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		String opcao = texto("Débito ou Crédito?: ");
		
		if (opcao.equalsIgnoreCase("Débito") || opcao.equalsIgnoreCase("débito")) {
		CartaoDebito objCartaoDebito = new CartaoDebito(
				texto("Nome do portador: "),
				texto("Bandeira: "),
				inteiro("Número: "),
				texto("Validade: "),
				inteiro("CVV: "),
				decimal("Saldo disponível: "),
				decimal("Valor da compra:")
				);
		System.out.println(
				objCartaoDebito.informacaoDebito()+"\nSaldo restante: " + objCartaoDebito.calculoDebito()
				);
		
		}else if (opcao.equalsIgnoreCase("Crédito") || opcao.equalsIgnoreCase("crédito")) {
		CartaoCredito objCartaoCredito = new CartaoCredito(
				texto("Nome do portador: "),
				texto("Bandeira: "),
				inteiro("Número: "),
				texto("Validade: "),
				inteiro("CVV: "),
				decimal("Limite disponível: "),
				decimal("Valor da compra:")
				);
		System.out.println(
				objCartaoCredito.informacaoCredito()+"\nLimite restante: " + objCartaoCredito.calculoCredito()
				);
		 }else{
		        System.out.println("Opção inválida");
		    }
		
		
		

	

}
}
