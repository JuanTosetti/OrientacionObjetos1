package Ejer19_AlquilerDePropiedades;

public class Reserva {
	private Inmueble inmueble;
	private DataLapse periodo;
	private Usuario usuario;
	
	
	public Reserva(Inmueble inmueble,Usuario usuario, DataLapse periodo) {
		this.inmueble = inmueble;
		this.periodo = periodo;
		this.usuario = usuario;
	}


	public Inmueble getInmueble() {
		return inmueble;
	}


	public DataLapse getPeriodo() {
		return periodo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public double obtenerPrecioTotal() {
		return periodo.sizeInDays()* inmueble.getPrecioPorNoche();
	}
	
	
}
