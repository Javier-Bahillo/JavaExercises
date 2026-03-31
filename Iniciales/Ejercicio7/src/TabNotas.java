import java.util.Scanner;

public class TabNotas {

	public static void main(String[] args) {
		/*
		 * .Realiza la clase Java Tabnotas que lee la nota de un alumno por teclado y 
		 * muestra por pantalla la calificación que le corresponde sabiendo que si
		 * NOTA CALIFICACION
		 *>=0 y <3 MD
		 *>=3 y <5 INS
		 *>=5 y <6 SUF
		 *>=6 y <7 BIEN
		 *>=7 y <9 NOT
		 *>=9 y <=10 SOBRE
		 */
		float nota = 0.00f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota");
		nota = sc.nextFloat();
		if(nota >=0 && nota <3) {
			System.out.println("El resultado de la nota " + nota + " es MD");
		}else if(nota >=3 && nota <5) {
			System.out.println("El resultado de la nota " + nota + " es INS");
		}else if(nota >= 5 && nota <6) {
			System.out.println("El resultado de la nota " + nota + " es SUF");
		}else if(nota >= 6 && nota <7) {
			System.out.println("El resultado de la nota " + nota + " es BIEN");
		}
		else if(nota >= 7 && nota <9) {
			System.out.println("El resultado de la nota " + nota + " es NOT");
		}else if(nota >= 9 && nota <=10){
			System.out.println("El resultado de la nota " + nota + " es SOBRE");
		}else{
			System.out.println("El numero introducido " + nota + " es incorrecto");
		}
	}

}
