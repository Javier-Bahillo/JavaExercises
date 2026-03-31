import java.util.Iterator;
import java.util.Scanner;

public class Contrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la clase Java Contrase que pide un nombre por pantalla y 
		 * una contraseña.Compara los valores con unos,valores predefinidos
		 * y si coinciden muestra un mensaje de bienvenida.
		 * Si no coinciden muestra un mensaje de error por pantalla.
		 * El proceso se repite hasta que los datos son correctos o 
		 * hasta que se produzcan más de 3 intentos.
		 */
		
		Scanner sc = new Scanner(System.in);
		String nombre = "Pepe";
		String contraseña = "1234Pepe";
		String nombre2 = "";
		String contraseña2 = "";
		
		
		int intentos = 1;
		while (intentos<4) {
			System.out.println("Introduzca un nombre");
			nombre2 = sc.next();
			System.out.println("Introduzca una contraseña");
			contraseña2 = sc.next();
			if(nombre.equals(nombre2) && contraseña.equals(contraseña2)) {
				System.out.println("Bienvenido");
				intentos= 4;
			}else {
				System.out.println("Intentalo de nuevo");
			}
			intentos++;
		}
		System.out.println("Agur");
		
	}

}
