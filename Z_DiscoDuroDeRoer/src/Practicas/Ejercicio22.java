package Practicas;

public class Ejercicio22 {

	public static void main(String[] args) {

		//Contar las vocales que hay en un String.

		String frase = "La lluvia en Sevilla es una maravilla".toLowerCase();
		int contador = 0;

		for (int x = 0; x < frase.length(); x++) {
			if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i')
					|| (frase.charAt(x) == 'o') || (frase.charAt(x) == 'u')) {
				contador++;
			}
		}

		System.out.println("La frase: " + frase + ", contiene " + contador + " vocales");

	}

}
