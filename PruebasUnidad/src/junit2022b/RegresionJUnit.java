/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit2022b;

import Fechas.PruebaFechas;
import Triangulo.PruebaTriangulo;
import LimpiaParabrisas.PruebaLimpiaParabrisas;

/**
 *
 * @author Hugo Ayón
 */
public class RegresionJUnit {

    public static void main(String... args) {
        junit.textui.TestRunner.run(PruebaFechas.suite());
        junit.textui.TestRunner.run(PruebaTriangulo.suite());
        junit.textui.TestRunner.run(PruebaLimpiaParabrisas.suite());
    }
}
