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

    // Método de prueba
    @Test
    public void TipoTrianguloValoresLimite() {
        Triangulo triangulo = new Triangulo();

        assertEquals(triangulo.TipoTriangulo(1, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 100), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 100, 100), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 1, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 2, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 199, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 200, 100), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 100, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 200), Triangulo.NO_ES_TRIANGULO);
    }

    // Método de prueba
    @Test
    public void TipoTrianguloValoresLimiteRobusto() {
        Triangulo triangulo = new Triangulo();

        assertEquals(triangulo.TipoTriangulo(0, 100, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 100), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 100, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 100), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 2, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 199, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 100), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 100, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 100, 201), Triangulo.NO_ES_TRIANGULO);
    }

    // Método de prueba
    @Test
    public void TipoTrianguloValoresLimitePeorCaso() {
        Triangulo triangulo = new Triangulo();

        assertEquals(triangulo.TipoTriangulo(1, 1, 1), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 100, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 199, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(2, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 2, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 2, 2), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 100, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 199, 200), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(2, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(100, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 100, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 100), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(100, 100, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 199, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 199, 200), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(100, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(199, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 1, 200), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(199, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 2, 200), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(199, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 100, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 100, 200), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(199, 199, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 199), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(199, 199, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(199, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 2), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 200, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 2), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 199, 200), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 200, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 200), Triangulo.TIPO_EQUILATERO);
    }

    // Método de prueba
    @Test
    public void TipoTrianguloValoresLimitePeorCasoRobusto() {
        Triangulo triangulo = new Triangulo();

        assertEquals(triangulo.TipoTriangulo(0, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(0, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 1, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 1, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(0, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 2, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 2, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(0, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 100, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 100, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 100, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 100, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(0, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 199, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 199, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 199, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 199, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(0, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 200, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 200, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 200, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(0, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 201, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 201, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 201, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 201, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 201, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(0, 201, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 1), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 1, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 2, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 100, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 100, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 199, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 199, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 200, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(1, 200, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(1, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 201, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 201, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 201, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 201, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 201, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(1, 201, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(2, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 1, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 2, 2), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 2, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 100, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 100, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 199, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(2, 199, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(2, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(2, 200, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(2, 200, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(2, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 201, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 201, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 201, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 201, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(2, 201, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(2, 201, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(100, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 1, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 2, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 100, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 100), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(100, 100, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 100, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 100, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(100, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 199, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 199, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(100, 199, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(100, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(100, 200, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(100, 200, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(100, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(100, 201, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(199, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(199, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 1, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 1, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(199, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 2, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 2, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(199, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 100, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 100, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 100, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(199, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 199, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 199), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(199, 199, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 199, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(199, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 2), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 200, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 200, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 200, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(199, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 201, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 201, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(199, 201, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 201, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(199, 201, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(199, 201, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(200, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 1, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 1, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(200, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 2, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 2, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(200, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 100, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 100, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(200, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 2), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 199, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 199, 201), Triangulo.TIPO_ESCALENO);

        assertEquals(triangulo.TipoTriangulo(200, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 200, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 200, 200), Triangulo.TIPO_EQUILATERO);
        assertEquals(triangulo.TipoTriangulo(200, 200, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(200, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 201, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(200, 201, 2), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 201, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 201, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(200, 201, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(200, 201, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(201, 0, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 0, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 0, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 0, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 0, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 0, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 0, 201), Triangulo.NO_ES_TRIANGULO);

        assertEquals(triangulo.TipoTriangulo(201, 1, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 1, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 1, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 1, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 1, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 1, 200), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 1, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(201, 2, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 2, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 2, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 2, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 2, 199), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 2, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 2, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(201, 100, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 100), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 100, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(201, 199, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 199, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 199, 2), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 199, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 199, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 199, 200), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 199, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(201, 200, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 200, 1), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 200, 2), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 200, 100), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 200, 199), Triangulo.TIPO_ESCALENO);
        assertEquals(triangulo.TipoTriangulo(201, 200, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 200, 201), Triangulo.TIPO_ISOSCELES);

        assertEquals(triangulo.TipoTriangulo(201, 201, 0), Triangulo.NO_ES_TRIANGULO);
        assertEquals(triangulo.TipoTriangulo(201, 201, 1), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 201, 2), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 201, 100), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 201, 199), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 201, 200), Triangulo.TIPO_ISOSCELES);
        assertEquals(triangulo.TipoTriangulo(201, 201, 201), Triangulo.TIPO_EQUILATERO);

    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaTriangulo.class);
    }
}
