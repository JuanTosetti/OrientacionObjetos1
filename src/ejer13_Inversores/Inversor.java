package ejer13_Inversores;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;

	
	public Inversor() {
		this.inversiones = new ArrayList<Inversion>();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void AgregarInversion(Inversion unaInversion) {
		inversiones.add(unaInversion);
		System.out.println("Se agrego la inversion correctamente");
	}
	
	public void QuitarInversion(Inversion unaInversion) {
		if( !inversiones.isEmpty()) {
			boolean eliminada = inversiones.remove(unaInversion);
			
			String mensaje = eliminada 
					? "SE ELIMINO ACCION CORRECTAMENTE"
					: "LA ACCION NO SE ENCONTRO";
			System.out.println(mensaje);
		
		}else {
			System.out.println("NO SE ENCONTRARON ACCIONES EN SU CARTERA");
		}
	}
	
	public double ValorActual() {
		double suma = 0.0;
		for(Inversion inver : inversiones) {
			suma += inver.ValorActual();
		}
		return suma;
	}
}
