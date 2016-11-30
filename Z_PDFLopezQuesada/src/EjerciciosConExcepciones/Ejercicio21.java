package EjerciciosConExcepciones;

import javax.swing.JOptionPane;

public class Ejercicio21 { //TO-DO
	
	public static void main(String[] args) { //Leer un número y determinar si es o no es primo.
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el número"));
		
		if (n/Math.random() != 0 && n%n == 1){
			System.out.println("El numero " + n + " NO es un nº primo");
		} else
			System.out.println("El numero " + n + " es un nº primo");	
		
	}

}
