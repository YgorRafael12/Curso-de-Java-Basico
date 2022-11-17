package aula04;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		
		x = 4;
		y = 7;
		z = 12;
		
		boolean resultado;
		
		if (x < y ^ y < z) {
			resultado = true;
			System.out.println(resultado);
		} else {
			resultado = false;
			System.out.println(resultado);
		}
	}
}
