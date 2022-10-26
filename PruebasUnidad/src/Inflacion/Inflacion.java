/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inflacion;

/**
 *
 * @author Hugo Ayón
 *
 * Escriba una clase Java Inflacion, en el paquete Inflacion, e implemente dos
 * algoritmos double PesosConstantes(double Importe, int AnioAnterior, int
 * AnioPosterior), que regrese el valor de un Importe de un AnioAnterior en un
 * AnioPosterior (los 1’567,721.51 pesos en el ejemplo), y otro algoritmo
 * PerdidaPorInflacion(double Importe, int AnioAnterior, int AnioPosterior), que
 * regrese el valor de un Importe no invertido de un AnioAnterior en un
 * AnioPosterior (los 432,278.48 pesos en el ejemplo).
 *
 * Pruebe los dos métodos de la clase Inflacion mediante la técnica de prueba de
 * ciclos.
 *
 */
public class Inflacion {

    public static final int INFLACION_ANIO_INICIAL = 1970;
    public static final double INFLACIONES[] = {
        4.69, 4.96, 5.56, 21.37, 20.60, 11.31, 27.20, 20.66, 16.17, 20.02,
        29.85, 28.68, 98.84, 80.78, 59.16, 63.75, 105.75, 159.17, 51.66, 19.70,
        29.93, 18.79, 11.94, 8.01, 7.05, 51.97, 27.70, 15.72, 18.61, 12.32,
        8.96, 4.40, 5.70, 3.98, 5.19, 3.33, 4.05, 3.76, 6.53, 3.57, 4.40, 3.82,
        3.57, 3.97, 4.08, 2.13, 3.36, 6.77, 4.83, 2.83, 3.15, 7.51
    };

    double PesosConstantes(double Importe, int AnioAnterior, int AnioPosterior) {
        int indiceInflacion = AnioAnterior - INFLACION_ANIO_INICIAL;
        double importePosterior = Importe;

        //System.out.println(AnioAnterior + "\t" + importePosterior);
        for (int anio = AnioAnterior + 1; anio <= AnioPosterior; anio++) {
            importePosterior = (importePosterior * (100 + INFLACIONES[++indiceInflacion])) / 100;
            //System.out.println(anio + "\t" + importePosterior);
        }

        // redondear a 2 decimales
        //BigDecimal bd = new BigDecimal(Double.toString(importePosterior));
        //bd = bd.setScale(2, RoundingMode.HALF_UP);
        //return bd.doubleValue();
        return importePosterior;
    }

    double PerdidaPorInflacion(double Importe, int AnioAnterior, int AnioPosterior) {
        double importeConInflacion;
        importeConInflacion = Importe * 2 - PesosConstantes(Importe, AnioAnterior, AnioPosterior);

        //System.out.println(AnioAnterior + " a " + AnioPosterior + "\t" + importeConInflacion);
        return importeConInflacion;
    }
}
