/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author Hugo Ayón
 */
public class PruebaTriangulo {

    // Método de prueba
    @Test
    public void TrianguloMCCabe() {
        Triangulo triangulo = new Triangulo();
        assertTrue(triangulo.TipoTriangulo(1, 2, 3) == Triangulo.NO_ES_TRIANGULO);
        assertTrue(triangulo.TipoTriangulo(2, 2, 2) == Triangulo.TIPO_EQUILATERO);
        //assertFalse(triangulo.TipoTriangulo(1, 2, 2) == Triangulo.TIPO_EQUILATERO);
        assertTrue(triangulo.TipoTriangulo(93222358, 93222358, 131836323) == Triangulo.TIPO_ISOSCELES);
        //assertFalse(triangulo.TipoTriangulo(1, 1, 2) == Triangulo.TIPO_ISOSCELES);
        assertTrue(triangulo.TipoTriangulo(3, 4, 5) == Triangulo.TIPO_ESCALENO);
        //assertFalse(triangulo.TipoTriangulo(1, 2, 3) == Triangulo.TIPO_ESCALENO);
    }

    // Método de prueba
    @Test
    public void TipoTrianguloCondicionesMultiples() {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.TipoTriangulo(1, 2, 3), Triangulo.NO_ES_TRIANGULO); // (l1 + l2 <= l3)
        assertEquals(triangulo.TipoTriangulo(1, 3, 2), Triangulo.NO_ES_TRIANGULO); // (l1 + l3 <= l2)
        assertEquals(triangulo.TipoTriangulo(3, 1, 2), Triangulo.NO_ES_TRIANGULO); // (l2 + l3 <= l1)

        assertEquals(triangulo.TipoTriangulo(2, 2, 3), Triangulo.TIPO_ISOSCELES); // l1 == l2
        assertEquals(triangulo.TipoTriangulo(2, 3, 2), Triangulo.TIPO_ISOSCELES); // l1 == l3
        assertEquals(triangulo.TipoTriangulo(3, 2, 2), Triangulo.TIPO_ISOSCELES); // l2 == l3
    }

    // Método de prueba
    @Test
    public void TipoTrianguloTablaDeCondiciones() {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.TipoTriangulo(0, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(3, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(3, 3, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(4, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(3, 5, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(3, 3, 7), Triangulo.NO_ES_TRIANGULO);
        
        assertEquals(triangulo.TipoTriangulo(3, 3, 3), Triangulo.TIPO_EQUILATERO);
        
        assertEquals(triangulo.TipoTriangulo(2, 2, 3), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 1, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(5, 3, 3), Triangulo.TIPO_ISOSCELES);
    
        assertEquals(triangulo.TipoTriangulo(3, 4, 5), Triangulo.TIPO_ESCALENO);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaTriangulo.class);
    }
}
