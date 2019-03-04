/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
package exercicios3_estrutura_while;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		while( x!= 0 && y!= 0) {
			if(x>0 && y>0) {
				System.out.println("primeiro");
			} else if (x<0 && y>0) {
				System.out.println("segundo");
			} else if (x<0 && y<0) {
				System.out.println("terceiro");
			}else {
				System.out.println("Quarto");
			}	
			
			 x = scan.nextDouble();
			 y = scan.nextDouble();
		}		
		scan.close();

	}

}
