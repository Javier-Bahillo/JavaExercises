import java.util.Scanner;

public class Mediatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realiza la clase Java Mediatem que pide temperaturas por pantalla y 
		 * las almacena en un array hasta que se introduzca la temperatura -999
		 *  que no será tenida en cuenta o el array esté lleno. Después calcula la temperatura 
		 *  media y muestra el número de temperaturas que son mayores que la media, iguales que la media,
		 *   e inferiores a la media.
		 */
	        int[] temperaturas = new int[100];
	        Scanner sc = new Scanner(System.in);
	        int contador = 0;
	        int temperatura;

	        System.out.println("Introduce tº:");
	        System.out.println("Introduce -999 para finalizar:");

	        while (contador<temperaturas.length) {
	        	temperatura = sc.nextInt();
	            if (temperatura == -999) {
	                break;
	            }
	            temperaturas[contador] = temperatura;
	            contador++;
	        }
	        if (contador == 0) {
	            System.out.println("Tº incorrectas.Agur");
	        }
	        int suma = 0;
	        for (int i = 0; i < contador; i++) {
	            suma += temperaturas[i];
	        }
	        double media = suma / contador;
	        int mayores = 0, iguales = 0, menores = 0;
	        for (int i = 0; i < contador; i++) {
	            if (temperaturas[i] > media) {
	                mayores++;
	            } else if (temperaturas[i] < media) {
	                menores++;
	            } else {
	                iguales++;
	            }
	        }
	        System.out.println("Resultados:");
	        System.out.printf("Tº media: %.2f\n", media);
	        System.out.println("Mayores que la media: " + mayores);
	        System.out.println("Iguales a la media: " + iguales);
	        System.out.println("Menores que la media: " + menores);
	    }
	}