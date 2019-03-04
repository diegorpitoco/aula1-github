package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("nome");
		funcionario.nome = scan.nextLine();
		System.out.print("Salario bruto");
		funcionario.salarioBruto = scan.nextDouble();
		System.out.print("Imposto");
		funcionario.imposto = scan.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: "+funcionario);
		System.out.println();
		System.out.println("Qual porcentual de aumento do salário?");
		double percentual = scan.nextDouble();
		funcionario.incrementoSalario(percentual);
		
		System.out.println();
		System.out.println("Update data "+funcionario);
		scan.close();
		
	}

}
