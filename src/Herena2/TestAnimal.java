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
public class TestAnimal {

    public static void main(String[] args) {
        Perro p = new Perro();
        p.setCola(true);
        p.setRaza("Doberman");
//        System.out.println(p.isCola());
//        System.out.println(p.getRaza());
//        Pez pez = new Pez();
//        pez.mover();
        Animal animal = new Pez();
        animal.mover();
//        animal.historia();
//        Animal peces = new Animal();
//        peces.mover();
        
//        Pez p = new Animal();
    }
}
