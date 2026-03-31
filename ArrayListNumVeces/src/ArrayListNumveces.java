import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumveces {
	/*
	 * Crea la clase ArrayListNumveces que pide números
	 * del 1 al 5 por pantalla y calcula el número de veces
	 * que han sido introducidos utilizando un ArrayList.
	 * Finaliza la introducción de datos cuando se
	 * introduzca un número incorrecto.
	 * Al finalizar muestra por pantalla el número de veces
	 * que se ha introducido cada número.
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;
        System.out.println("Introduce nº del 1 al 5 (otro número para finalizar):");
        System.out.print("Número: ");
        numero = sc.nextInt();

        while (numero >= 1 && numero <= 5) {
            numeros.add(numero);
            System.out.print("Número: ");
            numero = sc.nextInt();
        }
        for (int i = 1; i <= 5; i++) {
            int contador = 0;
            for (int n : numeros) {
                if (n == i) {
                    contador++;
                }
            }
            System.out.println("El nº " + i + " se ha introducido " + contador + " veces.");
        }
    }
}