package aula06;

import java.util.Scanner;

public class Pernas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é a quantidade de pernas");
		int pernas = input.nextInt();
		
		String tipo;
		
		switch(pernas) {
		case 1: 
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4: 
			tipo = "Quadrúpede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
			break;
		}
		
		System.out.println(tipo);
	}
}
