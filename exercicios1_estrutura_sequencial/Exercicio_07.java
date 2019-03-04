/*Fazer um programa para ler três números inteiros na mesma linha, separados por espaço em branco.
Em seguida, mostrar na tela qual é o maior dos números lidos. Se houver empate, mostrar apenas um.*/

package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Dígite o primeiro número");
		n1 = scan.nextInt();
		
		System.out.println("Dígite o segundo número");
		n2 = scan.nextInt();
		
		System.out.println("Dígite o terceiro número");
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
