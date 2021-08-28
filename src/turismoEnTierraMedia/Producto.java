package turismoEnTierraMedia;

public abstract class Producto {

	private String nombre;
	private int costo;
	private double tiempo;
	private String tipo;
	private String[] productos;
	

	public Producto(String nombre, int costo, double tiempo, String tipo) {
		this.nombre = nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.tipo = tipo;
		this.productos = new String[0];
	}

	public Producto() {		
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getCosto() {
		return this.costo;
	}

	public double getTiempo() {
		return this.tiempo;
	}

	public String getTipo() {
		return this.tipo;
	}
	
	
	
}
