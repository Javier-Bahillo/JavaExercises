import java.util.Random;

public class Persona {
    
    private String nombre;
    private int edad;
    private String CI;
    private String sexo;
    private double peso;
    private double altura;
   
    public static final int PESO_BAJO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1; 

	public Persona() {
	        this.nombre = "";
	        this.edad = 0;
	        this.sexo = "H";
	        this.peso = 0;
	        this.altura = 0;
	        this.CI = generaCI();
	    }    
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.CI = generaCI();
    }  
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.CI = generaCI();
    }
    public int calcularIMC() {
        if (altura <= 0) {
            return 0;
        }
        double imc = peso/(altura*altura);
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private String comprobarSexo(String sexo) {
        if (sexo == "H" || sexo == "M") {
            return sexo;
        } else {
            return "H";
        }
    }

    private String generaCI() {
        Random rand = new Random();
        StringBuilder ci = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            ci.append(rand.nextInt(10));
        }
        return ci.toString();
    }

    public String toString() {
        return  "\n nombre='" + nombre + '\'' +
                "\n edad=" + edad +
                "\n CI='" + CI + '\'' +
                "\n sexo=" + sexo +
                "\n peso=" + peso +"kg," +
                "\n altura=" + altura + "m";
    }
    public String getNombre() {
    	return nombre;
    	}
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    	}
    public int getEdad() {
    	return edad;
    	}
    public void setEdad(int edad) {
    	this.edad = edad;
    	}
    public String getCI() {
    	return CI;
    	}
    public String getSexo() {
    	return sexo;
    	}
    public void setSexo(String sexo) {
    	this.sexo = comprobarSexo(sexo);
    	}
    public double getPeso() {
    	return peso;
    	}
    public void setPeso(double peso) {
    	this.peso = peso;
    	}
    public double getAltura() {
    	return altura;
    	}
    public void setAltura(double altura) {
    	this.altura = altura;
    	}
}