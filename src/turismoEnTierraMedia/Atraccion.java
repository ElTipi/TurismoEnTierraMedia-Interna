package turismoEnTierraMedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atraccion extends Producto {

	private int cupo;

	public Atraccion(String tipo, String nombre, int costo, double tiempo, int cupo) {
		super(nombre, costo, tiempo, tipo);
		this.cupo = cupo;
	}

	
	
	
	public Atraccion() {
		super();
	}


	public int getCupo() {
		return this.cupo;
	}
	
	public List<Atraccion> getAtracciones (String archivo) throws AtraccionException{
		
		List<Atraccion> atracciones = new ArrayList<Atraccion>();
		
		try{
			Scanner sc = new Scanner(new File("archivos/atracciones.csv"));
			
			while(sc.hasNext()) {
				String linea = sc.nextLine(); 
				String[] datos = linea.split(",");
				if(datos.length != 5) {
					throw new AtraccionException("Cantidad de parametros incorrectos");
				}
				String tipo = datos[0];
				String nombre = datos[1];
				int costo = Integer.parseInt(datos[2]);
				double tiempo = Double.parseDouble(datos[3]);
				int cupo = Integer.parseInt(datos[4]);
				
				Atraccion at = new Atraccion(tipo, nombre, costo, tiempo, cupo);
				if(!atracciones.contains(at))
					atracciones.add(at);
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		
		return atracciones;
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
