package turismoEnTierraMedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto {

	private String nombre;
	private int costo;
	private double tiempo;
	private String tipo;
	private List<String> productos;
	

	public Producto(String nombre, int costo, double tiempo, String tipo) {
		this.nombre = nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.tipo = tipo;
		this.productos = new ArrayList<String>();
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
