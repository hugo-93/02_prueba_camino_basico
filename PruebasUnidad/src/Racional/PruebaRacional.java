/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Racional;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.Before;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaRacional {

    private static final double DELTA = 0.01;
    Racional cero, noRacional;

    @Before
    public void setUp() {
        cero = new Racional(0, 1);
        noRacional = new Racional(1, 0);
    }

    // Método de prueba
    @Test
    public void RacionalConstructor() {
        System.out.println("");
        Racional resultado;

        assertFalse(noRacional.EsRacional());
        assertTrue(cero.EsRacional());

        resultado = Racional.dividir(new Racional(13, 1), cero); // Infinity
        resultado.imprimirValor();
    }

    // Probar los resultados de las operaciones (suma, resta, multiplicación y división)
    @Test
    public void RacionalResultados() {
        System.out.println("");
        Racional resultado;

        // 1/2 + 3/4 = 10/8 = 5/4 = 1.25
        resultado = Racional.sumar(new Racional(1, 2), new Racional(3, 4));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 1.25, DELTA);

        // 13/5 + 5/3 = 64/15 = 4.26666666667
        resultado = Racional.sumar(new Racional(13, 5), new Racional(5, 3));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 4.26, DELTA);

        // 1/2 - 3/4 = -2/8 = -1/4 = -0.25
        resultado = Racional.restar(new Racional(1, 2), new Racional(3, 4));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), -0.25, DELTA);

        // 13/5 - 5/3 = 14/15 = 0.93333333333
        resultado = Racional.restar(new Racional(13, 5), new Racional(5, 3));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 0.93, DELTA);

        // 1/2 * 3/4 = 3/8 = 0.375
        resultado = Racional.multiplicar(new Racional(1, 2), new Racional(3, 4));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 0.37, DELTA);

        // 13/5 * 5/3 = 65/15 = 13/3 = 4.33333333333
        resultado = Racional.multiplicar(new Racional(13, 5), new Racional(5, 3));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 4.33, DELTA);

        // (1/2) / (3/4) = 4/6 = 2/3 = 0.66666666666
        resultado = Racional.dividir(new Racional(1, 2), new Racional(3, 4));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 0.66, DELTA);

        // (13/5) / (5/3) = 39/25 = 1.56
        resultado = Racional.dividir(new Racional(13, 5), new Racional(5, 3));
        resultado.imprimirValor();
        assertEquals(resultado.getAsDecimal(), 1.56, DELTA);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaRacional.class);
    }
}
