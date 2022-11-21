package aula08;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int s = 0;
		String resposta;
		
		do { 
			System.out.print("Digite um número");
			int n = input.nextInt();
			s += n;
			System.out.print("Prentede continuar");
			resposta = input.next();
			
		} while(resposta.equals("Sim"));
		
		System.out.println("A soma de todos valores é " + s);
	}
}
