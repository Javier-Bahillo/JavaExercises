import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el,
		 * DNI completo. Para calcular la letra, cogeremos el resto de dividir nuestro
		 * DNI entre 23, el resultado debe estar entre 0 y 22. Haz un método donde
		 * según el resultado de la anterior formula busque en un array de caracteres
		 * la posición que corresponda a la letra. Esta es la tabla de caracteres:
		 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
		 * T R W A G M Y F P D X B N J Z S Q V H L C K E
		 */
		
	     Scanner sc = new Scanner(System.in);
	     char[] letrasDni = {
	    	        'T','R','W','A','G','M','Y','F','P','D','X',
	    	        'B','N','J','Z','S','Q','V','H','L','C','K','E'
	    	    };
	     System.out.println("Introduzca el dni sin letra");
	     int dni = sc.nextInt();
	     int dniResto = dni % 23;
	     char letra = letrasDni[dniResto];
	     
	     System.out.println("Para el dni " + dni + " la letra es esta " + letra);
	}

}
