/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que
o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima
de 24 horas.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hrInicial, hrFinal, duracao;
		
		System.out.println("Dígite a hora inicial");
			hrInicial = scan.nextInt();
		System.out.println("Dígite a hora final");
		    hrFinal = scan.nextInt();
		    
		    if(hrInicial < hrFinal) {
		    	duracao = hrFinal - hrInicial;
		    }else {
				duracao = 24 - hrInicial + hrFinal;
			}
		    System.out.println("O jogo durou "+duracao+" horas");
		    scan.close();
	}
	

}
