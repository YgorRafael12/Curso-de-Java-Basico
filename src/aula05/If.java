package aula05;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float n1 = input.nextFloat();
		float n2 = input.nextFloat();
		
		float media = (n1 + n2) / 2;
		
		System.out.println("Sua média foi " + media);
		
		if(media >= 10) {
			System.out.println("Parabéns!!"); 
		}
	}
}
