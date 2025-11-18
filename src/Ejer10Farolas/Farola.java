package Ejer10Farolas;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendida = false;
	private List<Farola> vecinas;
	
	//constructor
	public Farola() {
		this.vecinas = new ArrayList<Farola>();
	}
	
	
	
	//modulos
	public void pairWithNeighbor(Farola otraFarola) {
		this.vecinas.add(otraFarola);
		otraFarola.vecinas.add(this);
	}
	
	public void turnOn() {
		if(!this.encendida) {
			this.encendida = true;
			
			//encender vecinas
			for(Farola vecina : this.vecinas) {
				vecina.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(this.encendida) {
			this.encendida = false;
			
			//apagar todas
			for(Farola vecina : this.vecinas)
				vecina.turnOff();
		}
	}
	
	public boolean isOn() {
		return this.encendida;
	}
	
	public boolean isOff() {
		return !this.encendida;
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	
}
