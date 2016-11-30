package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Leer una cantidad de grados Cº y pasarlos a Fahrenheit: F = 32 + (9 * C/5).
		
		float grados = Float.parseFloat(JOptionPane.showInputDialog("Introduce aquí los grados Celsius:"));
		
		System.out.println("Los grados Celsius introducidos: " + grados + ", equivalen a " + (32 + (9 * grados/5)) + " grados Fahrenheit");
		
	}
	
}
