import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Introduce un nº entero");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		x = x * 2;
		
		System.out.println(x);

	}

}
