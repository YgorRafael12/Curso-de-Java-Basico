package aula02;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é seu nome?");
		String nome = input.next();

		
		System.out.println("Qual foi sua nota?");
		float nota = input.nextFloat();
		
		System.out.printf("%s sua nota foi %.1f", nome, nota);
		
	}
}
