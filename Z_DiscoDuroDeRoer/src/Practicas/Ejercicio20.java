package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		//Pedir un nº por teclado e indicar si es primo o no.

		String texto = JOptionPane.showInputDialog("Introduce aquí tu número:");
		int numero = Integer.parseInt(texto);

		// Un número negativo, el 0 y el 1, son números NO primos
		if (numero <= 1) {
			System.out.println("El numero " + numero + " NO es primo");
		} else {
			// Casting para que nos devuelva un número entero
			int raiz = (int)Math.sqrt(numero);
			int contador = 0;

			for (int i = raiz; i > 1; i--) {
				if (numero % i == 0) {
					contador++;
				}
			}

			System.out.println(">> " + contador);
			if (contador < 1) {
				System.out.println("El número " + numero + " es primo");
			} else
				System.out.println("El número " + numero + " NO es primo");

		}

	}

}
