package Ejer14VolumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrismaRectangularTest {

	@Test
	public void testObtenerVolumen(){
		//arrange 
		PrismaRectangular prisma = new PrismaRectangular("Hierro" ,"Gris", 3.0, 1.0,5.0);
		
		//act
		double volumen = prisma.obtenerVolumen();
		//assert
		assertEquals(15.0, volumen, 0.1);
	}
	
	@Test
	public void testObtenerSuperficie() {
		PrismaRectangular prisma = new PrismaRectangular("vibranio", "Negro", 3.0, 1.0, 5.0);
		
		double superficie = prisma.obtenerSuperficie();
		
		assertEquals(46.0,superficie,0.1);
	}
	
}
