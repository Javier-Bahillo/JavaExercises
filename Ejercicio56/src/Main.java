import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Diseñar la clase CuentaCorriente, que almacena los datos:
		 * DNI y nombre del titular, así como el saldo.
		 * Las operaciones típicas con una cuenta corriente
		 * son:
		 * • Crear una cuenta: se necesita el DNI y nombre del titular.
		 * El saldo inicial será 0.
		 * • Sacar dinero: el método debe indicar si ha sido posible
		 * llevar a cabo la operación, si existe saldo suficiente.
		 * • Ingresar dinero: se incrementa el saldo.
		 * • Mostrar información: muestra la información
		 * disponible de la cuenta corriente.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuenta Corriente");
		System.out.println("Introduce el dni");
		String dni = sc.next();
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		CuentaCorriente cuenta = new CuentaCorriente(dni, nombre);
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
		cuenta.mostrarInformacion();
	}

}
