package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//Lee un n� por teclado y comprueba que es mayor o igual que cero; si no lo es lo volver� a pedir (do while).

		int numero;
		
		do {
			String texto = JOptionPane.showInputDialog("Introduce el n�mero");
			numero = Integer.parseInt(texto);
		} while (numero <= 0);
		
		System.out.println(numero);
	}

}
