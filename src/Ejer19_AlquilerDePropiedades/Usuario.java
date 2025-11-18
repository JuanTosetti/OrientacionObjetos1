package Ejer19_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Inmueble> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		propiedades = new ArrayList<Inmueble>();
		reservas = new ArrayList<Reserva>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return dni;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public List<Inmueble> getPropiedades() {
		return propiedades;
	}
	
	
	
	
}
