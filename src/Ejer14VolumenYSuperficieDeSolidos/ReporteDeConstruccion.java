package Ejer14VolumenYSuperficieDeSolidos;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;

	public ReporteDeConstruccion(List<Pieza> piezas) {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza unaPieza) {
		piezas.add(unaPieza);
		System.out.println("PIEZA AGREGADA");
	}
	
	public double volumenDeMaterial(String unMaterial) {
		double total = 0.0;
		for(Pieza p : piezas) {
			if(p.getMaterial().equals(unMaterial)) {
				total += p.obtenerVolumen();
			}
		}
		return total;
	}
	
	public double superficieDeColor(String unColor) {
		double total = 0.0;
		
		for(Pieza p : piezas) {
			if(p.getColor().equals(unColor)) {
				total += p.obtenerSuperficie();
			}
		}
		return total;
	}
	

}
