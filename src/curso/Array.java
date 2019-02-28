package curso;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de valores teste");
		int n = scan.nextInt();
		double[]vet = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			vet[i] = scan.nextDouble();			
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma +=vet[i];
		}
		
		double media = soma/n;
		System.out.printf("A média é: %.2f%n",media);
		
		
		scan.close();
	}

}
