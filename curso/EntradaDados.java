/*Ler um texto até a quebra de linha e armazenar em uma variável*/
/*Ler três palavras, uma em cada linha, armazenando cada uma em uma variável*/
/*Ler três palavras na mesma linha, separadas por espaço, armazenando cada uma em uma variável*/

package curso;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digíte um texto:");
		
		String sentenca = scan.nextLine();
		
		String x, y, z;
		
		x = scan.next();
		
		y = scan.next();
		
		z = scan.next();
		
		
		
		System.out.println(sentenca);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = scan.next();
		
		y = scan.next();
		
		z = scan.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		scan.close();

	}

}
