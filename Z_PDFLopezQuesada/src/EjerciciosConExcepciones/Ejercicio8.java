package EjerciciosConExcepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	
	public static void main(String[] args) { //Leer dos n�meros y sacar el producto mediante sumas.
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el primer n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el segundo n�mero"));
		int suma = 0, cont = 1;
		
		do{
			suma = suma + numero1;
			cont++;
		} while (cont <= numero2);
		
		System.out.println("Producto = " + suma);
		
		sc.close();
		
		
		
	}

}
