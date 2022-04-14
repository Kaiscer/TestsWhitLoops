package dam.eje1;
/*
 * Desarrollar un programa que muestre los múltiplos de 3 que se encuentren entre dos enteros positivos introducidos por teclado. 
 * Hay que tener en cuenta cuál de los dos es mayor.
 */
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce dos número enteros positivos ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.nextLine();
		
		 
		
		if (n2 < n1) {
		int swap = n1;
		  n1 = n2;
		  n2 = swap;
		}
		
		// El multipo de un es el resultado de la multiplicacion del numero por un numero entero Ej: 3x1 = 3, el 3 es multiplo de 3 3x9= 27, 27 es multiplo de 3 
		
		while (n1 <= n2) {
			
			if (n1 % 3 == 0 ) {
				System.out.println(n1);
			}	
			n1++;
		}
		
		
		sc.close();
	}

}
