import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected final String COLORDEFECTO = "verde";
    protected final char CONSUMODEFECTO = 'B';
    
    public Electrodomestico() {
        this.precio = 100;
        this.color = "blanco";
        this.consumoEnergetico = 100;
        this.peso = 5;
    }

    protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.color = "blanco";
        this.consumoEnergetico = 100;
        this.peso = peso;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    
    public double getPrecio() {
    	return this.precio;
    	}
    public String getColor() { 
    	return this.color;
    	}
    public char getConsumoEnergetico() {
    	return this.consumoEnergetico;
    	}

    
    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }
        return CONSUMODEFECTO;
    }

   
    private String comprobarColor(String color) {
        if (!color.isBlank()) {
            return color.toLowerCase();
        }
        return COLORDEFECTO;
    }

   
    public double precioFinal() {
        double precioFinal = this.precio;

        switch (this.consumoEnergetico) {
            case 'A': precioFinal += 100; break;
            case 'B': precioFinal += 80; break;
            case 'C': precioFinal += 60; break;
            case 'D': precioFinal += 50; break;
            case 'E': precioFinal += 30; break;
            case 'F': precioFinal += 10; break;
        }

        if (this.peso >= 0 && this.peso < 20) {
            precioFinal += 10;
        } else if (this.peso < 50) {
            precioFinal += 50;
        } else if (this.peso < 80) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }

    
    public String toString() {
        return "[Electrodoméstico] Color: " + this.color +
               " | Consumo: " + this.consumoEnergetico +
               " | Peso:" + this.peso +
               " | Precio final: $" + this.precioFinal();
    }
}