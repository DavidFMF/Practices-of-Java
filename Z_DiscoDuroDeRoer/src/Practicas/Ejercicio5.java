package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		//Crea una aplicación para mostrar el área de un círculo. El radio se pedirá por teclado.
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor, indica el radio del círculo"));
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El área de un círculo es " + area);
		
		
	}

}
