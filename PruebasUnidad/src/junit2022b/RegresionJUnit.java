/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit2022b;

import Chicharronera.PruebaChicharronera;
import Fechas.PruebaFechas;
import Formulario.PruebaFormulario;
import Inflacion.PruebaInflacion;
import Intereses.PruebaIntereses;
import LimpiaParabrisas.PruebaLimpiaParabrisas;
import Racional.PruebaRacional;
import Triangulo.PruebaTriangulo;

/**
 *
 * @author Hugo Ayón
 */
public class RegresionJUnit {

    public static void main(String... args) {
        junit.textui.TestRunner.run(PruebaFechas.suite());
        junit.textui.TestRunner.run(PruebaTriangulo.suite());
        junit.textui.TestRunner.run(PruebaLimpiaParabrisas.suite());
        junit.textui.TestRunner.run(PruebaIntereses.suite());
        junit.textui.TestRunner.run(PruebaInflacion.suite());
        junit.textui.TestRunner.run(PruebaChicharronera.suite());
        junit.textui.TestRunner.run(PruebaFormulario.suite());
        junit.textui.TestRunner.run(PruebaRacional.suite());
    }
}
