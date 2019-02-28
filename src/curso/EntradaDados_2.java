/*Checklist
 * 
 * Ler um número inteiro.
 * 
 * Ler um texto até a quebra de linha.
 * 
 * Ler um caractere.
 * 
 * Ler um código composto de uma letra e um dígito (exemplo: "a3"). Armazenar os valores
 * de uma variável tipo char e outra tipo int, respectivamente.
 * 
 * Ler um número double.
 * 
 * Ler um nome (única palavra), sexo(Caractere F ou M), idade (Inteiro) e altura(double) na
 * mesma linha, armazenando-os em quatro variáveis com os devidos tipos.*/

package curso;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //35
		scan.nextLine();		
		String txt = scan.nextLine(); // João
		char genero = scan.next().charAt(0); //M
		String s = scan.next(); 
		char letra = s.charAt(0); //D
		int digito = Integer.parseInt(s.substring(1)); //B5		
		double n2 = scan.nextDouble();
		
		String name2 = scan.next();
		char ch = scan.next().charAt(0);
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		
		System.out.println(num);
		System.out.println(txt);
		System.out.println(genero);
		System.out.println(letra);
		System.out.println(digito);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(idade);
		System.out.println(altura);
		
		
		scan.close();
	}

}
