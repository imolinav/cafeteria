
public class ProductoElaborado {
	private String nombre_plato;
	private String fecha_cad;
	private int stock;
	private boolean gluten;
	private boolean huevos;
	private boolean lacteos;
	private boolean frutos_secos;
	
	public ProductoElaborado(String nombre, String fecha_cad, int stock,boolean gluten, boolean huevos, boolean lacteos, boolean frutos_secos ) {
		this.nombre_plato=nombre;
		this.fecha_cad=fecha_cad;
		this.stock=stock;
		this.gluten=gluten;
		this.huevos=huevos;
		this.lacteos=lacteos;
		this.frutos_secos=frutos_secos;
	}
	
	public void setProductosElaborados(String nombre, String fecha_cad, int stock,boolean gluten, boolean huevos, boolean lacteos, boolean frutos_secos) {
		this.nombre_plato=nombre;
		this.fecha_cad=fecha_cad;
		this.stock=stock;
		this.gluten=gluten;
		this.huevos=huevos;
		this.lacteos=lacteos;
		this.frutos_secos=frutos_secos;
	}
	
	public ProductoElaborado(String nombre, int stock) {
		this.nombre_plato = nombre;
		this.stock = stock;
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
	
	public String getNombre() {
		return this.nombre_plato;
	}

	
	public String toString() {
		return this.nombre_plato + "\n "
				+ "Cantidades disponibles: " + this.stock + 
				"\n Fecha de caducidad: " + this.fecha_cad +
				alergenos();
	}

	public void setAnyadirStock(int cantidad) {
		this.stock=this.stock+cantidad;
	}
}
