package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		//Aplicaci�n con un String con una contrase�a. Se pedir� introducirla con 3 intentos.
		//Si aciertas no la pedir� m�s y dar� la bienvenida.
		
		String contrase�a = "nikacoco";
		boolean acierto = false;
		
		for (int i = 0; i<= 3 && !acierto; i++){
			String entrada = JOptionPane.showInputDialog("Por favor, introduce tu contrase�a para entrar:");

		
		if (entrada.equals(contrase�a)){
			System.out.println("Entrada permitida");
			acierto = true;
		}
		
	}
	}
}
