package Ejer11CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	private cajaDeAhorro caja;
	
	@BeforeEach
	public void setUp() {
		caja = new cajaDeAhorro();
	}
	
	@Test
	public void depositoSimple() {
		caja.depositar(100);
		assertEquals(98.0, caja.getSaldo(), 0.01);
		//           ↑            ↑          ↑  
		//     S. Esperado / S.actual / margen de error
	}
	
	@Test
	public void testExtraccionExitosa() {
		caja.depositar(100);
		boolean resultado = caja.extraer(50);
		
		assertTrue(resultado); //verificar que sea True
		assertEquals(47.0, caja.getSaldo(),0.1);//verifica el saldo
	}
	
	@Test 
	public void testExtraccionFallida(){
		caja.depositar(50);
		boolean resultado = caja.extraer(100);
		
		assertFalse(resultado);
		assertEquals(47.0,caja.getSaldo(),0.1);
	}
	

}
