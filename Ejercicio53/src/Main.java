
public class Main {

	// TODO Auto-generated method stub
		/*
		 * Escribe una función a la que se pase como parámetros de entrada 
		 * una cantidad de días, horas y minutos.
		 * La función calculará y devolverá el número de segundos
		 * que existen en los datos de entrada.
		 */
	 public static void main(String[] args) {

	        int totalSegundos = calcularSegundos(2, 3, 15);
	        System.out.println("Total de segundos: " + totalSegundos);
	    }
	 
	  public static int calcularSegundos(int dias, int horas, int minutos) {
	        int segundos = 0;

	        segundos += dias * 24 * 60 * 60;   
	        segundos += horas * 60 * 60;       
	        segundos += minutos * 60;         

	        return segundos;
	   }
	}