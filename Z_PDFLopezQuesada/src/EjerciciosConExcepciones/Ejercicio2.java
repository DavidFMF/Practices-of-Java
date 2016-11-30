package EjerciciosConExcepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
class Ejercicio2Exception extends Exception{}

public class Ejercicio2{ //Leer 2 números y mostrar el producto de ellos.
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el primer número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el segundo número"));		
				
		if(numero1 <= 0){
			try{
				throw new Ejercicio2Exception();
			}catch(Ejercicio2Exception e){
				System.out.println("El número es erróneo, no se ha detectado o es igual a 0");
			}			
		}
		else{
		int resultado = numero1*numero2;
		System.out.println("El resultado del producto es " + resultado + ".");
		}
		
		sc.close();
		
	}

}
