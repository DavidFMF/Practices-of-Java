package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		//Aplicación con un String con una contraseña. Se pedirá introducirla con 3 intentos.
		//Si aciertas no la pedirá más y dará la bienvenida.
		
		String contraseña = "nikacoco";
		boolean acierto = false;
		
		for (int i = 0; i<= 3 && !acierto; i++){
			String entrada = JOptionPane.showInputDialog("Por favor, introduce tu contraseña para entrar:");

		
		if (entrada.equals(contraseña)){
			System.out.println("Entrada permitida");
			acierto = true;
		}
		
	}
	}
}
