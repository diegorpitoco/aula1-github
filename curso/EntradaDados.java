/*Ler um texto at� a quebra de linha e armazenar em uma vari�vel*/
/*Ler tr�s palavras, uma em cada linha, armazenando cada uma em uma vari�vel*/
/*Ler tr�s palavras na mesma linha, separadas por espa�o, armazenando cada uma em uma vari�vel*/

package curso;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dig�te um texto:");
		
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
