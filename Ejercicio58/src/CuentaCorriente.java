import java.util.Scanner;

public class CuentaCorriente {
		// TODO Auto-generated method stub
		
	/*
	 * En la clase CuentaCorriente sobrecargar los constructores
	 *  para poder crear objetos.
	 *  • Con el DNI del titular de la cuenta y un saldo inicial.
	 *  • Con el DNI, nombre y el saldo inicial.
	 *  Escribir un programa que compruebe el funcionamiento 
	 *  de los métodos.
	 */
	
		private String dni;
		private String nombre;
		private double saldo;
		private String banco = "IBKR";
		
		//CrearCuenta
		public CuentaCorriente(String dni, String nombre){
			this.saldo = 0;
			this.dni = dni;
			this.nombre = nombre;
		}
		

		public CuentaCorriente(String dni, double saldo) {
			this.dni = dni;
			this.saldo = saldo;
			this.nombre = "";
		}
		public CuentaCorriente(String dni, String nombre, double saldo) {
			this.dni = dni;
			this.nombre = nombre;
			this.saldo = saldo;
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
			System.out.println("El banco es " + banco +"\nDNI: " + this.dni + "\nnombre: " + this.nombre + "\nsaldo :" + saldo);
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
		public String getBanco() {
			return banco;
		}

		public  void setBanco(String banco) {
			this.banco = banco;
		}
}