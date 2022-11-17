package aula04;

import java.util.Scanner;

public class VotoOpcionalOuNao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Qual é sua idade?");
		double idade = input.nextDouble();

		if (idade >= 16 && idade < 18 || idade > 70) {
			System.out.print("Voto opcional");
		} else if(idade < 16) {
			System.out.print("Sem idade para votar");
		} else {
			System.out.print("Voto obrigatorio");
		}
	}
}
