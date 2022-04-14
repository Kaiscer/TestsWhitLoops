package dam.eje2;
/*
 * Realiza un programa para obtener un número aleatorio múltiplo de 7 menor que el que se indique por teclado.
 */
import java.util.*;
public class Ejercicio2 {

	static final int MULTIPLO = 7;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce un número ");
		int num = Integer.parseInt(sc.nextLine());
		
		int alea = 0;
		
		alea  = generarAletorio(num);
		
		System.out.println(alea);
		
		while (alea % MULTIPLO != 0 ) {
			
			
			alea++;
		}	
		
		System.out.println("El numero aleatorio menor que  " + num + " es " + alea + " el cual multiplo de " + MULTIPLO  );
			
		
		
		sc.close();
	}

	private static int generarAletorio(int num ) {
		Random rd = new Random();
		return rd.nextInt(num -1)+1;
	}

}
