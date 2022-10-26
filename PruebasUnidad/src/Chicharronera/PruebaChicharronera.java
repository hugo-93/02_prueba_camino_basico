/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chicharronera;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaChicharronera {

    Chicharronera e, f;

    @Before
    public void setUp() {
        e = new Chicharronera(3, 4, 5);
        f = new Chicharronera(0, 10, 5);
    }

    // Método de prueba
    @Test
    public void InflacionCiclos() {
        assertFalse(e.FormulaGeneral());
        assertFalse(f.FormulaGeneral());
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaChicharronera.class);
    }
}
