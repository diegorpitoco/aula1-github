/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor
por linha, inclusive o X, se for o caso.*/
package exercicios3_estrutura_for;

import java.util.Scanner;

public class Exerc�cio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
