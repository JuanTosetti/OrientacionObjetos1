package ejer13_Inversores;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {

    @Test
    public void testValorActualConInteres() {
        PlazoFijo plazo = new PlazoFijo();
        plazo.setFechaConstitucion(LocalDate.now().minusDays(10));
        plazo.setMontoDepositado(1000.0);
        plazo.setPorcentajeInteresDiario(0.01); // 1% diario

        double esperado = 1000 + (1000 * 0.01 * 10);
        assertEquals(esperado, plazo.ValorActual(), 0.01);
    }

    @Test
    public void testValorActualSinDiasTranscurridos() {
        PlazoFijo plazo = new PlazoFijo();
        plazo.setFechaConstitucion(LocalDate.now());
        plazo.setMontoDepositado(2000.0);
        plazo.setPorcentajeInteresDiario(0.02);

        assertEquals(2000.0, plazo.ValorActual(), 0.01);
    }
}
