package exer03;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int a = input.nextInt();
		
		System.out.println("Digite o segundo valor");
		int b = input.nextInt();
		
		System.out.println("Digite o terceiro valor");
		int c = input.nextInt();
		
		double d = Math.pow(b,2) - 4 * a * c;
		
		System.out.printf("%.1f", d);
		
		if(d < 0 ) {
			System.out.println("Não existem raizes reais");
		} else {
			System.out.println("Existem raizes reais");
		}
	}

}
