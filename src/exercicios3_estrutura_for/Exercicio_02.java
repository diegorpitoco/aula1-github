/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos
em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão
fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro
do intervalo, e "out" para fora do intervalo).*/

package exercicios3_estrutura_for;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números a serem digítados: ");
		
		int qtdnum = scan.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i= 0; i<qtdnum; i++) {
			int num = scan.nextInt();
			if (num >= 10 && num <= 20) {
				
				in = in+1;
			}
			else {
				out = out+1;
			}			
		}		
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		scan.close();
	}

}
