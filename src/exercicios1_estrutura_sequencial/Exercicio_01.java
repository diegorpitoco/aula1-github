/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, soma;		
		
		System.out.println("Digíte o primeiro número");
		a = scan.nextInt();		
		System.out.println("Digíte o segundo número");
		b = scan.nextInt();
		soma = a+b; 
		
		System.out.println("O resultado da soma é "+ (a+b));
		System.out.println("soma = "+ soma );
		
		scan.close();
		
	}

}
