/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package junit2022b;

import Triangulo.Triangulo;

/**
 *
 * @author Hugo Ayón
 */
public class JUnit2022B {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        //triangulo.DespliegaTipoTriangulo(1, 2, 3);
        triangulo.DespliegaTipoTriangulo(0, 2, 3);
        triangulo.DespliegaTipoTriangulo(0, 0, 3);
        triangulo.DespliegaTipoTriangulo(0, 0, 0);
        triangulo.DespliegaTipoTriangulo(-1, 2, 3);
        triangulo.DespliegaTipoTriangulo(-1, -2, 3);
        triangulo.DespliegaTipoTriangulo(-1, -2, -3);
        triangulo.DespliegaTipoTriangulo(0, -2, 3);
        triangulo.DespliegaTipoTriangulo(0, -2, -3);
        triangulo.DespliegaTipoTriangulo(0, 0, -3);
        
    }
}
