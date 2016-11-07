/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;

/**
 *
 * @author pablo temporal
 */
public class TestSemaforo {

    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        
        if (s.getColor3().equals("Verde")) {
            s.avanzar();
        }
        if (s.getColor1().equals("Rojo")) {
            s.detener();
        }
        if (s.getColor2().equals("Amarillo")) {
            s.precaucion();
        }

    }
}
