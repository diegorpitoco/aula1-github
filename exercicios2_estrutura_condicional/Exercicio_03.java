/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos"
ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os
n�meros devem poder ser digitados em ordem crescente ou decrescente.*/
package exercicios2_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("D�gite o primeiro n�mero");
		num1 = scan.nextInt();
		System.out.println("D�gite o segundo n�mero");
		num2 = scan.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o multiplos");
		}else {
			System.out.println("N�o s�o multiplos");
		}
		scan.close();
	}

}
