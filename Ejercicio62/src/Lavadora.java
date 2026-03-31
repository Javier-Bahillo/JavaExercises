import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;
    private final int CARGADEFECTO = 5;

    public Lavadora() {
        super();
        this.carga = CARGADEFECTO;
    }

    public Lavadora(double precio, double peso) {
        super(precio,peso);
        this.carga = CARGADEFECTO;
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() { return this.carga; }

    
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    
    public String toString() {
        return "[Lavadora] Color: " + this.color +
               " | Consumo: " + this.consumoEnergetico +
               " | Carga:" + this.carga +
               " | Color:" + this.color +
               " | Peso:" + this.peso +
               " | Precio final: $" + this.precioFinal();
    }
}