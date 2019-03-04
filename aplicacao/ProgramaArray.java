package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaArray {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dígite a quantidade de produtos");
		int n = scan.nextInt();		
		Produto[] vet = new Produto[n];
		
		for (int i = 0; i < vet.length; i++) {
			scan.nextLine();
			System.out.println("Digite o nome do produto:");
			String nome = scan.nextLine();
			System.out.println("Digite o preço do produto:");
			double preco = scan.nextDouble();
			vet[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i].getPreco();
		}		
		
		double media = soma/vet.length;
		
		System.out.printf("A média do preço = %.2f%n ",media);
		
		scan.close();
	}

}
