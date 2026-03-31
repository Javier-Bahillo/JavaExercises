import java.util.Scanner;

public class CuentaCorriente {
		// TODO Auto-generated method stub
		
	/*
	 * Existen gestores que administran las cuentas bancarias y atienden 
	 * a sus,propietarios.Cada cuenta, en caso de tenerlo, cuenta
	 * con un único gestor. Crear la clase Gestor de la que interesa
	 * guardar su nombre, teléfono y el importe máximo autorizado
	 * con el que pueden operar. Con respecto a los gestores,
	 * existen las siguientes restricciones:
	 * • Un gestor tendrá siempre un nombre y un teléfono.
	 * • Si no se asigna, el importe máximo autorizado
	 * por operación será de 10 000 euros.
	 * • Un gestor, una vez asignado, no podrá cambiar su número de
	 * teléfono. Y todo el mundo podrá consultarlo.
	 * El nombre será público y el importe máximo solo
	 * será visible por clases vecinas.
	 * Modificar la clase CuentaCorriente para que
	 * pueda disponer de un objeto(new)
	 * Gestor. Escribir los métodos necesarios.
	 */
	
		private String dni;
		private String nombre;
		private double saldo;
		private String banco = "IBKR";
		private Gestor gestor;
		
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


		public Gestor getGestor() {
			return gestor;
		}


		public void setGestor(Gestor gestor) {
			this.gestor = gestor;
		}
}