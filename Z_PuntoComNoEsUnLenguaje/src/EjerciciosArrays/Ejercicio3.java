package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Leer las notas de una clase de alumnos y calcular la media del grupo. Mostrar los alumnos con notas superiores a la media.
		
		int i = 0;
		int numAlum = 0;
		double media = 0.0;
		double suma = 0.0;
		
		Scanner sc = new Scanner(System.in);
		 
        do { //Lectura del número de alumnos. Debe ser un valor positivo
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);
        
        double notas[] = new double [numAlum];
		
		System.out.println("Introduce las notas de tus alumnos aqui:");
		for(i = 0; i < notas.length; i++){
			System.out.println("Numero: [" + i + "]= ");
			notas[i] = sc.nextInt();
		}
		
		for(i = 0; i < notas.length; i++){
			suma = suma + notas[i];	
		}
		
		media = suma / notas.length;
		
		System.out.println("La media de las notas de la clase es de " + media);
		
		System.out.println("Notas superiores a la media:");
		for(i = 0; i < notas.length;i++){
			if(notas[i] > media)
				System.out.println("El alumno " + (i+1) + " tiene una nota final de: (" + notas[i] + ")");
						
		}
		
		sc.close();

	}

}
