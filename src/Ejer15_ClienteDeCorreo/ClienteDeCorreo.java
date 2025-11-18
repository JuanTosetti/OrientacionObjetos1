package Ejer15_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private String nombre;
	private String correo;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(String nombre, String correo) {
		this.nombre = nombre;
		this.correo = correo;
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public List<Carpeta> getCarpetas() {
		return carpetas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	//Recibir() funciona cuando el email no es nulo y hay carpetas creadas anteriormente
	public void recibir(Email email) {
		if(email != null && !carpetas.isEmpty()) {
			carpetas.get(0).agregarEmail(email);
			System.out.println("Email recibido");
		}
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public Email buscar(String texto) {
		for(Carpeta c : carpetas) {
			for(Email e : c.getEmails()) {
				if(e.getTitulo().contains(texto) || e.getCuerpo().contains(texto)) {
					return e;
				}
			}
		}
		return null;
	}
	
	//este metodo verifica que una carpeta este en la lista de carpetas
	public boolean verificarCarpeta(Carpeta carpeta) {
		if (getCarpetas().contains(carpeta)) {
			return true;
		}
		return false;
	}
	
	
}
