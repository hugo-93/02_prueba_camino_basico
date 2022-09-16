/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LimpiaParabrisas;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaLimpiaParabrisas {
    
    // Método de prueba
    @Test
    public void LimpiaParabrisasTablaDeCondiciones()
    {
        LimpiaParabrisas lp = new LimpiaParabrisas();
        assertEquals(lp.LimpiaParabrisas(7, LimpiaParabrisas.DIAL_POSICION_1), 0);
        assertEquals(lp.LimpiaParabrisas(LimpiaParabrisas.PALANCA_POSICION_OFF, LimpiaParabrisas.DIAL_POSICION_1), 0);
        assertEquals(lp.LimpiaParabrisas(LimpiaParabrisas.PALANCA_POSICION_HIGH, LimpiaParabrisas.DIAL_POSICION_1), 60);
        assertEquals(lp.LimpiaParabrisas(LimpiaParabrisas.PALANCA_POSICION_LOW, LimpiaParabrisas.DIAL_POSICION_1), 30);
        assertEquals(lp.LimpiaParabrisas(LimpiaParabrisas.PALANCA_POSICION_INT, LimpiaParabrisas.DIAL_POSICION_3), 20);
        assertEquals(lp.LimpiaParabrisas(LimpiaParabrisas.PALANCA_POSICION_INT, LimpiaParabrisas.DIAL_POSICION_2), 12);
        assertEquals(lp.LimpiaParabrisas(LimpiaParabrisas.PALANCA_POSICION_INT, LimpiaParabrisas.DIAL_POSICION_1), 6);
    }
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaLimpiaParabrisas.class);
    }
}
