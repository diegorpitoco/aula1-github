/*Fazer um programa para ler tr�s n�meros inteiros na mesma linha, separados por espa�o em branco.
Em seguida, mostrar na tela qual � o maior dos n�meros lidos. Se houver empate, mostrar apenas um.*/

package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("D�gite o primeiro n�mero");
		n1 = scan.nextInt();
		
		System.out.println("D�gite o segundo n�mero");
		n2 = scan.nextInt();
		
		System.out.println("D�gite o terceiro n�mero");
		n3 = scan.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println(n1);
		}
		else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
		
		scan.close();

	}

}
