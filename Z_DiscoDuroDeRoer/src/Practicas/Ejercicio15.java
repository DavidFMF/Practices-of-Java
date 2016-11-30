package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//Lee un nº por teclado y comprueba que es mayor o igual que cero; si no lo es lo volverá a pedir (do while).

		int numero;
		
		do {
			String texto = JOptionPane.showInputDialog("Introduce el número");
			numero = Integer.parseInt(texto);
		} while (numero <= 0);
		
		System.out.println(numero);
	}

}
