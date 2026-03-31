import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crear Persona");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        int edad;
        do {
            System.out.print("Edad:");
            edad = sc.nextInt();
            if (edad <= 0 || edad >= 122) {
            System.out.println("Edad no existente,introduzca de nuevo");
            }
        } while (edad <= 0 || edad >= 122);
        System.out.print("Sexo (H/M): ");
        String sexo = sc.next();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("\nInformación de la persona");
        System.out.println(persona.toString());    
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        int imc = persona.calcularIMC();
        switch (imc) {
            case Persona.PESO_BAJO:
                System.out.println("Está por debajo de su peso ideal.");
                break;
            case Persona.PESO_IDEAL:
                System.out.println("Está en su peso ideal.");
                break;
            case Persona.SOBREPESO:
                System.out.println("Tiene sobrepeso.");
                break;
        }
    }
}