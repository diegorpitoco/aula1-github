/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
 deste item. A seguir, calcule e mostre o valor da conta a pagar.
*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo, quantidade;
		double total;
		System.out.println("Dígite o código");
		codigo = scan.nextInt();
		System.out.println("Dígite a quantidade");
		quantidade = scan.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4.00;
		} 
		else if(codigo == 2) {
			total = quantidade * 4.50;
		}
		else if(codigo == 3) {
			total = quantidade * 5.00;
		}
		else if(codigo == 4) {
			total = quantidade * 2.00;
		}
		else {
			total = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n ", total);
		
		scan.close();
	}

}
