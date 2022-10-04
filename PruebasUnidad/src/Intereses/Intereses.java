/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intereses;

/**
 *
 * @author Hugo Ayón
 */
public class Intereses {

    public double CapitalMasInteresesAnuales(double importe, double tasa, int numAnios) {
        double interes = 1, capitalinteres;

        for (int i = 1; i <= numAnios; i++) {
            interes *= (1 + tasa);
        }
        capitalinteres = importe * interes;

        return capitalinteres;
    }

    public void TablaCapitalIntereses(double importe, double tasa, int numAnios) {
        double capitalXAnio;

        System.out.println("Para un importe de " + importe
                + " con una tasa de " + tasa + " y a "
                + numAnios + " se tienen:");
        for (int i = 1; i <= numAnios; i++) {
            capitalXAnio = CapitalMasInteresesAnuales(importe, tasa, i);
            System.out.println("Año " + i + ": " + capitalXAnio);
        }
    }
}
