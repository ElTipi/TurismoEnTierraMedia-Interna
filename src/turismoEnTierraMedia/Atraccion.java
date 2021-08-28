package turismoEnTierraMedia;

import java.util.Scanner;

public class Atraccion extends Producto {

	private int cupo;

	public Atraccion(String nombre, int costo, double tiempo, String tipo, int cupo) {
		super(nombre, costo, tiempo, tipo);
		this.cupo = cupo;
	}

	
	public Atraccion() {
		super();
	}


	public int getCupo() {
		return this.cupo;
	}
	
	
	//La comprobacion del cupo habria que hacerla cuando
	//se recorre la lista de atracciones.
	
	public void usarCupo(Usuario u) {
		//if (this.cupo > 0) {
		
		if (super.getCosto() <= u.getMonedas() && super.getTiempo() <= u.getTiempo()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Desea esta atraccion (s/n)");
			String acepta = sc.nextLine();
			acepta = acepta.toLowerCase();
			if (acepta == "s")
				this.cupo--;
			//sc.close();
		}
		//}	
	}
	
	
	
	
}
