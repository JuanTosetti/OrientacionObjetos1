package Ejer14VolumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {

	@Test
	public void testSuperficieDeColor() {
	    // Arrange
	    List<Pieza> piezas = new ArrayList<>();
	    ReporteDeConstruccion reporte = new ReporteDeConstruccion(piezas);
	    Esfera esfera1 = new Esfera("Plastico", "Rojo", 2.0);
	    Cilindro cilindro1 = new Cilindro("Plastico", "verde", 3.0, 2.0);
	    Cilindro cilindro2 = new Cilindro("Hierro", "Rojo", 5.0, 2.0);
	    reporte.agregarPieza(esfera1);
	    reporte.agregarPieza(cilindro1);
	    reporte.agregarPieza(cilindro2);
	    // Act
	    double superficieTotal = reporte.superficieDeColor("Rojo");
	    
	    // Assert
	    assertEquals(138.22, superficieTotal, 0.1);
	}
	
	@Test
	public void testVolumenDeMaterial() {
	    // Arrange
	    List<Pieza> piezas = new ArrayList<>();
	    ReporteDeConstruccion reporte = new ReporteDeConstruccion(piezas);
	    Esfera esfera1 = new Esfera("Plastico", "Rojo", 2.0);
	    Cilindro cilindro1 = new Cilindro("Plastico", "Verde", 3.0, 2.0);
	    PrismaRectangular prisma1 = new PrismaRectangular("Hierro", "Azul", 3.0, 1.0, 5.0);
	    
	    reporte.agregarPieza(esfera1);
	    reporte.agregarPieza(cilindro1);
	    reporte.agregarPieza(prisma1);
	    
	    // Act
	    double volumenTotal = reporte.volumenDeMaterial("Plastico");
	    
	    // Assert
	    assertEquals(71.2, volumenTotal, 0.1);
	}
	
}
