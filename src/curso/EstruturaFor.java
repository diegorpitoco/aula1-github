package curso;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números que irá digitar");
		int n = scan.nextInt();
		
		int soma = 0;
		for(int i = 1; i <= n; i++) {
			System.out.println("Valor #" + i + ": ");
			int x = scan.nextInt();
			soma += x;
		}
		
		System.out.println("Soma = "+soma);
		scan.close();
	}

}
