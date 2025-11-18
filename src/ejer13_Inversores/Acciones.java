package ejer13_Inversores;

public class Acciones extends Inversion {
	private int cantidadDeAcciones;
	private String nombre;
	private double valorUnitario;

	public Acciones(int cantidadDeAcciones, String nombre, double valorUnitario) {
		this.cantidadDeAcciones = cantidadDeAcciones;
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
	}

	public int getCantidadDeAcciones() {
		return cantidadDeAcciones;
	}

	public void setCantidadDeAcciones(int cantidadDeAcciones) {
		this.cantidadDeAcciones = cantidadDeAcciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double ValorActual() {
		return cantidadDeAcciones * valorUnitario;
	}
	
}
