import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Main cafeteria = new Main();
		cafeteria.menu();
	}

	public void menu() {
		String plato1 = "", plato2 = "", postre = "";
		Almacen almacen1 = new Almacen(10, 60);
		int opcion;
		System.out.println("Elija la opción que desea realizar:");
		System.out.println("-----------------------------------");
		System.out.println("Introducir materias primas [1]");
		System.out.println("Consultar materias primas [2]");
		System.out.println("Modificar materias primas [3]");
		System.out.println("Crear platos [4]");
		System.out.println("Consultar platos [5]");
		System.out.println("Generar menú del día [6]");
		System.out.println("Ver menú del dia [7]");
		System.out.println("Consultar alérgenos [8]");
		System.out.println("Salir [0]");
		System.out.println("-----------------------------------");
		System.out.print("_");
		opcion = teclado.nextInt();
		teclado.nextLine();
		switch (opcion) {
		case 0:
			System.out.println("Gracias por usar nuestros servicios!");
			System.out.println("Vuelva pronto!");
			break;
		case 1:
			System.out.println("Introducir materias primas.");
			String nombre;
			int cantidad;
			System.out.print("Introduce el nombre: ");
			nombre = teclado.next();
			System.out.print("Introduce la cantidad: ");
			cantidad = teclado.nextInt();
			almacen1.AnyadirProductoNoElaborado(nombre, cantidad);
			System.out.println("");
			System.out.println("");
			menu();
		case 2:
			System.out.println("Consultar materias primas.");
			almacen1.MostrarProducto();
			System.out.println("");
			System.out.println("");
			menu();
		case 3:
			int opcion2;
			System.out.println("Modificar materias primas.");
			System.out.println("Modificar nombre [1]: ");
			System.out.println("Modificar fecha de caducidad [2]");
			System.out.println("Modificar alérgenos [3]");
			System.out.println("Salir [4]");
			opcion2 = teclado.nextInt();
			teclado.nextLine();
			switch (opcion2) {
			case 4:
				menu();
				break;
			case 1:
				String nombreAnt;
				String nombreNuevo;
				System.out.print("Introduce nombre anterior: ");
				nombreAnt = teclado.nextLine();
				int pos = almacen1.cambiarNombrePNE(nombreAnt);
				if (pos == -1) {
					System.out.println("El producto no existe.");
				} else {
					System.out.print("Introduce nombre nuevo: ");
					nombreNuevo = teclado.nextLine();
					almacen1.setNombrePNE(nombreAnt, nombreNuevo);
				}
				menu();
			case 2:
				String nombreProducto;
				String fechaNueva;
				System.out.print("Introduce el producto: ");
				nombreProducto = teclado.nextLine();
				int pos2 = almacen1.cambiarNombrePNE(nombreProducto);
				if (pos2 == -1) {
					System.out.println("El producto no existe.");
				} else {
					System.out.print("Introduce fecha nueva: ");
					fechaNueva = teclado.nextLine();
					almacen1.setFechaPNE(nombreProducto, fechaNueva);
				}
				menu();
			}
		case 6:
			System.out.println("Generar menú del día.");
			plato1 = almacen1.crearMenu();
			plato2 = almacen1.crearMenu();
			postre = almacen1.crearMenu();				
			System.out.println("");
			System.out.println("");
			menu();
		case 7:
			System.out.println("Ver menú del día.");
			System.out.println("Menú del dia: ");
			System.out.println("Plato 1: " + plato1 + "\n Plato 2: "+ plato2 + "\n Postre: " + postre);
			System.out.println("");
			System.out.println("");
			menu();
		case 8:
			System.out.println("Consultar alérgenos.");
			String producto;
			System.out.println("De que producto quieres comprobar los alergenos: ");
			producto = teclado.next();
			almacen1.alergenos(producto);
			System.out.println("");
			System.out.println("");
			menu();
		}
	}
}


