import java.util.Scanner;

public class Expendedor {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Expendedor que lee por teclado un saldo
		 *  en euros al cliente, muestra un menú donde
			elegir café (0,43 €), refrescos (1,11 €), o agua (0,36 €) y, 
			si el saldo es mayor o igual que el importe del
			producto saca el mensaje “Su producto. Gracias” y le devuelve el 
			cambio indicando el número de
			monedas de cada tipo de las que se compone el cambio 
			(2€, 1€, 50cts, 20cts, 10cts, 5cts, 2cts, 1cts). Si el
			saldo no es mayor o igual que el importe del producto muestra 
			el mensaje “Saldo insuficiente” y devuelve
			el saldo. Si se introduce una opción incorrecta muestra 
			el mensaje “Opción incorrecta” y devuelve el
			saldo. Para evitar problemas a la hora de convertir 
			en un número entero el saldo a devolver podemos
			usar la función Java Math.round que redondea un valor real. 
		 */

		boolean opcionCorrecta = true;
		double saldo = 0.00;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su saldo");
		saldo = sc.nextDouble();
		
		System.out.println("Elija 1 producto de la lista");
		System.out.println("1 para café");
		System.out.println("2 para refresco");
		System.out.println("3 para agua");
		
		int opcion = 0;
		opcion = sc.nextInt();
		double precio = 0.00;
		switch (opcion) {
		case 1: {
			precio= 0.43f;
			break;
		}
		case 2:{
			precio = 1.11f;
			break;
		}
		case 3:{
			precio = 0.36f;
			break;
		}
		default:
			System.out.println("Opcion incorrecta");
			opcionCorrecta = false;
			
		}
		
		if(opcionCorrecta) {
			if(saldo >= precio) {
				System.out.println("Su producto. Gracias");
				double cambio = saldo - precio;
				double centimos = cambio * 100;
				int centimosRedondeados = (int)Math.round(centimos);
				System.out.println(centimos);
				System.out.println(centimosRedondeados);
				if(centimosRedondeados>= 200){
					int monedas = centimosRedondeados / 200;
					centimosRedondeados = centimosRedondeados%200;
					System.out.println("El nº de monedas de 2€ son " + monedas);
				}
				if(centimosRedondeados>= 100){
					int monedas = centimosRedondeados / 100;
					centimosRedondeados = centimosRedondeados%100;
					System.out.println("El nº de monedas de 1€ son " + monedas);
				}
				if(centimosRedondeados>= 50){
					int monedas = centimosRedondeados / 50;
					centimosRedondeados = centimosRedondeados%50;
					System.out.println("El nº de monedas de 50 centimos son " + monedas);
				}
				if(centimosRedondeados>= 20){
					int monedas = centimosRedondeados / 20;
					centimosRedondeados = centimosRedondeados%20;
					System.out.println("El nº de monedas de 20 centimos son " + monedas);
				}
				if(centimosRedondeados>= 10){
					int monedas = centimosRedondeados / 10;
					centimosRedondeados = centimosRedondeados%10;
					System.out.println("El nº de monedas de 10 centimos son " + monedas);
				}
				if(centimosRedondeados>= 5){
					int monedas = centimosRedondeados / 5;
					centimosRedondeados = centimosRedondeados%5;
					System.out.println("El nº de monedas de 5 centimos son " + monedas);
				}
				if(centimosRedondeados>= 2){
					int monedas = centimosRedondeados / 2;
					centimosRedondeados = centimosRedondeados%2;
					System.out.println("El nº de monedas de 2 centimos son " + monedas);
				}
				if(centimosRedondeados>= 1){
					int monedas = centimosRedondeados / 1;
					centimosRedondeados = centimosRedondeados%1;
					System.out.println("El nº de monedas de 1 centimo son " + monedas);
				}
			}else {
				System.out.println("Saldo insuficiente " + saldo);
			}
		}
		
	}

}
