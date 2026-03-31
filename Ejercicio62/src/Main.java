import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Electrodomestico e1 = new Electrodomestico(200, "rojo", 'B', 60);
//        Lavadora l1 = new Lavadora(300, "azul", 'A', 40, 35);
//        Television t1 = new Television(500, "negro", 'C', 20, 50, true);
//
//        System.out.println(e1);
//        System.out.println(l1);
//        System.out.println(t1);
        
    	System.out.println("Menú Electrodomesticos");
    	System.out.println("1 : Electrodomésticos");
    	System.out.println("2 : Lavadora");
    	System.out.println("3 : Televesión");
    	System.out.println("4 : Salir");
    	System.out.println("Elija una opción :");
    	
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		//hacer bucle hasta que se pulse el 4
		switch (opcion) {
		case 1:
			crearElectrodomestico();
			break;
		case 2:
			crearLavadora();
			break;
		case 3:
			crearTelevision();
			break;
		case 4:
			break;
		default:
			System.out.println("Opción no válida");
			break;
		}
    }

	private static void crearTelevision() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//resolucion sintonizador
		System.out.println("Introduce el precio");
		int precio = sc.nextInt();
		 System.out.println("Introduce el peso");
		  int peso = sc.nextInt();
		 System.out.println("Introduce la resolucion");
		  int resolucion = sc.nextInt();
		  System.out.println("Introduce el sintonizador");
		  boolean sintonizadorTDT = sc.nextBoolean();
		  Television t1 = new Television(precio,peso);
		  t1.setResolucion(resolucion);
		  t1.setSintonizadorTDT(false);
		  System.out.println(t1.toString());
	}

	private static void crearLavadora() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//carga
		System.out.println("Introduce el precio");
		int precio = sc.nextInt();
		 System.out.println("Introduce el color");
		  String color = sc.next();
		 System.out.println("Introduce el consumo energetico");
		  char consumoEnergetico = sc.next().charAt(0);
		 System.out.println("Introduce el peso");
		  int peso = sc.nextInt();
		 System.out.println("Introduce la carga");
		  int carga = sc.nextInt();
		 Lavadora l1 = new Lavadora(precio,color,consumoEnergetico,peso,carga);
		 System.out.println("Lavadora con parámetros");
		 System.out.println(l1.toString());
	}

	private static void crearElectrodomestico() {
		// TODO Auto-generated method stub
//		  precio,color consumo energetico
		Electrodomestico e1 = new Electrodomestico();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio");
		  int precio = sc.nextInt();
		  System.out.println("Introduce el color");
		  String color = sc.next();
		  System.out.println("Introduce el consumo energetico");
		  char consumoEnergetico = sc.next().charAt(0);
		  System.out.println("Introduce el peso");
		  int peso = sc.nextInt();
		  System.out.println("Electrodoméstico por defecto" +   e1.toString());
		  e1.setPrecio(precio);
		  e1.setColor(color);
		  e1.setConsumoEnergetico(consumoEnergetico);
		  e1.setPeso(peso);
		  System.out.println("Electrodoméstico final" + e1.toString());		  
		  
	}
}