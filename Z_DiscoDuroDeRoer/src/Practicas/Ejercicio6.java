package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		//Lee un n� por teclado e indica si es divisible entre 2 (resto = 0). Indicar si no lo es.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor introduce aqu� tu n�mero:"));
		
		if (numero%2 == 0)
			System.out.println("El n�mero " + numero + " es divisible entre 2");
		else
			System.out.println("El n�mero " + numero + " NO es divisible entre 2");
		
		
	}

}
