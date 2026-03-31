import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que pida una palabra y dos letras (x y y).
		 * El programa debe devolver la palabra resultante de sustituir
		 * todas las apariciones de x por y.Ejemplo:
		 * Entrada → perro, r, l
		 * Salida → pello
		 */
		
		String texto = "";
//		char x = 0;
//		char y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		texto = sc.next();
		System.out.println("Escribe una letra para sustituir");
		String x = sc.next();
		System.out.println("Escribe otra letra que sustituirá a la anterior");
		String y = sc.next();
		
		System.out.println(texto.replace(x, y));

		}
		
	}

