package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Leer 2 n�meros por teclado y mostrarlos por pantalla.
		
		int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero, por favor:"));
		int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero, por favor:"));
		
		System.out.println("Los n�meros introducidos son: " + numeroA + " y " + numeroB);
		
	}
	
}
