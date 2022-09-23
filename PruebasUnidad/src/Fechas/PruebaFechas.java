/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaFechas {

    // Método de prueba
    @Test
    public void BisiestoMCCabe() {
        Fechas f = new Fechas();
        assertTrue(f.EsBisiesto((1500)));
        assertTrue(f.EsBisiesto((2000)));
        assertFalse(f.EsBisiesto((1900)));
        assertFalse(f.EsBisiesto((2011)));
        assertTrue(f.EsBisiesto((2012)));
    }

    // Método de prueba
    @Test
    public void BisiestoOrCondicionesMultiples() {
        Fechas f = new Fechas();
        assertTrue(f.BisiestoOr((1500)));
        assertTrue(f.BisiestoOr((2000)));
        assertTrue(f.BisiestoOr((2012)));
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaFechas.class);
    }
}
