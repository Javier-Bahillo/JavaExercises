import java.util.Scanner;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;
    
    private final int RESOLUCIONDEFECTO = 20;
    private final boolean SINTONIZADORDEFECTO = false;

    public Television() {
        super();
        this.resolucion = RESOLUCIONDEFECTO;
        this.sintonizadorTDT = SINTONIZADORDEFECTO;
    }

    public Television(double precio, double peso) {
    	super(precio,peso);
    	this.resolucion = RESOLUCIONDEFECTO;
    	this.sintonizadorTDT = SINTONIZADORDEFECTO;
    }

    public Television(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
    	return this.resolucion;
    	}
    public boolean isSintonizadorTDT() {
    	return this.sintonizadorTDT;
    	}

    
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }
        if (this.sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    
    protected void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	protected void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public String toString() {
        return "[Televisión] Color: " + this.color +
               " | Consumo: " + this.consumoEnergetico +
               " | Peso:" + this.peso +
               " | Color:" + this.color +
               " | Resolucion" + this.resolucion +
               " | SintonizadorTDT" + this.sintonizadorTDT +
               " | Precio final: $" + this.precioFinal();
    }
}