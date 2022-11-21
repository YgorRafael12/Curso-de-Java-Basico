package aula06;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade?");
		byte idade = input.nextByte();
		
		if(idade >= 16 && idade < 18 || idade >= 70) {
			System.out.println("Voto opcional");
		} else if(idade < 16) {
			System.out.println("Não pode votar");
		} else {
			System.out.println("Voto obrigatorio");
		}
	}
}
