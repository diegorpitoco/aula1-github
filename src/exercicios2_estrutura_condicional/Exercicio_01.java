/*Fazer um programa para ler um número inteiro,
 *e depois dizer se este número é negativo ou não.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um número");
		num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("Não Negativo");
		}else {
			System.out.println("Negativo");
		}
		scan.close();
	}

}
