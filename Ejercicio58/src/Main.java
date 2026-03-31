import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Todas las cuentas corrientes con las que se va a trabajar
		 * pertenecen al,mismo banco.
		 * Añadir un atributo que almacene el nombre del banco (que
		 * es único) en la clase CuentaCorriente. Diseñar un método 
		 * que permita recuperar y modificar el nombre del banco
		 * (al que pertenecen todas las cuentas corrientes).
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuenta Corriente");
		System.out.println("Introduce el dni");
		String dni = sc.next();
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		
		
		String dni2  = "22702227P";
		System.out.println("Introduce el saldo inicial de la 2º cuenta");
		double saldo2 = sc.nextDouble();
		
		String nombre3 = "Lulu";
		String dni3 = "22705315Z";
		System.out.println("Introduce el saldo inicial de la 3º cuenta");
		double saldo3 = sc.nextDouble();
		CuentaCorriente cuenta = new CuentaCorriente(dni, nombre);
		CuentaCorriente cuenta2 = new CuentaCorriente(dni2, saldo2);
		cuenta2.setBanco("BBVA");
		CuentaCorriente cuenta3 = new CuentaCorriente(dni3, nombre3, saldo3);
		cuenta3.setBanco("Banco Popular");
		//muestra la informacion al crear la cuenta
		cuenta.mostrarInformacion();
		
		double cantidad = 0;
		System.out.println("Introduce la cantidad a ingresar");
		cantidad = sc.nextDouble();
		cuenta.ingresarDinero(cantidad);
		//muestra la informacion al ingresar dinero
		cuenta.mostrarInformacion();
		System.out.println("Introduce la cantidad a sacar");
		cantidad = sc.nextDouble();
		cuenta.sacarDinero(cantidad);
		//muestra la informacion al final
		System.out.println("La cuenta principal tiene esta información\n");
		cuenta.mostrarInformacion();
		
		System.out.println("La 2º cuenta tiene esta información\n");
		cuenta2.mostrarInformacion();
		System.out.println("La 3º cuenta tiene esta información");
		cuenta3.mostrarInformacion();
	}

}
