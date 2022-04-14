package dam.eje4;
/*
 * Desarrollar un programa que muestre los primos menores que un número introducido por teclado.
 */
import java.util.*;
public class Ejercico4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número y te dire cuales son los número primos menores");
		int num = Integer.parseInt(sc.nextLine());
		
		int numPrimo = 1;
		int cont;
		
		for (int x = 1; x <= num; x++) {
			cont = 0;
			for (int i = 1; i <= num ; i++) {
				if (numPrimo % i == 0 ) {
					cont++;
				}
			}
			if (cont <= 2 ) {
				System.out.println(numPrimo);
			}
			numPrimo++;	
		}
		
		
		
		sc.close();
		
	}

}
