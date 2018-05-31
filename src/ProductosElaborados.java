
public class ProductosElaborados {
	
	private String nombre;
	private String fecha_fabricacion;
	private int stock;
	
	
	public ProductosElaborados (String nom, String fecha) {
		
		this.nombre=nom;
		this.fecha_fabricacion=fecha;
		
	}
	
	public String getProducto() {
		
		return this.nombre;
	}
	
	public String getFecha() {
		
		return this.fecha_fabricacion;
	}
	
	
	public void setNombre(String nom) {
		
		this.nombre=nom;
	}
	
	public void setFechaModificada (String fech) {
		
		this.fecha_fabricacion=fech;
	}
	
	public void modificarStock(int cant) {
		
		this.stock=this.stock+cant;
	}
	
	public int getStock() {
		
		return this.stock;
	}
	

}
