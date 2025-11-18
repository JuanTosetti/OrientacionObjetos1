package Ejer15_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarEmail(Email email) {
		emails.add(email);
	}
	
	private void eliminarEmail(Email email) {
		emails.remove(email);
	}
	
	public List<Email> getEmails(){
		return emails;
	}
	
	public void mover(ClienteDeCorreo persona, Email email, Carpeta destino) { 
		if(destino != null && persona.verificarCarpeta(destino)) {
			eliminarEmail(email);
			destino.agregarEmail(email);
			System.out.println("Se movio el email a carpeta " + destino.getNombre());
		}else {
			System.out.println("No se puedo mover el email");
		}
	}
	
	public int calcularTamaño() {
		int suma = 0;
		for(Email e : emails) {
			suma += e.calcularTamaño();
		}
		return suma;
	}
}
