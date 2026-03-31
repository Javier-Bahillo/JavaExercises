import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMedia {
	/*
	 * Crea la clase ArrayListMedia que pide números enteros
	 * por pantalla y los almacena en un ArrayList
	 * mientras que no se introduzca un número negativo.
	 * Después calcula la Media y la muestra.
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        System.out.println("Introduce nº enteros(un nº negativo para finalizar):");
        System.out.print("Número: ");
        numero = sc.nextInt();

        while (numero >= 0) {
            numeros.add(numero);
            System.out.print("Número: ");
            numero = sc.nextInt();
        }
        if (numeros.size() > 0) {
            int suma = 0;
            for (int n : numeros) {
                suma += n;
            }
            double media = (double) suma / numeros.size();
            System.out.println("\nLa media es: " + media);
        } else {
            System.out.println("\nNo se introdujeron nº positivos.");
        }
    }
}