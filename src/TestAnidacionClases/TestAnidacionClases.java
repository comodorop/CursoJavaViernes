/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAnidacionClases;

import Dominio.Automovil;
import Dominio.Cliente;

/**
 *
 * @author pablo temporal
 */
public class TestAnidacionClases {

    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.setColor("rojo");
        auto.setPuertas(3);
        Cliente cl = new Cliente();
        cl.setA(auto);
        cl.getDp().setNombre("Pablo");
        cl.getDp().setApellido("Torres");
        System.out.println(cl);
    }
}
