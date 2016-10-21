/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author pablo temporal
 */
public class testHerencia {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Pablo");
        p.setColorCabello("rojo");
        p.hablar();
        Pez pez = new Pez();
        pez.setCola(true);
        pez.setRaza("gupi");
        pez.setTamaño("chico");
        pez.setVuela(false);
        Programador prog = new Programador();
        prog.hablar();
        prog.caminar();
    }
}
