package EjerciciosConExcepciones;

import javax.swing.JOptionPane;

public class Ejercicio21 { //TO-DO
	
	public static void main(String[] args) { //Leer un n�mero y determinar si es o no es primo.
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el n�mero"));
		
		if (n/Math.random() != 0 && n%n == 1){
			System.out.println("El numero " + n + " NO es un n� primo");
		} else
			System.out.println("El numero " + n + " es un n� primo");	
		
	}

}
