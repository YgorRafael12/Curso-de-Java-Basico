package aula05;

import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira ano que você nasceu");
		int nascimento = input.nextInt();
		
		int i = 2022 - nascimento;
				
		if(i >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}

}
