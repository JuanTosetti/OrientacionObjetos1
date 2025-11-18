package Ejer14VolumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EsferaTest {

	@Test
	public void testObtenerSuperficie() {
		//Arrange
		Esfera esfera1 = new Esfera("Plastico", "Rojo", 2.0);
		
		//ACT
		double superficie = esfera1.obtenerSuperficie();
		//ASSERT (valor esperado, valor actual, tolerancia)
		assertEquals(50.256, superficie, 0.1);
	}
	
	@Test
	public void testObtenerVolumen() {
		//arrange
		Esfera esfera1 = new Esfera("Madera", "violeta", 2.0);
		//act
		double volumen = esfera1.obtenerVolumen();
		//assert
		assertEquals(33.51,volumen,0.1);
	}
	

}
