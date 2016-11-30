package Practicas;

public class Ejercicio23 {

	public static void main(String[] args) {

		//Reemplazar todas las 'a' por 'e' en el siguiente String.

		String frase = "La lluvia en Sevilla es una maravilla".toLowerCase();
		String newFrase = frase.replace('a', 'e');

		System.out.println("La anterior frase: " + frase + ", ahora se lee así: " + newFrase);

	}

}
