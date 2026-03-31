import java.util.Scanner;

public class Arraysumaprimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realiza la clase Java Arraysumaprimo que pide números enteros 
		 * por pantalla y los almacena en un array hasta que,
		 * se introduzca un número negativo que no será tenido en cuenta
		 *  o el array esté lleno. Después calcula la suma de 
		 *  todos ellos y comprueba si esa suma es un número primo o no.
		 */
		
		 	Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int suma = 0;
	        int contador = 0;

	        System.out.println("Introduce nº enteros :");
	        System.out.println("Introduce 1 nº negativo para terminar :");

	        while (contador < numeros.length) {
	            int numero = sc.nextInt();     
	            if (numero <= 0) break;
	            numeros[contador++] = numero;
	            suma += numero;
	        }
	        if(suma > 0) {
		        System.out.println("La suma es = " + suma);
		        boolean esPrimo = true;
		        
		            for (int i = 2; i < suma; i++) {
		                if (suma % i == 0) {
		                		esPrimo = false;
		                    break;
		                }
		            }
			        if (esPrimo) {
			        		System.out.println("La suma es un nº primo.");
			        }
			        else {
			        		System.out.println("La suma no es un nº primo.");
			        }
	        }
	        System.out.println("Agur");      
	}
	    }