/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author pablo temporal
 */
public class Archivo {

    private String nombre;
    private String tamaño;
    private boolean escritura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEscritura() {
        return escritura;
    }

    public void setEscritura(boolean escritura) {
        this.escritura = escritura;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", escritura=" + escritura + '}';
    }

}
