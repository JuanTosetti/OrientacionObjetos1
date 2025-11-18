package Ejer14VolumenYSuperficieDeSolidos;

public class Cilindro extends Pieza {
	private double altura;
	private double radio;
	
	
	public Cilindro(String material, String color, double altura, double radio) {
		super(material, color);
		this.altura = altura;
		this.radio = radio;
	}


	public double getAltura() {
		return altura;
	}


	public double getRadio() {
		return radio;
	}

	@Override
	public double obtenerSuperficie(){
		return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
	}
	@Override
	public double obtenerVolumen(){
		return  Math.PI * Math.pow(radio, 2) * altura;
	}
}
