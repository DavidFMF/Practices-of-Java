package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Calcular la altura media de los alumnos de una clase.

		@SuppressWarnings("rawtypes")
		ArrayList<Double> altura = new ArrayList();
		int N;
		double media;

		N = numeroAlumnos(); // Obtenemos el nº de alumnos de la clase.
		leerAlturas(altura, N); // Leemos la altura de los N alumnos.
		media = calcularMedia(altura); // Calculamos la media.
		mostrarResultados(altura, media); // Mostrar los resultados.

	}

	// Método para pedir por teclado el número de alumnos de la clase

	public static int numeroAlumnos() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Introduce número de alumnos: ");
			n = sc.nextInt();
		} while (n < 1);
		return n;
	}

	// Este método recibe el ArrayList y el número de alumnos de la clase
	// Pide por teclado la altura de todos los alumnos y las guarda en el
	// ArrayList

	public static void leerAlturas(ArrayList<Double> a, int n) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i;
		double alto;
		for (i = 1; i <= n; i++) {
			do {
				System.out.print("Alumno " + i + " altura: ");
				alto = sc.nextDouble();
			} while (alto <= 0);
			a.add(alto); // añade la altura al final del ArrayList
			
			//sc.close();
		}
	}

	// Este método recibe el ArrayList con todas las alturas
	// calcula y devuelve la media

	public static double calcularMedia(ArrayList<Double> a) {
		double media = 0;
		for (Double d : a) {
			media = media + d;
		}
		return media / a.size();
	}

	// Muestra la altura de todos los alumnos, la media y calcula y muestra
	// cuantos alumnos hay con altura superior a la media
	// y cuántos con altura inferior

	public static void mostrarResultados(ArrayList<Double> a, double media) {
		int superior = 0, inferior = 0;
		System.out.println("alturas introducidas: ");
		System.out.println(a);
		for (Double d : a) {
			if (d > media)
				superior++;
			else if (d < media)
				inferior++;
		}
		System.out.printf("Media: %.2f %n", media);
		System.out.println("Hay " + superior + " alumnos más altos que la media");
		System.out.println("Hay " + inferior + " alumnos más bajos que la media");
	}
}
