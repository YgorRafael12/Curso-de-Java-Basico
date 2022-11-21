package aula05;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
