package dam.eje3;
/*
 * Desarrollar un programa que indique si un n�mero dado es primo.
 */
import java.util.*;
public class Ejercico3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero y te dire si es primo ");
		int num = Integer.parseInt(sc.nextLine());
		
		int contDvs = 0;
		
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0 ) {
				contDvs++;
			}
			
			
			}
					
		if (contDvs <= 2 ) {
			System.out.println("El n�mero " + num + " es primo");
			
		}else {
			System.out.println("El n�mero " + num + " no es primo ");
			
		}
		
		
		
			
		
			
		
						
		
		sc.close();
		
		
		
 }

}
