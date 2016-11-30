package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Calcular la media de una serie de números leídos por teclado.
		
		int [] numeros = new int [5];
		int pos = 0;
		int neg = 0;
		int i = 0;
		double sumPos = 0;
		double sumNeg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lectura de los elementos del array (6): ");
		for(i = 0; i<5; i++){
			System.out.println("Numero[" + i + "]= ");
			numeros[i] = sc.nextInt();
		}
					
		for(i = 0; i<5; i++) //recorremos el array para sumar por separado positivos y negativos
			if(numeros[i] > 0){ //sumamos los numeros positivos
				sumPos += numeros [i];
			    pos++;
			}else if(numeros[i] < 0) { //sumamos los numeros negativos
			sumNeg -= numeros [i];
		    neg--;
	
			} 
		   
		if(pos!=0)
			System.out.println("Media de los valores positivos: " + sumPos / pos);
		else
			System.out.println("No se han introducido numeros positivos");
		if(neg!=0)
			System.out.println("Media de los valores negativos: " + sumNeg / pos);
		else
			System.out.println("No se han introducido valores negativos");
		    		
		sc.close();

	}

}
