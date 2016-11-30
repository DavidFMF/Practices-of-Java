package EjerciciosConExcepciones;

import javax.swing.JOptionPane;

public class Ejercicio20 {
	
	/*M�todo que calcula el factorial de un n�mero*/

	public static int Factorial(double num){
		int f = 1;
		for(int i = 2; i <= num; i++){
			f = f*i;
		}
		return f;
	}
	
	public static void main(String[] args) { //Leer un n�mero y determinar su factorial.
		
		double num = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el n�mero para pasarlo a factorial"));
		
		System.out.println("El n�mero " + num + " tiene como valor factorial " + Factorial(num));
				
	}

}
