/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formulario;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author Hugo Ayón
 * 
 * En un JFrame, introducir tres campos:
 *  un nombre
 *      30 caracteres
 *      obligatorio
 *  un importe
 *      que permita negativos
 *      con diez enteros y dos decimales
 *  teléfono
 *      sólo 10 números
 * 
 */
public class PruebaFormulario {

    // Método de prueba
    @Test
    public void FormularioParticionesDeEquivalencia() {
        FormularioJFrame formulario = new FormularioJFrame();

        /*
        assertFalse(formulario.validarFormulario("", "", ""));
        assertTrue(formulario.validarFormulario("a", "", ""));
        assertTrue(formulario.validarFormulario("abcdefghijklmnñopqrstuvwxyz AB", "", ""));
        assertFalse(formulario.validarFormulario("abcdefghijklmnñopqrstuvwxyz ABC", "", ""));
        assertFalse(formulario.validarFormulario("abcdefghijklmnñopqrstuvwxyz A7", "", ""));
        assertFalse(formulario.validarFormulario("x", "a", ""));
        assertTrue(formulario.validarFormulario("x", "1", ""));
        assertTrue(formulario.validarFormulario("x", "1.2", ""));
        assertTrue(formulario.validarFormulario("x", "1.23", ""));
        assertTrue(formulario.validarFormulario("x", "-1", ""));
        assertTrue(formulario.validarFormulario("x", "-1.2", ""));
        assertTrue(formulario.validarFormulario("x", "-1.23", ""));
        assertFalse(formulario.validarFormulario("x", "1.234", ""));
        assertTrue(formulario.validarFormulario("x", "1234567890.23", ""));
        assertTrue(formulario.validarFormulario("x", "-1234567890.23", ""));
        assertFalse(formulario.validarFormulario("x", "12345678901.23", ""));
         */

        assertFalse(formulario.validarNombre(""));
        assertTrue(formulario.validarNombre("a"));
        assertTrue(formulario.validarNombre("abcdefghijklmnñopqrstuvwxyz AB"));
        assertFalse(formulario.validarNombre("abcdefghijklmnñopqrstuvwxyz ABC"));
        assertFalse(formulario.validarNombre("ABC 123"));

        assertTrue(formulario.validarImporte(""));
        assertTrue(formulario.validarImporte("1"));
        assertTrue(formulario.validarImporte("1234567890"));
        assertFalse(formulario.validarImporte("12345678901"));
        assertTrue(formulario.validarImporte("0.1"));
        assertTrue(formulario.validarImporte("0.12"));
        assertFalse(formulario.validarImporte("0.123"));
        assertTrue(formulario.validarImporte("1234567890.12"));
        assertTrue(formulario.validarImporte("-1.12"));
        assertFalse(formulario.validarImporte("-"));
        assertFalse(formulario.validarImporte("5x"));

        assertTrue(formulario.validarTelefono(""));
        assertFalse(formulario.validarTelefono("1"));
        assertTrue(formulario.validarTelefono("1234567890"));
        assertFalse(formulario.validarTelefono("12345678901"));
        assertFalse(formulario.validarTelefono("5x"));
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(PruebaFormulario.class);
    }
}
