package Practicas;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		//Recorre el siguiente String y transforma cada car�cter a su c�digo ASCII. Muestra el resultado.
		
		String frase = "La lluvia en Sevilla es una maravilla";
		
		for(int x = 0;x < frase.length(); x++){
			System.out.println((int)frase.charAt(x) + " = " + frase.codePointAt(x));;
		}
		
	}
}
