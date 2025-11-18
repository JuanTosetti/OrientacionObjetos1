package Ejer15_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String Titulo;
	private String Cuerpo;
	private List<Archivo> archivos;
	
	
	
	public Email(String titulo, String cuerpo) {
		Titulo = titulo;
		Cuerpo = cuerpo;
		this.archivos = new ArrayList<Archivo>();
	}

	public Email() {
		this.archivos = new ArrayList<Archivo>();
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getCuerpo() {
		return Cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		Cuerpo = cuerpo;
	}
	
	public void agregarArchivo(Archivo archivo) {
		archivos.add(archivo);
	}
	//El tamaño de un email es la suma del largo del título, 
	//el largo del cuerpo, y 
	//del tamaño de sus adjuntos.

	public int calcularTamaño() {
		int suma = this.getTitulo().length() + this.getCuerpo().length();
		for(Archivo a : archivos) {
			suma += a.tamaño();
		}
		return suma;
	}
	
	
}
