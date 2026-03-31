import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> numeros = new ArrayList<>();
	        int numero;
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Número: ");
		        numero = sc.nextInt();
		        numeros.add(numero);
		      //mete en cada posicion el numero
//		        numeros.set(i, numero);
		        
			}
	        for (int i = 0; i < 3; i++) {
	        	 //devuelve en cada posicion el numero	
				System.out.println(numeros.get(i));
			}
	  
	 }	
}
