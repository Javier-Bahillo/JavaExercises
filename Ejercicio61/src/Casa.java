import java.util.Scanner;

public class Casa {
	
	// TODO Auto-generated method stub
	
	
    private Bombilla b1;
    private Bombilla b2;
    private Bombilla b3;

    public Casa() {
        b1 = new Bombilla();
        b2 = new Bombilla();
        b3 = new Bombilla();
    }

    public void encenderBombilla1() {
    	b1.encender();
    	}
    public void apagarBombilla1() {
    	b1.apagar();
    	}

    public void encenderBombilla2() {
    	b2.encender();
    	}
    public void apagarBombilla2() {
    	b2.apagar();
    	}

    public void encenderBombilla3() {
    	b3.encender();
    	}
    public void apagarBombilla3() {
    	b3.apagar();
    	}

    public void mostrarEstado() {
        System.out.println("Bombilla 1: " + (b1.estaEncendida() ? "Encendida" : "Apagada"));
        System.out.println("Bombilla 2: " + (b2.estaEncendida() ? "Encendida" : "Apagada"));
        System.out.println("Bombilla 3: " + (b3.estaEncendida() ? "Encendida" : "Apagada"));
    }

    public void apagarGeneral() {
    	Bombilla.apagarGeneral();
    	}
    public void encenderGeneral() {
    	Bombilla.encenderGeneral();
    	}
}