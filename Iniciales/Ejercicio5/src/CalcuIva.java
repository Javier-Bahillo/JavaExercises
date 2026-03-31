import java.util.Scanner;

public class CalcuIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .Realiza la clase Java Calcuiva que lee una cantidad en euros por teclado 
		 * y muestra por pantalla su IVA sabiendo que si la cantidad es menor 
		 * que 20000 el IVA es el 7% y sino del 16%.
		 */
		
		System.out.println("Introduce la cantidad de € de la que desee obtener el IVA");
		Scanner sc = new Scanner(System.in);
		float euros = sc.nextFloat();
		double iva;
		final int LIMITECREDITO = 20000;
		final double IVA7 = 0.07;
		final double IVA16 = 0.16;
		if(euros < LIMITECREDITO) {
			iva = euros * IVA7;
			
		}else {
			iva = euros * IVA16;
			
		}
		System.out.println("El IVA es : " + iva);
	}

}
