package Ejer19_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inmueble {
	private String nombre;
	private String direccion;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Inmueble(String nombre, String direccion, double precioPorNoche) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		reservas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public List<Reserva> getReserva() {
		return reservas;
	}
	
	public boolean estaDisponible(DataLapse periodo) {
		for(Reserva r :reservas) {
			if(r.getPeriodo().overlaps(periodo)) {
				return false; //se superpone con un periodo -> No esta disponible
			}
		}
		return true; //No se super pone -> Esta disponible
	}
	
	public Reserva crearReserva(Usuario user, DataLapse periodo) {
		if(this.estaDisponible(periodo)) {
			Reserva nueva = new Reserva(this,user, periodo);
			reservas.add(nueva);
			return nueva;
		}else {
			System.out.println("No se pudo cargar la reserva");
			return null;
		}
		
	}
	
	
	
}
