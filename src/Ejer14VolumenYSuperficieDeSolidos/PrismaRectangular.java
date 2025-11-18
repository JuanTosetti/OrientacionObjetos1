package Ejer14VolumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	
	public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}


	public double getLadoMayor() {
		return ladoMayor;
	}


	public double getLadorMenor() {
		return ladoMenor;
	}


	public double getAltura() {
		return altura;
	}
	
	@Override
	public double obtenerSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
	@Override
	public double obtenerVolumen() {
		return ladoMayor * ladoMenor * altura;
	}
}
