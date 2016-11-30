package EjerciciosArrays;

import java.util.Random;

public class Ejercicio9 {

	public static int[] llenarArrayAleatorio(int desde, int hasta, int tam) {

		// Llenar un array con números aleatorios.

		int aleatorios[] = new int[5];
		Random rm = new Random();
		int n;

		for (int i = 0; i < aleatorios.length; i++) {
			do {
				n = rm.nextInt(hasta - desde + 1) + desde;
			} while (comprobarSiContiene(aleatorios, i, n));
			aleatorios[i] = n;
		}
		return aleatorios;
	}

	public static boolean comprobarSiContiene(int[] numeros, int indice, int valor) {
		for (int i = 0; i < indice; i++) {
			if (numeros[i] == valor) {

				return true;
			}
		}
		return false;

	}

}
