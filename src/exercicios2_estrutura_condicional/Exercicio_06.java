/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em
qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem
“Fora de intervalo”.*/

package exercicios2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor");
		double num = scan.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.println("intervalo [0,25]");
		} else if (num > 25 && num <= 50) {
			System.out.println("intervalo [25,50]");
		}	else if (num > 50 && num <= 75) {
			System.out.println("intervalo [50,75]");
		}else if (num > 75 && num <= 100) {
			System.out.println("intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		scan.close();
	}

}
