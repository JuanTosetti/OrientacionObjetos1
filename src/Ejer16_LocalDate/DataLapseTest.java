package Ejer16_LocalDate;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLapseTest {
	private LocalDate from;
	private LocalDate to;
	private DataLapse intervalo;
	
	@BeforeEach 
	void setUp(){
		from = LocalDate.of(2025, 3, 10);
		to = LocalDate.of(2025, 5, 21);
		intervalo = new DataLapse(from, to);
	}
	
	@Test
	void testIncluedDate() {
		//Arrange
		LocalDate fecha = LocalDate.of(2025, 3, 12);

		//Assert
		assertTrue(intervalo.includesDate(fecha));
		
	}
	
	@Test
	void testSizeDays() {
		assertEquals(72, intervalo.sizeInDays());
	}
	
	//Casos Borde: la fecha no esta dentro del rango 
	@Test
	void testNoIncluedDate() {
		LocalDate fecha = LocalDate.of(2022, 1, 1);
		
		assertFalse(intervalo.includesDate(fecha));
	}
	
	@Test
	void testFechaBordeInclueds() {
		
		assertTrue(intervalo.includesDate(from));
	}
	
}
