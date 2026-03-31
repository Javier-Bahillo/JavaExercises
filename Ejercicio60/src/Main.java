import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Sintonizador sintonizador = new Sintonizador();
	Sintonizador sintonizador2 = new Sintonizador(90);
	
	System.out.println("Introduce la frecuencia del sintonizador 3");
	double frecuencia = sc.nextDouble();
	Sintonizador sintonizador3 = new Sintonizador(frecuencia);
	System.out.println("La frecuencia del sintonizador 1 es: " + sintonizador.display());
	
	System.out.println("La frecuencia del sintonizador 2 es: " + sintonizador2.display());
	
	System.out.println("La frecuencia del sintonizador 3 es: " + sintonizador3.display());
	
	sintonizador.subirFrecuencia();
	System.out.println("La nueva frecuencia del sintonizador 1 es: " + sintonizador.display());
	
	sintonizador2.bajarFrecuencia();
	System.out.println("La nueva frecuencia del sintonizador 2 es: " + sintonizador2.display());
	
	sintonizador3.bajarFrecuencia();
	System.out.println("La frecuencia del sintonizador 3 es: " + sintonizador3.display());
	
	sintonizador3.subirFrecuencia();
	System.out.println("La frecuencia del sintonizador 3 es: " + sintonizador3.display());
	
	System.out.println(sintonizador2.toString());
	}
}