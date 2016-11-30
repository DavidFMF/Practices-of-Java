package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Leer nº por teclado y mostrar por consola su doble y triple.
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número aquí:"));
		
		System.out.println("El número introducido es: " + number + ", doblado es: " + (number*2) + ", triplicado es: " + (number*3));
		
	} 
	
	
}
