package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Leer números por teclado hasta introducir 99. Calcular la suma, la media y cuántos son mayores que la media.
		
		ArrayList <Double> numeros = new ArrayList<Double>();
		int N;
		double media;
		
		N=cantidadNumeros();
		leerNumeros(numeros,N);
		media=calcularMedia(numeros);
		mostrarResultados(numeros,media);		

	}

	public static int cantidadNumeros() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n;
		do{
			System.out.println("Introduce qué cantidad de números quieres para trabajar (Puntuaciones comunio)");
			n=sc.nextInt();
		} while (n < 1);	
		return  n;
	}
	
	public static void leerNumeros(ArrayList<Double> a, int n){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i;
		double numeros = 0;
		for (i = 1; i <= n; i++){
			do{
				System.out.println("Valor número " + i + ": ");
				numeros = sc.nextDouble();
			} while (numeros <= 0);
			a.add(numeros);
		
		}
	}
	
	public static double calcularMedia(ArrayList<Double> a){
		
		double media = 0;
		for (Double d : a) {
			media = media + d;
		}
		return media / a.size();
		
	}
	
	public static void mostrarResultados(ArrayList<Double> a, double media){
		
		int superior = 0, inferior = 0;
		System.out.println("Números introducidos: ");
		System.out.println(a);
		for (Double d : a) {
			if (d > media)
				superior++;
			else if (d < media)
				inferior++;
		}
		System.out.printf("Media: %.2f %n", media);
		System.out.println("Hay " + superior + " números introducidos más altos que la media");
		System.out.println("Hay " + inferior + " números introducidos más bajos que la media");
	}

}