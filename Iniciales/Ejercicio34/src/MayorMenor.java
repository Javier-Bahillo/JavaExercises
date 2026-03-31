import java.util.Scanner;

public class MayorMenor {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	/*
    	 * Solicitar al usuario la cantidad de números enteros que va a introducir,
    	 * después el usuario introducirá la cantidad de números indicada y se
    	 * mostrará por pantalla el número más grande y el más pequeño.
    	 */
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos nº enteros deseas introducir? ");
        int cantidad = sc.nextInt();
        int mayor;
        int menor;
        System.out.print("Introduce el nº 1: ");
        int numero = sc.nextInt();
        mayor = numero;
        menor = numero;

        for (int i = 2; i <= cantidad; i++) {
            System.out.print("Introduce el nº " + i + ": ");
            numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("El nº más grande es = " + mayor);
        System.out.println("El nº más pequeño es =" + menor);
    }
}