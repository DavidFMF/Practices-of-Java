package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		//Pedir por teclado 2 n�meros y generar 10 aleatorios entre esos 2 n�meros (Math.random).

		int numberA = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el primer n�mero:"));
		int numberB = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el segundo n�mero:"));

		for (int y = 0; y < 10; y++) {
			int numAleatorio = (int)Math.floor(Math.random() * (numberA - numberB) + numberB);
			System.out.println(numAleatorio);
		}

	}

}
