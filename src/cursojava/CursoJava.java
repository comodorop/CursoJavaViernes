/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import Dominio.Automovil;
import Interfaz.Index;

/**
 *
 * @author pablo temporal
 */
public class CursoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Automovil jeep = new Automovil();
        jeep.setColor("negro");
        jeep.setPuertas(4);
        Automovil chevy = new Automovil();
        chevy.setColor("Rojo");
        chevy.setPuertas(2);
        Index index = new Index();
        index.setVisible(true);
    }

}
