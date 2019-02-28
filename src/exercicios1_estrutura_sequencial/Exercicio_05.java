/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
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
		
		System.out.println("C�digo da pe�a 1");
		peca1 = scan.nextInt();
		System.out.println("Digite n�mero de pe�as");
		numPeca1 = scan.nextInt();
		System.out.println("Did�te valor da pe�as");
		valorUnitPeca1 = scan.nextDouble();
		
		vTotalPeca1 = valorUnitPeca1 * numPeca1;
		
		
		System.out.println("C�digo da pe�a 2");
		peca2 = scan.nextInt();
		System.out.println("Digite o n�mero de pe�as 2 ");
		numPeca2 = scan.nextInt();
		System.out.println("Digite o valor da pe�a 2");
		valorUnitPeca2 = scan.nextDouble();
		vTotalPeca2 = valorUnitPeca2 * numPeca2;
				
		valorTotal = vTotalPeca1 + vTotalPeca2;
		System.out.println("C�digo da pe�a"+peca1);
		System.out.println("C�digo da pe�a"+peca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		
		scan.close();
		

	}

}
