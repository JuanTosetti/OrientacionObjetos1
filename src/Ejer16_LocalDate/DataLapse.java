package Ejer16_LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse {
	private LocalDate from;
	private LocalDate to;

	public DataLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}
	
	//metodo que devuelve la cantidad de dias entre "from" y "to"
	public int sizeInDays() {
		return (int) from.until(to, ChronoUnit.DAYS);
	}
	
	//este metodo devuelve true si la fecha esta entre la fecha "from" y "to"
	public boolean includesDate(LocalDate other) {
		return (other.equals(from) || other.isAfter(from)) &&
				(other.equals(to) || other.isBefore(to));
	}
	
}
