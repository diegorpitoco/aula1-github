package aplicacao;

import java.util.Scanner;

import entities.Aluguel;

public class ProgramaAluguel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[10];
		
		
		System.out.println("Quantos quartos serão alugados?");
		int n = scan.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Aluguel# "+ i +":");
			System.out.println("Name: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.println("Email");
			String email = scan.nextLine();
			System.out.println("Quarto");
			int quarto = scan.nextInt();
			vet[quarto] = new Aluguel(nome, email);			
		}
		System.out.println();
		System.out.println("Quarto ocupado");
		for (int i = 0; i < 10; i++) {
			if(vet[i] !=null) {
				System.out.println(i+": "+ vet[i]);
			}
		}
		scan.close();
	}

}
