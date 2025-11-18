package figurasYCuerpos;

public class Cuerpo3D {
	private Figura2D caraBasal;
	private double Altura;
	
	public Cuerpo3D() {
	}

	public Cuerpo3D(Figura2D cuerpoBasal, double altura) {
		this.caraBasal = cuerpoBasal;
		Altura = altura;
	}
	
	public void setCaraBasal(Figura2D cuerpoBasal) {
		this.caraBasal = cuerpoBasal;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public Figura2D getCaraBasal() {
		return caraBasal;
	}
	
	public double getAltura() {
		return Altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * this.Altura;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * this.Altura;
	}
	
}
