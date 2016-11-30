package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Programa que pase una velocidad de km/h a m/s. Velocidad leída por teclado.
		
		double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la velocidad en km/h aquí:"));
		
		System.out.println("La velocidad en km/h era de: " + velocidad + ", en m/s es de: " + (velocidad * 0.28));
		
	}
	
}
