package aplicacao;import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("digite o seu none:");
		aluno.aluno = scan.nextLine();
		System.out.println("digite a nota 1:");
		aluno.nota1 = scan.nextDouble();
		System.out.println("digite a nota 2:");
		aluno.nota2 = scan.nextDouble();
		System.out.println("digite a nota 3:");
		aluno.nota3 = scan.nextDouble();
		
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.somaNota());
		
		if(aluno.somaNota()<60.0) {
			System.out.println("Aluno reprovado");
			System.out.printf("Faltam %.2f pontos%n", aluno.statusAluno());
		}
		else {
			System.out.println("Aluno aprovado");
		}
		scan.close();
	}

}
