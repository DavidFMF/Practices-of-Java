package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio25 {

	public static void main(String[] args) {

		//Calculadora que nos pedirá 2 operandos(int) y un signo artimético(String).
		//El resultado de las operaciones se mostrará en un cuadri de diálogo.

		double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:"));
		double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número"));
		String signo = JOptionPane.showInputDialog("Introduce el signo de operación");

		switch (signo) {
		case "+":
			System.out.println("El resultado de la suma es: " + (operando1 + operando2));
			break;
		case "-":
			System.out.println("El resultado de la resta es: " + (operando1 - operando2));
			break;
		case "*":
			System.out.println("El resultado de la multiplicacion es: " + (operando1 * operando2));
			break;
		case "/":
			System.out.println("El resultado de la division es: " + (operando1 / operando2));
			break;
		case"^":
			System.out.println("El resultado de la exponenciacion es: " + (int)Math.pow(operando1, operando2));
			break;
		case "%":
			System.out.println("El resultado del modulo es: " + (operando1 % operando2));
			break;
		}
	}

}
