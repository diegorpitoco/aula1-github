/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.*/
package exercicios1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("D�gite o primeiro valor");
		a = scan.nextDouble();
		System.out.println("D�gite o segundo valor");
		b = scan.nextDouble();
		System.out.println("D�gite o terceiro valor");
		c = scan.nextDouble();

		triangulo = (a*c)/2.0;
		
		circulo = 3.14159*(c*c);
		
		trapezio = (a+b)/2*c;
		
		quadrado = b*b;
		
		retangulo = a*b;
		
		System.out.printf("Tri�ngulo: %.3f%n",triangulo);
		System.out.printf("Circulo: %.3f%n",circulo);
		System.out.printf("Trap�zio: %.3f%n",trapezio);
		System.out.printf("Quadrado: %.3f%n",quadrado);
		System.out.printf("Ret�nngulo: %.3f%n",retangulo);
		
		scan.close();
		
	}

}
