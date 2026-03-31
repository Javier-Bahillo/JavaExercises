import java.util.Scanner;

public class NumerosInversos {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	/*
    	 * Escribir una aplicación que solicite al usuario
    	 * cuántos números desea,introducir. A continuación,
    	 * introducir por teclado esa cantidad de números
    	 * enteros, y por último, mostrar en el orden inverso al introducido.
    	 */
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos nº enteros desea introducir? ");
        int numerosCant = sc.nextInt();
        int[] numeros = new int[numerosCant];

        if(numeros.length>0) {
        for (int i = 0; i < numerosCant; i++) {
            System.out.print("Introduce el nº " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Los nº en orden inverso son =");
        for (int i = numerosCant - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        }
		if(numeros.length<1) {
			System.out.println("Agur");
		}
       

    }
}