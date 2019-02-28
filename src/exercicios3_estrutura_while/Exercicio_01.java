package exercicios3_estrutura_while;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a senha:");
		int senha = scan.nextInt();

		while (senha != 2002) {

			System.out.println("Senha invalida! Digite novamente!");
			senha = scan.nextInt();
		}
		System.out.println("Acesso permitido!");

		scan.close();
	}
}