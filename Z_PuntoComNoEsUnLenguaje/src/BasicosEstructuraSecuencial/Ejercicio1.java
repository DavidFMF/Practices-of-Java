package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Leer 2 números por teclado y mostrarlos por pantalla.
		
		int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número, por favor:"));
		int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número, por favor:"));
		
		System.out.println("Los números introducidos son: " + numeroA + " y " + numeroB);
		
	}
	
}
