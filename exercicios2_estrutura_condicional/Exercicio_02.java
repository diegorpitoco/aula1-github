/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Dig�te um n�mero");
		num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("N�mero par");
		}
		else {
			System.out.println("N�mero impar");
		}
		scan.close();
	}

}
