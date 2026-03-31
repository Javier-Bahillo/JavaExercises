
public class Sintonizador {

		// TODO Auto-generated method stub

		/*
		 * Definir una clase que permita controlar un sintonizador digital 
		 * de emisoras FM; concretamente, se desea dotar al controlador
		 * de una interfaz que permita subir (up) o bajar (down)
		 * la frecuencia (en saltos de 0,5 MHz) y mostrar 
		 * la frecuencia sintonizada en un momento dado (display).
		 * Supondremos que el rango de frecuencias para manejar oscila 
		 * entre los 80 MHz y los 108 MHz y que,
		 * al inicio, el controlador sintonice la frecuencia
		 * indicada en el constructor o 80 MHz por defecto.
		 * Si durante una operación de subida o bajada se sobrepasa
		 * uno de los dos límites, la frecuencia sintonizada
		 * debe pasar a ser la del extremo contrario.
		 * Escribir un pequeño programa principal
		 * para probar su funcionamiento.
		 */
		
		private double frecuencia;
		
		public Sintonizador() {
			this.frecuencia = 80;
		}
		
		public Sintonizador(double frecuencia) {
			if (frecuencia < 80 || frecuencia > 108) {
				this.frecuencia = 80;
			}else {
				this.frecuencia = frecuencia;

			}
		}
		
		public void subirFrecuencia(){
			
			this.frecuencia += 0.5;
			if(frecuencia > 108) {
				this.frecuencia = 80;
			}
		}
		public void bajarFrecuencia(){
					
			this.frecuencia -= 0.5;
				if(frecuencia < 80) {
					this.frecuencia = 108;
			}
		}
		public double display(){
			return this.frecuencia;
		}

		@Override
		public String toString() {
			return "Sintonizador [frecuencia=" + frecuencia + "]";
		}	
}
