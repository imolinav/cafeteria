import java.util.ArrayList;
public class Almacen {

	private float temperatura;
	private float humedad;
	private ArrayList<ProductoElaborado> productosElaborados = new ArrayList<>();
	public ArrayList<ProductoNoElaborado> productosNoElaborados = new ArrayList<>();

	public Almacen(float temperatura, float humedad)
	{
		this.temperatura=temperatura;
		this.humedad=humedad;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getHumedad() {
		return humedad;
	}

	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}

	public void AnyadirProductoNoElaborado(String p, int cantidad)//pasar todos los atributos
	{
		for(ProductoNoElaborado i: productosNoElaborados){
			String nom=i.getNombre();
			if (nom==p){
				i.setAnyadirStock(cantidad);
			}else{
				ProductoNoElaborado prod=new ProductoNoElaborado(p,cantidad);
				productosNoElaborados.add(prod);
			}
		}
	}

	public void AnyadirProductoElaborado(String p, int cantidad)//pasar todos los atributos
	{
		for(ProductoElaborado i: productosElaborados){
			String nom=i.getNombre();
			if (nom==p){
				i.setAnyadirStock(cantidad);
			}else{
				ProductoElaborado prod=new ProductoElaborado(p,cantidad);
				productosElaborados.add(prod);
			}
		}
	}

	public int cambiarNombrePNE(String nombre) {
		return productosNoElaborados.indexOf(nombre);
	}
	
	public void setNombrePNE(String nombreAnt, String nombreNuevo) {
		for(ProductoNoElaborado i : productosNoElaborados) {
			if (i.getNombre() == nombreAnt) {
				i.setNombre(nombreNuevo);
			}
		}
	}
	
	public void setFechaPNE(String nombreProducto, String fechaNueva) {
		for(ProductoNoElaborado i : productosNoElaborados) {
			if (i.getNombre() == nombreProducto) {
				i.setFecha_cad(fechaNueva);
			}
		}
	}
	
	public String crearMenu() {
		int posicion = (int) Math.floor(Math.random()*productosElaborados.size());
		return productosElaborados.get(posicion).getNombre();
		
		
	}
	
	public String alergenos(String producto) {
		String respuesta = "";
		for (ProductoElaborado i : productosElaborados) {
			if (i.getNombre() == producto) 
				respuesta = i.alergenos();
		}
		return respuesta;
	}


	public void MostrarProducto() {
		for(ProductoNoElaborado i: productosNoElaborados){
			System.out.println(i);
		}
	}
}