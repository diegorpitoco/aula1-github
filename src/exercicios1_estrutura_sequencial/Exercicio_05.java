/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/
package exercicios1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		
		int peca1, peca2, numPeca1, numPeca2;
		double valorUnitPeca1, valorUnitPeca2, valorTotal, vTotalPeca1, vTotalPeca2;
		
		System.out.println("Código da peça 1");
		peca1 = scan.nextInt();
		System.out.println("Digite número de peças");
		numPeca1 = scan.nextInt();
		System.out.println("Didíte valor da peças");
		valorUnitPeca1 = scan.nextDouble();
		
		vTotalPeca1 = valorUnitPeca1 * numPeca1;
		
		
		System.out.println("Código da peça 2");
		peca2 = scan.nextInt();
		System.out.println("Digite o número de peças 2 ");
		numPeca2 = scan.nextInt();
		System.out.println("Digite o valor da peça 2");
		valorUnitPeca2 = scan.nextDouble();
		vTotalPeca2 = valorUnitPeca2 * numPeca2;
				
		valorTotal = vTotalPeca1 + vTotalPeca2;
		System.out.println("Código da peça"+peca1);
		System.out.println("Código da peça"+peca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		
		scan.close();
		

	}

}
