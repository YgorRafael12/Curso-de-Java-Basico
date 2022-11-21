package exer04;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		int a = input.nextInt();
		
		System.out.println("Informe o segundo valor");
		int b = input.nextInt();
		
		System.out.println("Informe o terceiro valor");
		int  c = input.nextInt();
		
		if (a < b + c && b < a + c && c < a + b ) {
			System.out.println("Formam um triângulo");
		} else if(a == b && b == c) {
			System.out.println("Equilátero");
		} else if(a!= b && b!= c && a!= c) {
			System.out.println("Escaleno");
		} else {
			System.out.println("Não forma um triângulo");
		}
	}
}
