package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		//Pedir un n� entero y positivo (controlarlo) y mostrar cu�ntas cifras tiene.

		int numero = 0;

		do {
			String texto = JOptionPane.showInputDialog("Introduce un n�mero entero y positivo, por favor:");
			numero = Integer.parseInt(texto);
		} while (numero < 0);

		int contador = 0;
		for (int i = numero; i > 0; i /= 10) {
			contador++;
		}
		
		if (contador == 1){
			System.out.println("El n�mero " + numero + " tiene " + contador + " cifra");
		}else
			System.out.println("El n�mero " + numero + " tiene " + contador + " cifras");
		
	}
}
