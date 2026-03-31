import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Fibonaci que lee un número n 
		 * por teclado y calcula la serie de fibonacci para los
		 * n primeros números. La serie de Fibonacci tiene las 
		 * siguientes características:
		 * F(0)=0;
		 * F(1)=1;
		 * Para n>=2
		 * F(n)=F(n-1) + F(n-2);
		 * 
		 * 
		 * Fibonaci ( 0 ) = 0
		 * fibonaci (1) = 1
		 * fibanaci(2) = 0 1
		 * fibanice(3) = 0 1 1
		 * 
		 * 
		 */

		int numero = 0;
		Scanner sc = new Scanner(System.in);
		int primero = 0;
		int segundo = 1;
		int siguiente = 0;

		do{
			System.out.println("Introduce un nº positivo para calcular fibonacci");
			numero = sc.nextInt();
			
		}while(numero<0);
			
		if(numero==0) {
			System.out.println("0");
		}
		else if(numero==1) {
			System.out.println("1");
		}
		else {
		for (int i = 0; i <numero; i++) {
			//siguiente = primero + segundo
			if(i==0) {
				System.out.println("0");
			}
			else if(i==1) {
				System.out.println("1");
			}
			else {
				siguiente = segundo + primero;
				System.out.println(siguiente);
				primero = segundo;
				segundo = siguiente;
			}
		}
	}
		
	}

}
