package genealogiaSalvaje;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador, String especie, Date fechaDeNacimiento, Mamifero padre, Mamifero madre) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.padre = padre;
		this.madre = madre;
	}
	public Mamifero() {
	}
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Mamifero getPadre() {
		return (this.padre != null) ? this.padre : null;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return (this.madre != null) ? this.madre : null;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno(){
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		//pregunto si los padres son iguales al mamifero que se paso
		if(this.padre == unMamifero || this.madre == unMamifero) {
			return true;
		}
		
		//sino pregunto si el papá no es null recorro el arbol genealogico hasta encotrar el mamifero
		if (this.padre != null && this.padre.tieneComoAncestroA(unMamifero)) {
			return true;
		}
		
		//sino pregunto si la mamá no es null recorro el arbol genealogico hasta encotrar el mamifero
		if(this.madre != null && this.madre.tieneComoAncestroA(unMamifero)) {
			return true;
		}
		
		//si no lo encontro
		return false;
	}
	
}
