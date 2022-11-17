package exer02;

import java.util.Scanner;

public class SuperCalculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Infome um número");
		double num = input.nextDouble();

		double restoDaDivisao = num % 2;
		System.out.println("O resto da divisão por 2 equivale a " + restoDaDivisao);

		double raizQuadrada = Math.sqrt(num);
		System.out.printf("A raiz quadrada deste número é %.2f", raizQuadrada);

		double elevadoAoCubo = Math.pow(num, 3);
		System.out.println("O valor elevado ao cubo equivale a " + elevadoAoCubo);

		double raizCubica = Math.cbrt(num);
		System.out.printf("A raiz cúbica deste número é %.2f ", raizCubica);

		System.out.println("Valor absoluto " + num);
	}
}
