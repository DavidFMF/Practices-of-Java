package EjerciciosGenerales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Mostrar los N primeros t�rminos de la serie de Fibonacci (xn = xn-1 + xn-2).
		
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros t�rminos de la serie de Fibonacci son:");  

 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
        
        sc.close();
    }
}
