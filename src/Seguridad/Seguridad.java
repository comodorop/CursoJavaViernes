/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

/**
 *
 * @author pablo temporal
 */
public class Seguridad {

    public String obtenerPass(char[] pass) {
        String password = "";
        for (char pas : pass) {
            password += pas;
        }
        return password;
    }

    public boolean validar(String pass1, String pass2) {
        boolean ok = false;
        if (pass1.equals(pass2)) {
            ok = true;
        }
       
        return ok;
    }

}
