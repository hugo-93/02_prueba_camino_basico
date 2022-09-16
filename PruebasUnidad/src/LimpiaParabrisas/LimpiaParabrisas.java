/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LimpiaParabrisas;

/**
 *
 * @author Hugo Ayón
 *
 * El limpiaparabrisas (wiper) de algunos automóviles Saturn está controlado por
 * una palanca y un dial. La palanca (lever) tiene cuatro posiciones: OFF, INT
 * (intermitente), LOW y HIGH. Las posiciones del dial indican tres velocidades
 * intermitentes, y la posición del dial es relevante únicamente cuando la
 * palanca está en la posición INT. Si la palanca está en OFF, el
 * limpiaparabrisas no se mueve (0 rpm por minuto). En LOW y HIGH, el
 * limpiaparabrisas trabaja a 30 y 60 rpm (revoluciones por minuto),
 * respectivamente. Pero, si la palanca está en INT, dependiendo de la posición
 * del dial tendremos (6 rpm en posición 1, 12 rpm en posición 2 y 20 rpm en
 * posición 3).
 *
 * Escriba una clase Java LimpiaParabrisas, en el paquete LimpiaParabrisas, que
 * simule la lógica de operación del limpiaparabrisas Saturn.
 *
 */
public class LimpiaParabrisas {

    static final int PALANCA_POSICION_OFF = 1;
    static final int PALANCA_POSICION_INT = 2; // intermitente
    static final int PALANCA_POSICION_LOW = 3;
    static final int PALANCA_POSICION_HIGH = 4;

    static final int DIAL_POSICION_1 = 1;
    static final int DIAL_POSICION_2 = 2;
    static final int DIAL_POSICION_3 = 3;

    public int LimpiaParabrisas(int palanca, int dial) {
        switch (palanca) {
            case PALANCA_POSICION_INT:
                switch (dial) {
                    case DIAL_POSICION_3:
                        return 20;
                    case DIAL_POSICION_2:
                        return 12;
                    case DIAL_POSICION_1:
                        return 6;
                }
            case PALANCA_POSICION_LOW:
                return 30;
            case PALANCA_POSICION_HIGH:
                return 60;
            case PALANCA_POSICION_OFF:
                return 0;
        }

        return 0;
    }
}
