/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a 
do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).*/
package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d, diferenca;
		
		System.out.println("Digite os valores de a, b, c e d");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		diferenca = (a*b-c*d);
		System.out.println("A diferen�a � : "+diferenca);
		
		
		scan.close();

	}

}
