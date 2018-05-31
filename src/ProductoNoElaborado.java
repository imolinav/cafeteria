import java.util.ArrayList;

public class ProductoNoElaborado {

	
	
	
	ArrayList<ProductoNoElaborado>productosNoElaborados =new ArrayList<ProductoNoElaborado>();
	String nombre;
	String fecha_cad;
	int stock;
	boolean gluten;
	boolean huevos;
	boolean lacteos;
	boolean frutos_secos;

	public ProductoNoElaborado(String nombre, String fecha_cad, int stock, boolean gluten, boolean huevos, boolean lacteos, boolean frutos_secos) {
		this.nombre=nombre;
		this.fecha_cad=fecha_cad;
		this.stock=stock;
		this.gluten = gluten;
		this.huevos = huevos;
		this.lacteos = lacteos;
		this.frutos_secos = frutos_secos;
	}
	
	public ProductoNoElaborado(String nombre, int stock) {
		this.nombre = nombre;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_cad() {
		return fecha_cad;
	}

	public void setFecha_cad(String fecha_cad) {
		this.fecha_cad = fecha_cad;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setAlergenos(boolean gluten, boolean huevos, boolean lacteos, boolean frutos_secos) {
		this.gluten = gluten;
		this.huevos = huevos;
		this.lacteos = lacteos;
		this.frutos_secos = frutos_secos;
	}

	public String alergenos() {
		String respuesta;
		if ((gluten==true) || (huevos==true) || (lacteos==true) || (frutos_secos==true)) {
			respuesta = "Esta comida contiene alérgenos";
		} else {
			respuesta = "Esta comida no contiene alérgenos";
		}
		return respuesta;
	}

	public String toString() {
		return this.nombre + "\n "
				+ "Cantidades disponibles: " + this.stock + 
				"\n Fecha de caducidad: " + this.fecha_cad +
				alergenos();
	}
	
	public void setAnyadirStock(int cantidad) {
		this.stock=this.stock+cantidad;
	}
	
}


