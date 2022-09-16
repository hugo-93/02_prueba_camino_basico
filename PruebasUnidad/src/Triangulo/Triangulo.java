/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;

/**
 *
 * @author hugobook
 *
 * Escriba una clase Java Triangulo, en el paquete Triangulo, que incluya los
 * métodos public int TipoTriangulo(int l1, int l2, int l3) y public void
 * DespliegaTipoTriangulo(int l1, int l2, int l3),
 *
 * donde DespliegaTipoTriangulo() recibe tres longitudes de los lados de un
 * triángulo, y se las pasa a la función TipoTriangulo(), que regresa si es
 * equilátero, isósceles o escaleno.
 *
 * Luego el método DespliegaTipoTriangulo() despliega una cadena de texto con el
 * tipo de triángulo. Los lados deben ser enteros positivos.
 *
 * Valide si es posible construir un triángulo con los lados l1, l2 y l3. Si no
 * es posible construir un triángulo regrese un valor 4.
 *
 * Referencias:
 *   https://www.significados.com/tipos-de-triangulos/
 *   https://es.wikihow.com/saber-si-hay-un-tri%C3%A1ngulo-teniendo-las-medidas-de-tres-lados
 */
public class Triangulo {

    static final int TIPO_EQUILATERO = 1;
    static final int TIPO_ISOSCELES = 2;
    static final int TIPO_ESCALENO = 3;
    static final int NO_ES_TRIANGULO = 4;

    public int TipoTriangulo(int l1, int l2, int l3) {
        // No es triángulo
        // Aplicar teorema de la desigualdad del triángulo
        if ((l1 + l2 <= l3) || (l1 + l3 <= l2) || (l2 + l3 <= l1)) {
            return NO_ES_TRIANGULO;
        }

        // Un triángulo equilátero tiene tres lados de igual longitud
        if (l1 == l2 && l2 == l3) {
            return TIPO_EQUILATERO;
        } // Un triángulo isósceles tiene dos lados iguales
        else if (l1 == l2 || l1 == l3 || l2 == l3) {
            return TIPO_ISOSCELES;
        } // Un triángulo escaleno tiene tres lados de diferentes longitudes
        else {
            return TIPO_ESCALENO;
        }
    }

    public void DespliegaTipoTriangulo(int l1, int l2, int l3) {
        int tipoDeTriangulo = TipoTriangulo(l1, l2, l3);

        switch (tipoDeTriangulo) {
            case TIPO_EQUILATERO:
                System.out.println("Es un triángulo equilátero.");
                break;

            case TIPO_ISOSCELES:
                System.out.println("Es un triángulo isósceles.");
                break;

            case TIPO_ESCALENO:
                System.out.println("Es un triángulo escaleno.");
                break;

            case NO_ES_TRIANGULO:
                System.out.println("No es posible construir un triángulo.");
                break;
        }
    }
}
