package ejer13_Inversores;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccionesTest {

    @Test
    public void testValorActual() {
        Acciones accion = new Acciones(10, "YPF", 150.0);
        assertEquals(1500.0, accion.ValorActual(), 0.01);
    }

    @Test
    public void testSettersYGetters() {
        Acciones accion = new Acciones(5, "Tesla", 200.0);

        accion.setCantidadDeAcciones(8);
        accion.setNombre("Apple");
        accion.setValorUnitario(300.0);

        assertEquals(8, accion.getCantidadDeAcciones());
        assertEquals("Apple", accion.getNombre());
        assertEquals(300.0, accion.getValorUnitario());
    }
}
