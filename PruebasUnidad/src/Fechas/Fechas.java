/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

/**
 *
 * @author Hugo Ayón
 */
public class Fechas {

    public boolean EsBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio < 1582) { // calendario Juliano
                return true; // 1500
            } else { // calendario Gregoriano
                if (anio % 100 != 0) {
                    return true; // 2024
                } else {
                    if (anio % 400 == 0) {
                        return true; // 2022
                    } else {
                        return false; // 2100
                    }
                }
            }
        } else {
            return false; // 2022
        }
    }

    public boolean BisiestoOr(int anio) {
        if ((anio % 4 == 0) && ((anio < 1582) || (anio % 100 != 0) || (anio % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
