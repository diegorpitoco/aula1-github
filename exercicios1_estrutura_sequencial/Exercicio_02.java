/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo
 *com quatro casas decimais conforme exemplos.*/
package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raio, area, pi=3.14159;
		
		
		System.out.println("Digite o valor do raio");
		raio = scan.nextDouble();
		
		area = (pi * (raio * raio));
		
		System.out.printf("valor da �rea deste c�rculo �: %.4f", area);
		
		
		scan.close();

	}

}
