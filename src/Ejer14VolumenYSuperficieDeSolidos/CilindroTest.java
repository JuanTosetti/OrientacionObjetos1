package Ejer14VolumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CilindroTest {

	@Test
	void testobtenerSuperficie() {
		Cilindro cilindro = new Cilindro("Hierro", "verde", 3.0, 2.0);
		double superficie = cilindro.obtenerSuperficie();
		assertEquals(62.83, superficie, 0.1);
	}
	
	@Test
	void testObtenerVolumen() {
		Cilindro cilindro = new Cilindro("Hierro", "verde", 3.0, 2.0);
		double volumen = cilindro.obtenerVolumen();
		assertEquals(37.69, volumen, 0.1);
	}

}
