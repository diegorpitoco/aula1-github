/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Digíte um número");
		num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar");
		}
		scan.close();
	}

}
