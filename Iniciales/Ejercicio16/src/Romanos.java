import java.util.Scanner;

public class Romanos {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("El número debe ser entre 1 y 99");
        } else {
            int decena = numero / 10;
            int unidad = numero % 10;

            String numeroRomano = "";

            switch (decena) {
                case 1: 
                	numeroRomano += "X";
                	break;
                case 2: 
                	numeroRomano += "XX"; 
                	break;
                case 3: 
                	numeroRomano += "XXX"; 
                	break;
                case 4: 
                	numeroRomano += "XL"; 
                	break;
                case 5: 
                	numeroRomano += "L"; 
                	break;
                case 6: 
                	numeroRomano += "LX"; 
                	break;
                case 7: 
                	numeroRomano += "LXX"; 
                	break;
                case 8: 
                	numeroRomano += "LXXX"; 
                	break;
                case 9: 
                	numeroRomano += "XC"; 
                	break;
                default: break;
            }

            switch (unidad) {
                case 1: 
                	numeroRomano += "I"; 
                	break;
                case 2: 
                	numeroRomano += "II"; 
                	break;
                case 3: 
                	numeroRomano += "III"; 
                	break;
                case 4: 
                	numeroRomano += "IV"; 
                	break;
                case 5: 
                	numeroRomano += "V"; 
                	break;
                case 6: 
                	numeroRomano += "VI"; 
                	break;
                case 7: 
                	numeroRomano += "VII"; 
                	break;
                case 8: 
                	numeroRomano += "VIII"; 
                	break;
                case 9: 
                	numeroRomano += "IX"; 
                	break;
                default: 
                	System.out.println("No es válido este nº");
                	break;
            }

            System.out.println("El número " + numero + " en romano sería: " + numeroRomano);
        }

    }
}
