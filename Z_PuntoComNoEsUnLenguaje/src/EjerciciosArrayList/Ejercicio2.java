package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Leer n�meros por teclado hasta introducir 99. Calcular la suma, la media y cu�ntos son mayores que la media.
		
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
			System.out.println("Introduce qu� cantidad de n�meros quieres para trabajar (Puntuaciones comunio)");
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
				System.out.println("Valor n�mero " + i + ": ");
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
		System.out.println("N�meros introducidos: ");
		System.out.println(a);
		for (Double d : a) {
			if (d > media)
				superior++;
			else if (d < media)
				inferior++;
		}
		System.out.printf("Media: %.2f %n", media);
		System.out.println("Hay " + superior + " n�meros introducidos m�s altos que la media");
		System.out.println("Hay " + inferior + " n�meros introducidos m�s bajos que la media");
	}

}