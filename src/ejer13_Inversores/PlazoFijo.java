package ejer13_Inversores;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion{
	private LocalDate fechaConstitucion;
	private double montoDepositado;
	private double porcentajeInteresDiario;
	
	public PlazoFijo() {
	}

	public void setFechaConstitucion(LocalDate fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public void setPorcentajeInteresDiario(double porcentajeInteresDiario) {
		this.porcentajeInteresDiario = porcentajeInteresDiario;
	}
	
	private long calcularDias() {
		return ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
	}
	
	public double ValorActual() {
		return this.montoDepositado + (this.montoDepositado * this.porcentajeInteresDiario * calcularDias());
	}
	
	
}
