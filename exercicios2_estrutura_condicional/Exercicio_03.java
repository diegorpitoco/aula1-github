/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
números devem poder ser digitados em ordem crescente ou decrescente.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Dígite o primeiro número");
		num1 = scan.nextInt();
		System.out.println("Dígite o segundo número");
		num2 = scan.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		scan.close();
	}

}
