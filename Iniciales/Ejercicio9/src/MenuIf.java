import java.util.Scanner;

public class MenuIf {

	public static void main(String[] args) {
	/*
	 * 
	 * 6.Realiza la clase Java Menuif que muestra un menú y, en función de la opción,
	 *  lee por teclado dos	números enteros y calcula una operación.
		1.Sumar
		2.Restar
		3.Multiplicar
		4.Dividir
		5.Resto (%)
	 * 
	 * 
	 */

		System.out.println("Menú de operaciones");
		System.out.println("Elija la opcion que desee para operar con los 2 nº");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("5-Resto");
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		System.out.println("Introduzca el 1º nº");
		int numero1 = 0;
		numero1 = sc.nextInt();
		System.out.println("Introduzca el 2º nº");
		int numero2 = 0;
		numero2= sc.nextInt();
		
		if(opcion == 1){
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es : " + (numero1+numero2));
		}else if(opcion == 2) {
			System.out.println("La resta de " + numero1 + " y " + numero2 + " es : " + (numero1-numero2));
		}else if(opcion==3) {
			System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es : " + (numero1*numero2));
		}else if(opcion==4) {
			System.out.println("La división de " + numero1 + " y " + numero2 + " es : " + (numero1/numero2));
		}else if(opcion==5) {
			System.out.println("El resto de " + numero1 + " y " + numero2 + " es : " + (numero1%numero2));
		}else {
			System.out.println("Introduzca entre el 1 y el 5 por favor");
		}
	}

}
