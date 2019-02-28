/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos
em seguida. Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o
fora do intervalo, mostrando essas informa��es conforme exemplo (use a palavra "in" para dentro
do intervalo, e "out" para fora do intervalo).*/

package exercicios3_estrutura_for;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de n�meros a serem dig�tados: ");
		
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
