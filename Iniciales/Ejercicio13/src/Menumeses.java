import java.util.Scanner;

public class Menumeses {

	public static void main(String[] args) {
	
/*
 * Realiza la clase Java Menumeses que lee por teclado
 * un String con el nombre del mes por pantalla y
muestra el número de mes que le corresponde.
 */
		String mes = "";
		int numeroMes= 0;
		System.out.println("Introduce el mes de forma escrita");
		Scanner sc = new Scanner(System.in);
		mes = sc.next();
		
		switch (mes.toLowerCase()) {
		case "enero": {
			System.out.println("El mes " + mes + " es 1");
			break;
		}
		case "febrero": {
			System.out.println("El mes " + mes + " es 2");
			break;
		}
		case "marzo": {
			System.out.println("El mes " + mes + " es 3");
			break;
		}
		case "abril": {
			System.out.println("El mes " + mes + " es 4");
			break;
		}
		case "mayo": {
			System.out.println("El mes " + mes + " es 5");
			break;
		}
		case "junio": {
			System.out.println("El mes " + mes + " es 6");
			break;
		}
		case "julio": {
			System.out.println("El mes " + mes + " es 7");
			break;
		}
		case "agosto": {
			System.out.println("El mes " + mes + " es 8");
			break;
		}
		case "septiembre": {
			System.out.println("El mes " + mes + " es 9");
			break;
		}
		case "octubre": {
			System.out.println("El mes " + mes + " es 10");
			break;
		}
		case "noviembre": {
			System.out.println("El mes " + mes + " es 11");
			break;
		}
		case "diciembre": {
			System.out.println("El mes " + mes + " es 12");
			break;
		}
		default:
			System.out.println("El mes introducido no existe");
		}
		
		
	}

}
