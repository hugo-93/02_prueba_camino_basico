/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit2022b;

import Triangulo.PruebaTriangulo;
import LimpiaParabrisas.PruebaLimpiaParabrisas;

/**
 *
 * @author hugobook
 */
public class RegresionJUnit {

    public static void main(String... args) {
        junit.textui.TestRunner.run(PruebaTriangulo.suite());
        junit.textui.TestRunner.run(PruebaLimpiaParabrisas.suite());
    }
}
