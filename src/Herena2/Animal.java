/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herena2;

/**
 *
 * @author pablo temporal
 */
public abstract class Animal implements Movimiento {

    private boolean cola;
    private String tamaño;
    private String raza;

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void mover() {
        System.out.println("Camninadno 4 patas");
    }

    public abstract void comunicar();

}
