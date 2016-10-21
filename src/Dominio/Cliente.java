/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author pablo temporal
 */
public class Cliente {

    private DatosPersonales dp = new DatosPersonales();
    private Automovil a = new Automovil();

    public DatosPersonales getDp() {
        return dp;
    }

    public void setDp(DatosPersonales dp) {
        this.dp = dp;
    }

    public Automovil getA() {
        return a;
    }

    public void setA(Automovil a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dp=" + dp + ", a=" + a + '}';
    }

}
