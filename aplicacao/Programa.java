package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Conta conta;
		
		
		System.out.print("Entre com o número da conta: ");
		int numero = scan.nextInt();		
		System.out.println("Entre com o nome do titular da conta: ");
		scan.nextLine();
		String titular = scan.nextLine();
		System.out.println("Tem deposito inicial (S/N)?");
		char resposta = scan.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Digite o valor do deposito");
			double depositoInicial = scan.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println(conta);
		
		System.out.println();		
		System.out.print("Digite um valor para depósito");
		double valorDeposito = scan.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Atualização da conta");
		System.out.println(conta);
		
		System.out.println();		
		System.out.print("Digite um valor para saque");
		double valorSaque = scan.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Atualização da conta");
		System.out.println(conta);
		
		
		scan.close();

	}

}
