package Ejer17_DataLapse;

import java.time.LocalDate;

public class DataLapse {
	private LocalDate from;
	private int sizeInDays;
	
	public DataLapse(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}
	
	public int sizeInDays() {
		return sizeInDays;
	}
	
	public boolean incluedDate(LocalDate other) {
		return (other.equals(from) || other.isAfter(from)) &&
				(other.equals(this.getTo()) || other.isBefore(this.getTo()));
	}
	
	
	
	
	
}
