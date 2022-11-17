package aula04;

public class ComparacaoString {

	public static void main(String[] args) {

		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo");
		String resultado;

		if (nome1 == nome2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		if (nome1.equals(nome3)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
	}
}
