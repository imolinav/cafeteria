public class Menu {
	
	String plato1;
	String plato2;
	String bebida;
	String postre;
	
	public Menu (String plato1, String plato2, String bebida, String postre) {
		this.plato1 = plato1;
		this.plato2 = plato2;
		this.bebida = bebida;
		this.postre = postre;
	}
	
		
	public String getPlato1() {
		return this.plato1;
	}
	
	public void setPlato1(String plato1) {
		this.plato1 = plato1;
	}
	
	public String getPlato2() {
		return this.plato2;
	}
	
	public void setPlato2(String plato2) {
		this.plato2 = plato2;
	}
	
	public String getBebida() {
		return this.bebida;
	}
	
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	
	public String getPostre() {
		return this.postre;
	}
	
	public void setPostre(String postre) {
		this.postre = postre;
	}
	
	public String toString() {
		return "Menú" + 
	"\n Plato 1: " + plato1 + 
	"\n Plato2: " + plato2 + 
	"\n Bebida: " + bebida + 
	"\n Postre: " + postre;
	}
}
