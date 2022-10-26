/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chicharronera;

/**
 *
 * @author Hugo Ayón
 */
public class Chicharronera {

    public double x1, x2;
    private double a, b, c;

    public Chicharronera(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean FormulaGeneral() {

        double discriminante = (b * b) - (4.0 * a * c);
        if (discriminante < 0 || a == 0) {
            return false;
        }
        x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return true;
    }
}
