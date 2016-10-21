/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListPrueba;

import java.util.ArrayList;

/**
 *
 * @author pablo temporal
 */
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> listNombre = new ArrayList<>();
        String nombre = "Pablo";
        String nombre2 = "Pablo12";
        String nombre3 = "Pablo2";
        String nombre4 = "Pablo3";
        String nombre5 = "Pablo4";
        listNombre.add(nombre);
        listNombre.add(nombre2);
        listNombre.add(nombre3);
        listNombre.add(nombre4);
        listNombre.add(nombre5);
        for (String nombres : listNombre) {
            System.out.println(nombres);
        }
        
    }
}
