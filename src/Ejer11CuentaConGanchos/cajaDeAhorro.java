package Ejer11CuentaConGanchos;

public class cajaDeAhorro extends Cuenta {

	public cajaDeAhorro() {
		super();
	}
	
	protected boolean puedeExtraer(double monto) {
		return this.calcularFinal(monto) >= 0 ? true: false;
	}
	
	private double calcularFinal(double monto) {
		return (this.getSaldo() - (this.getSaldo()*.02)) -monto;
	}
	
	@Override
	public boolean extraer(double monto) {
		double montoFinal = monto * 0.02;
		super.extraerSinControlar(montoFinal);
		return true;
	}
	
}
