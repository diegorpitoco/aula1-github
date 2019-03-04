/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
package exercicios1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Dígite o primeiro valor");
		a = scan.nextDouble();
		System.out.println("Dígite o segundo valor");
		b = scan.nextDouble();
		System.out.println("Dígite o terceiro valor");
		c = scan.nextDouble();

		triangulo = (a*c)/2.0;
		
		circulo = 3.14159*(c*c);
		
		trapezio = (a+b)/2*c;
		
		quadrado = b*b;
		
		retangulo = a*b;
		
		System.out.printf("Triângulo: %.3f%n",triangulo);
		System.out.printf("Circulo: %.3f%n",circulo);
		System.out.printf("Trapézio: %.3f%n",trapezio);
		System.out.printf("Quadrado: %.3f%n",quadrado);
		System.out.printf("Retânngulo: %.3f%n",retangulo);
		
		scan.close();
		
	}

}
