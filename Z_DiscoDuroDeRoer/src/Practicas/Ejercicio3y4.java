package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio3y4 {
	
	public static void main(String[] args) {
		
		//Declarar un String con el nombre para después mostrar un mensaje de bienvenida.
		
		String nombre = JOptionPane.showInputDialog("Hola, ¿Cómo es tu nombre?");
		System.out.println("Bienvenido " + nombre);
		
	}

}
