package ejer13_Inversores;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class InversorTest {
    
    private Inversor inversor;
    private Acciones accion1;
    private Acciones accion2;
    private PlazoFijo plazo;

    @BeforeEach
    public void setUp() {
        inversor = new Inversor();
        accion1 = new Acciones(10, "YPF", 100.0);
        accion2 = new Acciones(5, "Tesla", 200.0);

        plazo = new PlazoFijo();
        plazo.setFechaConstitucion(LocalDate.now().minusDays(5));
        plazo.setMontoDepositado(1000.0);
        plazo.setPorcentajeInteresDiario(0.01);
    }

    @Test
    public void testAgregarInversion() {
        inversor.AgregarInversion(accion1);
        inversor.AgregarInversion(plazo);

        double esperado = accion1.ValorActual() + plazo.ValorActual();
        assertEquals(esperado, inversor.ValorActual(), 0.01);
    }

    @Test
    public void testQuitarInversionExistente() {
        inversor.AgregarInversion(accion1);
        inversor.QuitarInversion(accion1);
        assertEquals(0.0, inversor.ValorActual(), 0.01);
    }

    @Test
    public void testQuitarInversionInexistente() {
        inversor.AgregarInversion(accion1);
        inversor.QuitarInversion(accion2); // no estaba
        // La inversión existente sigue estando
        assertEquals(accion1.ValorActual(), inversor.ValorActual(), 0.01);
    }

    @Test
    public void testValorActualSinInversiones() {
        assertEquals(0.0, inversor.ValorActual(), 0.01);
    }
}
