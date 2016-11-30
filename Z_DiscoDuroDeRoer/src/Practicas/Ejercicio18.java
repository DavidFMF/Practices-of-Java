package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		//Pedir por teclado 2 números y generar 10 aleatorios entre esos 2 números (Math.random).

		int numberA = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el primer número:"));
		int numberB = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el segundo número:"));

		for (int y = 0; y < 10; y++) {
			int numAleatorio = (int)Math.floor(Math.random() * (numberA - numberB) + numberB);
			System.out.println(numAleatorio);
		}

	}

}
