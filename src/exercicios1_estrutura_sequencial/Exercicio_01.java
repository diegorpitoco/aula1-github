/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
mensagem explicativa, conforme exemplos.*/
package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, soma;		
		
		System.out.println("Dig�te o primeiro n�mero");
		a = scan.nextInt();		
		System.out.println("Dig�te o segundo n�mero");
		b = scan.nextInt();
		soma = a+b; 
		
		System.out.println("O resultado da soma � "+ (a+b));
		System.out.println("soma = "+ soma );
		
		scan.close();
		
	}

}
