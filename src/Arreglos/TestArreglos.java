/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.ArrayList;
import operacionesAritmeticas.OperacionesAritmeticas;

/**
 *
 * @author pablo temporal
 */
public class TestArreglos {

    public static void main(String[] args) {
        int calificaciones[] = {2323,4345,6757,12,35,4,34,0,34,34,2,4,36,65,74674,5,6,43234,23,4,42,243};
        OperacionesAritmeticas operaciones = new OperacionesAritmeticas();
        operaciones.obtenerSuma(calificaciones);
        operaciones.obtenerMayor(calificaciones);
        operaciones.obtenerMenor(calificaciones);
    }

}
