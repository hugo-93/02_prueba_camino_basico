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
 * @author hugobook
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

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaTriangulo.class);
    }
}
