package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		//Crea una aplicaci�n para mostrar el �rea de un c�rculo. El radio se pedir� por teclado.
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor, indica el radio del c�rculo"));
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El �rea de un c�rculo es " + area);
		
		
	}

}
