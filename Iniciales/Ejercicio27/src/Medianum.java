import java.util.Scanner;

public class Medianum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Realiza la clase Java Medianum que pide números por pantalla y 
		 * los almacena en un array hasta que se introduzca,
		 * un número negativo que no será tenido en cuenta o el array esté lleno.
		 *  Después calcula la Media y la muestra.
		 */
		
        int[] numeros = new int[10];
		Scanner sc = new Scanner(System.in);
        int contador = 0;
        int suma = 0;

        System.out.println("Introduce nº positivos o un nº negativo parea finalizar:");

        while (contador<numeros.length) {
            int numero = sc.nextInt();

            if (numero<0) {
                break;
            }
            numeros[contador] = numero;
            suma += numero;
            contador++;
        }
        if (contador>0) {
            float media = suma/contador;
            System.out.print("La muestra es: ");
            for (int i=0; i<contador; i++) {
                System.out.print(numeros[i] + " ");
                
            }
            System.out.println("La media de los " + contador + " números es: " + media);
        } else {
            System.out.println("Agur");
            System.out.println("La media de los " + contador + " números es: 0" );
            //mejorar para caso 1
        }

    }
}