import java.util.Scanner;

public class Articulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Realiza la clase Java Articulos que lee por teclado un código de artículo,
		 *  la cantidad comprada de ese artículo y el precio unitario de ese artículo,
		 *  calcula el descuento en función de la siguiente tabla y muestra los datos
		 *  anteriores junto con el descuento y el precio total por pantalla. Tabla
		 *  CANTIDAD DESCUENTO
		 *>100 40%
		 *>25 y <=100 20%
		 *>10 y <=25 10%
		 *<=10 0%
		 */
		int codigoArticulo = 0;
		int cantidad = 0;
		double precioUnidad = 0.00f;
		double precioTotal = 0.00f;
		double descuento = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el código del artículo ");
		 codigoArticulo= sc.nextInt();
		System.out.println("Introduzca la cantidad comprada del articulo ");
		cantidad = sc.nextInt();
		System.out.println("Introduzca el precio unitario del articulo" + codigoArticulo);
		precioUnidad = sc.nextDouble();
		
		precioTotal = precioUnidad * cantidad;
		if(cantidad >100){
			descuento = precioTotal * 0.4;
			System.out.println("El descuento es del 40%");
		}else if(cantidad >25 && cantidad <=100){
			System.out.println("El descuento es del 20%");
		}
		else if(cantidad >10 && cantidad <=25){
			System.out.println("El descuento es del 10%");
		}
		else if(cantidad >0 && cantidad <=10){
			System.out.println("El descuento es del 0%");
		}else {
			System.out.println("La cantidad introducida " + cantidad + " debe ser positiva");
		}
		if(cantidad >0) {
		System.out.println("El código del artículo es " + codigoArticulo);
		System.out.println("La cantidad total del articulo es " + cantidad);
		System.out.println("El precio unitario es " + precioUnidad);
		System.out.println("El descuento es " + descuento);
		System.out.println("El precio total es " + precioTotal);
		}
		
	}

}
