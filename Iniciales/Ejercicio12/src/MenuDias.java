import java.util.Scanner;

public class MenuDias {

	public static void main(String[] args) {
		 /*
		  * 2.Realiza la clase Java Menudias que lee por teclado un carácter y
		  *  muestra el día de la semana que le	corresponde según la siguiente tabla
			L Lunes
			M Martes
			X Miércoles
			J Jueves
			V Viernes
			S Sábado
			D Domingo
			Otro Carácter ERROR
		  */

		System.out.println("Menu dias de la semana");
		System.out.println("Introduzca la letra del día que desee escoger");
		
		String dia = "" ;
		Scanner sc = new Scanner(System.in);
		dia = sc.next();
		
		switch (dia.toUpperCase()) {
		case "L": {
			System.out.println("El día es Lunes");
			break;
		}
		case "M": {
			System.out.println("El día es Martes");
			break;
		}
		case "X": {
			System.out.println("El día es Miercoles");
			break;
		}
		case "J": {
			System.out.println("El día es Jueves");
			break;
		}
		case "V": {
			System.out.println("El día es Viernes");
			break;
		}
		case "S": {
			System.out.println("El día es Sábado");
			break;
		}
		case "D": {
			System.out.println("El día es Domingo");
			break;
		}
		default:
			System.out.println("No existe este día");
		}
	}

}
