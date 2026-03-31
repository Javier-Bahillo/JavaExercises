
public class Gestor {
		// TODO Auto-generated method stub

		/*
		 * Existen gestores que administran las cuentas bancarias y atienden 
		 * a sus,propietarios.Cada cuenta, en caso de tenerlo, cuenta
		 * con un único gestor. Diseñar la clase Gestor de la que interesa
		 * guardar su nombre, teléfono y el importe máximo autorizado
		 * con el que pue­ den operar. Con respecto a los gestores,
		 * existen las siguientes restricciones:
		 * • Un gestor tendrá siempre un nombre y un teléfono.
		 * • Si no se asigna el importe, el importe máximo autorizado
		 * por operación será de 10 000 euros.(
		 * • Un gestor, una vez asignado, no podrá cambiar su número de
		 * teléfono. Y todo el mundo podrá consultarlo.
		 * El nombre será público y el importe máximo solo
		 * será visible por clases vecinas.
		 * Modificar la clase CuentaCorriente para que
		 * pueda disponer de un objeto
		 * Gestor. Escribir los métodos necesarios.
		 */
		
		public String nombre;
		private final int telefono; // no se va a poder cambiar
		protected double maximoImporteutorizado;
		
//		public Gestor() {
//			this.nombre = "";
//			this.telefono = 0;
//			this.maximoImporteutorizado = 10000;
//		}



		public Gestor(String nombre, int telefono) {
			this.nombre = nombre;
			this.telefono = telefono;
			this.maximoImporteutorizado = 10000;
		}

		public Gestor(String nombre, int telefono, double maximoImporteutorizado) {
			this.nombre = nombre;
			this.telefono = telefono;
			this.maximoImporteutorizado = maximoImporteutorizado;
		}
		
		public int getTelefono() {
			return telefono;
		}
		
		protected double getMaximoImporteutorizado() {
			return maximoImporteutorizado;
		}
	}
