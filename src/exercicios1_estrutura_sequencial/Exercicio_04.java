/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que
recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio,
com duas casas decimais.*/
package exercicios1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
				
		int numFunc, hrTrab;
		double vHora, salario;
				
		System.out.println("Digite o n�mero do funcion�rio");
		numFunc = scan.nextInt();
		System.out.println("Horas trabalhadas");
		hrTrab = scan.nextInt();
		System.out.println("valor que recebe por hora");
		vHora = scan.nextDouble();
		
		salario = hrTrab * vHora;
		System.out.println("N�mero Funcion�rio: "+ numFunc);
		
		System.out.printf("Sal�rio R$ %.2f%n", salario);
		
		scan.close();

	}

}
