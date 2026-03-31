import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		int x = 5;
		System.out.println("Introduce un nº entero");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println("El valor de x es:" + x + " y el valor de y es:" + y);
		double z = (double)y;
		System.out.println("El valor de z es:" + z);
		x = (int)z;
		System.out.println("El valor de x es:" + x);

	}

}
