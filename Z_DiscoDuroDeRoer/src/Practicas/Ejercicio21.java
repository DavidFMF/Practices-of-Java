package Practicas;

public class Ejercicio21 {

	public static void main(String[] args) {

		//Mostrar los numeros primos entre 1 y 100.

		for (int i = 1; i <= 100; i++) {
			int raiz = (int) Math.sqrt(i);
			int contador = 0;

			for (int j = raiz; j > 1; j--) {
				if (i % j == 0) {
					contador++;
				}
			}

			if (contador < 1) {
				System.out.println(i);
			}

		}
	}
}