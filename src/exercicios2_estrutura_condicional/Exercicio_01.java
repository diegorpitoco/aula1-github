/*Fazer um programa para ler um n�mero inteiro,
 *e depois dizer se este n�mero � negativo ou n�o.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um n�mero");
		num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("N�o Negativo");
		}else {
			System.out.println("Negativo");
		}
		scan.close();
	}

}
