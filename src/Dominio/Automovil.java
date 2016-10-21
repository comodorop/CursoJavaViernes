package Dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pablo temporal
 */
public class Automovil {

    private String color;
    private int puertas;

    public Automovil() {
        color = "rojo";
        puertas = 4;
    }

    public Automovil(String color, int puertas) {
        this.color = color;
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "color=" + color + ", puertas=" + puertas + '}';
    }

    
   
    
}
