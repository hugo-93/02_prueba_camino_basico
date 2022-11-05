/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Racional;

/**
 *
 * @author Hugo Ayón
 *
 * Escriba una clase Java Racional, en el paquete Racional, que realice
 * aritmética con fracciones.
 *
 * Utilice variables enteras para representar los datos de tipo private de la
 * clase, es decir, el numerador y el denominador. Proporcione funciones para
 * cada una de las siguientes tareas: Suma, resta, multiplicación y división de
 * dos números racionales. El resultado de las operaciones anteriores se debe
 * almacenar en forma reducida. Además, se debe desplegar un número racional en
 * la forma numerador / denominador.
 *
 * Referencias:
 *   https://www.youtube.com/watch?v=z-iBQZtF3qs
 *   https://programacionapps.blogspot.com/2016/04/numeros-racionales-en-java.html
 *   https://www.superprof.es/apuntes/escolar/matematicas/aritmetica/racionales/simplificacion-de-fracciones.html#:~:text=Para%20simplificar%20una%20fracci%C3%B3n%20dividimos,al%203%20y%20as%C3%AD%20sucesivamente.
 *
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public boolean EsRacional() {
        if (denominador == 0) {
            return false;
        }
        return true;
    }

    public static Racional sumar(Racional numero1, Racional numero2) {
        if (!numero1.EsRacional() || !numero2.EsRacional()) {
            throw new IllegalArgumentException("!Error, el denominador no puede ser 0!");
        }

        Racional resultado;
        int numerador, denominador;

        numerador = (numero1.getNumerador() * numero2.getDenominador())
                + (numero2.getNumerador() * numero1.getDenominador());

        denominador = numero1.getDenominador() * numero2.getDenominador();

        resultado = new Racional(numerador, denominador);
        return resultado;
    }

    public static Racional restar(Racional numero1, Racional numero2) {
        if (!numero1.EsRacional() || !numero2.EsRacional()) {
            throw new IllegalArgumentException("!Error, el denominador no puede ser 0!");
        }

        Racional resultado;
        int numerador, denominador;

        numerador = (numero1.getNumerador() * numero2.getDenominador())
                - (numero2.getNumerador() * numero1.getDenominador());

        denominador = numero1.getDenominador() * numero2.getDenominador();

        resultado = new Racional(numerador, denominador);
        return resultado;
    }

    public static Racional multiplicar(Racional numero1, Racional numero2) {
        if (!numero1.EsRacional() || !numero2.EsRacional()) {
            throw new IllegalArgumentException("!Error, el denominador no puede ser 0!");
        }

        Racional resultado;
        int numerador, denominador;

        numerador = numero1.getNumerador() * numero2.getNumerador();
        denominador = numero1.getDenominador() * numero2.getDenominador();

        resultado = new Racional(numerador, denominador);
        return resultado;
    }

    public static Racional dividir(Racional dividendo, Racional divisor) {
        if (!dividendo.EsRacional() || !divisor.EsRacional()) {
            throw new IllegalArgumentException("!Error, el denominador no puede ser 0!");
        }

        if (divisor.getNumerador() == 0) {
            throw new IllegalArgumentException("!Error, no se puede dividir entre 0!");
        }

        Racional resultado;
        int numerador, denominador;

        numerador = dividendo.getNumerador() * divisor.getDenominador();
        denominador = divisor.getNumerador() * dividendo.getDenominador();

        resultado = new Racional(numerador, denominador);
        return resultado;
    }

    public void imprimirValor() {
        System.out.println(numerador + "/" + denominador + "\t = \t" + getAsDecimal());
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public double getAsDecimal() {
        return (double) numerador / denominador;
    }
}
