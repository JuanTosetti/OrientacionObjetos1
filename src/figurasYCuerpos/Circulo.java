package figurasYCuerpos;

public class Circulo implements Figura2D {
	private double radio;

	public Circulo() {
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	
}
