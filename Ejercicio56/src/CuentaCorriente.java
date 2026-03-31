import java.util.Scanner;

public class CuentaCorriente {
		// TODO Auto-generated method stub
		
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
	
		String dni;
		String nombre;
		double saldo;
		
		//CrearCuenta
		public CuentaCorriente(String dni, String nombre){
			this.saldo = 0;
			this.dni = dni;
			this.nombre = nombre;
		}
		public boolean sacarDinero(double cantidad) {
			if (cantidad>0  && cantidad <= saldo) {
				saldo -= cantidad;
				System.out.println("Has sacado dinero, el nuevo saldo es: " + saldo);
				return true;
			}else {
				System.out.println("No ha sido posible,saldo insuficiente o cantidad erronea");
				return false;
			}
		
		}
		public void ingresarDinero(double cantidad) {
			
			if(cantidad <= 0) {
				System.out.println("Tienes que introducir una cantidad positiva");
			}else {
				this.saldo += cantidad;
				System.out.println("La cantidad ingresada es: " + cantidad + " ahora el saldo es: " + saldo);
			}
			
		}
		
		public void mostrarInformacion() {
			System.out.println("DNI: " + this.dni + "\nnombre: " + this.nombre + "\nsaldo :" + saldo);
		}
		
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
}
