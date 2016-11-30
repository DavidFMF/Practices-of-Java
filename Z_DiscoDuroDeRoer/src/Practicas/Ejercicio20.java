package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		//Pedir un n� por teclado e indicar si es primo o no.

		String texto = JOptionPane.showInputDialog("Introduce aqu� tu n�mero:");
		int numero = Integer.parseInt(texto);

		// Un n�mero negativo, el 0 y el 1, son n�meros NO primos
		if (numero <= 1) {
			System.out.println("El numero " + numero + " NO es primo");
		} else {
			// Casting para que nos devuelva un n�mero entero
			int raiz = (int)Math.sqrt(numero);
			int contador = 0;

			for (int i = raiz; i > 1; i--) {
				if (numero % i == 0) {
					contador++;
				}
			}

			System.out.println(">> " + contador);
			if (contador < 1) {
				System.out.println("El n�mero " + numero + " es primo");
			} else
				System.out.println("El n�mero " + numero + " NO es primo");

		}

	}

}
