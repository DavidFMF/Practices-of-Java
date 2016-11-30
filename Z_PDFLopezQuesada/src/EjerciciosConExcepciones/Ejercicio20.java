package EjerciciosConExcepciones;

import javax.swing.JOptionPane;

public class Ejercicio20 {
	
	/*Método que calcula el factorial de un número*/

	public static int Factorial(double num){
		int f = 1;
		for(int i = 2; i <= num; i++){
			f = f*i;
		}
		return f;
	}
	
	public static void main(String[] args) { //Leer un número y determinar su factorial.
		
		double num = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el número para pasarlo a factorial"));
		
		System.out.println("El número " + num + " tiene como valor factorial " + Factorial(num));
				
	}

}
