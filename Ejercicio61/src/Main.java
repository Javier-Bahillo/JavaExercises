import java.util.Scanner;

public class Main {
	
	// TODO Auto-generated method stub
	
	
    public static void main(String[] args) {
        Casa casa = new Casa();

       
        casa.encenderBombilla1();
        casa.encenderBombilla2();

        System.out.println("Estado inicial:");
        casa.mostrarEstado();

        casa.apagarGeneral();
        System.out.println("\nTras apagar interruptor general:");
        casa.mostrarEstado();

        casa.encenderGeneral();
        System.out.println("\nTras encender interruptor general:");
        casa.mostrarEstado();
    }
}