/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que
recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário,
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
				
		System.out.println("Digite o número do funcionário");
		numFunc = scan.nextInt();
		System.out.println("Horas trabalhadas");
		hrTrab = scan.nextInt();
		System.out.println("valor que recebe por hora");
		vHora = scan.nextDouble();
		
		salario = hrTrab * vHora;
		System.out.println("Número Funcionário: "+ numFunc);
		
		System.out.printf("Salário R$ %.2f%n", salario);
		
		scan.close();

	}

}
