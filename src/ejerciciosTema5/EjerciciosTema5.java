package ejerciciosTema5;

import java.util.*;

public class EjerciciosTema5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random() * 100) + 1;
		int numero;
		int intentos = 0;
		
		System.out.println("Adivine un n�mero escogido aleatoriamente. Escriba el n�mero: ");
		numero = sc.nextInt();
		
		
		
		do {
			
			intentos++;
			if (numero < aleatorio) {
			System.out.println("El n�mero a adivinar es mayor. \n Escriba otro n�mero: ");
			numero = sc.nextInt();}
					
			else if (numero > aleatorio) {
				System.out.println( "El n�mero a adivinar es menor. \n Escriba otro n�mero: ");
				numero = sc.nextInt();}
		}
		while (numero != aleatorio);
		
		System.out.println("�Enhorabuena! el n�mero a adivinar es " + aleatorio);
		System.out.println("N�mero de intentos: " + intentos);
		sc.close();
	}
}
