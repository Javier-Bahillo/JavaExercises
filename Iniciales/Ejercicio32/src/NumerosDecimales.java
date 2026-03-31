import java.util.Scanner;

public class NumerosDecimales {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	/*
    	 * Diseñar un programa que solicite al usuario
    	 *  que introduzca por teclado 5,números decimales.
    	 *  A continuación, mostrar los números en el mismo orden
    	 *  que se han introducido. (Usar un array)
    	 */
    	
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];

        System.out.println("Introduce 5 números decimales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Los números introducidos son =");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

    }
}