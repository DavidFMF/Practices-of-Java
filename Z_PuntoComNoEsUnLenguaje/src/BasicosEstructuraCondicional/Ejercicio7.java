package BasicosEstructuraCondicional;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {

		//Leer 2 numeros por teclado y mostrar su division. Comprobar que el divisor no sea 0.
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero aqui:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero aqui:"));
		
		if (num2 == 0)
			System.out.println("La división no se hará porque el divisor es 0");
		else
			System.out.println("La división resultante entre " + num1 + " y " + num2 + " es " + num1/num2);

	}

}
