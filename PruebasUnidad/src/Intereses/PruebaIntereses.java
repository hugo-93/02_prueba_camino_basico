/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intereses;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaIntereses {

    private static final double DELTA = 0.01;

    // Método de prueba
    @Test
    public void CapitalMasInteresesAnualesCiclos() {
        Intereses inter = new Intereses();
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 1), 1050, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 2), 1102.5, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 3), 1157.62, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 4), 1215.50, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 5), 1276.28, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 6), 1340.09, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 7), 1407.10, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 8), 1477.45, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 9), 1551.32, DELTA);
        assertEquals(inter.CapitalMasInteresesAnuales(1000, 0.05, 10), 1628.89, DELTA);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaIntereses.class);
    }
}
