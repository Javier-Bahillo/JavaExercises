import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMediaTemperaturas {
	/*
	 * Crea la clase ArrayListMediaTemperaturas que pide
	 * temperaturas (de tipo double) por pantalla y las
	 * almacena en un ArrayList mientras que no se introduzca -999.
	 * Después calcula la temperatura media y
	 * muestra el número de temperaturas que son mayores
	 * que la media, iguales que la media, e inferiores a la media.
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();
        double temperatura;

        System.out.println("Introduce Tº(introduce -999 para finalizar):");
        System.out.print("Tº: ");
        temperatura = sc.nextDouble();
        while (temperatura != -999) {
            if(temperatura>-30 && temperatura<60) {
            	temperaturas.add(temperatura);
            }	else {
            	System.out.println("Introduzca una tº realista para la humanidad");
            }
            System.out.print("Tº: ");
            temperatura = sc.nextDouble();
        }
        if (temperaturas.size() > 0) {
            double suma = 0;
            for (double t : temperaturas) {
                suma += t;
            }
            double media = suma / temperaturas.size();

            int mayores = 0;
            int iguales = 0;
            int menores = 0;

            for (double t : temperaturas) {
                if (t > media)
                    mayores++;
                else if (t < media)
                    menores++;
                else
                    iguales++;
            }
            System.out.printf("%nTº media: %.2f%n", media);
            System.out.println("Tº mayores que la media: " + mayores);
            System.out.println("Tº iguales a la media: " + iguales);
            System.out.println("Tº menores que la media: " + menores);
        } else {
            System.out.println("\nNo se introdujeron tº válidas.");
        }

    }
}