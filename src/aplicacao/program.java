package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a altura e a largura do retangulo");
		retangulo.altura = scan.nextDouble();
		retangulo.largura = scan.nextDouble();
		
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		scan.close();
	}

}
