import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		
/*
 * Realiza la clase Java Mayormenor que lee dos números 
 * por teclado a y b y muestra por pantalla si el primero es mayor que el segundo,
 * si el segundo es mayor que el primero o si son iguales.
 */
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer nº");
		a = sc.nextInt();
		System.out.println("Introduce el segundo nº");
		b = sc.nextInt();
		if(a > b) {
			System.out.println("El primer nº "+ a + " es mayor que el 2º " + b);
		}else if(b > a){
			System.out.println("El segundo nº "+ b + " es mayor que el 1º " + a);
		}else {
			System.out.println("Los numeros " + a + " y " + b + " son iguales");
		}
	}

}
