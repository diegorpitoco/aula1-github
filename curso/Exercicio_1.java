package curso;

import java.util.Locale;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo o preço é de R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, cujo o preço é de R$ %.2f %n%n", produto2, preco2);
		System.out.printf("Registro: %d anos, código %d e sexo: %c%n%n", idade, codigo, genero);		
		System.out.printf("Medição com casas decimais: %.8f%n", medida);
		System.out.printf("Arredondando(Três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f ", medida);
	}

}
