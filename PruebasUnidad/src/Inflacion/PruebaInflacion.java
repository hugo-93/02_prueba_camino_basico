/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inflacion;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaInflacion {

    private static final double DELTA = 0.01;

    // Método de prueba
    @Test
    public void InflacionCiclos() {
        Inflacion inflacion = new Inflacion();
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2011), 1038200, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2012), 1075263.74, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2013), 1117951.71, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2014), 1163564.14, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2015), 1188348.05, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2016), 1228276.55, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2017), 1311430.87, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2018), 1374772.98, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2019), 1413679.06, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2020), 1458209.95, DELTA);
        assertEquals(inflacion.PesosConstantes(1000000, 2010, 2021), 1567721.51, DELTA);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaInflacion.class);
    }
}
