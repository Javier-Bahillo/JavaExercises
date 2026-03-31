import java.util.Scanner;

public class Maximini {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Maximini que calcula 
		 * el valor máximo y mínimo de unos números introducidos
		 * por teclado. La introducción de números cesará cuando 
		 * se introduzca un numero negativo que no será
		 * tenido en cuenta.
		 */
		
		int numero = 0;
		int valorMaximo = 0;
		int valorMinimo = 0;
		//int contador=0;
		boolean primera = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca varios nº hasta uno negativo");
		
		do {
			numero = sc.nextInt();
			//contador++;
			if (numero>=0) {
				
					//if(contador==1){
				if(primera) {
					valorMaximo=numero;
					valorMinimo=numero;
					primera=false;
				}else {
					if(numero>valorMaximo){
						valorMaximo=numero;
					}
					if(numero<valorMinimo){
						valorMinimo=numero;
					}
				}
				//el numero calculado maximo y minimo
				
				
			}else{
				System.out.println("Nº negativo introducido.");
				System.out.println("Adios");
			}
		} while (numero>=0);
		
		System.out.println("El nº maximo es " + valorMaximo + " y el nº minimo es " + valorMinimo);
		
		
		
	}

}
