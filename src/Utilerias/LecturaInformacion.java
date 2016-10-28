/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import Practicas.Archivo;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author pablo temporal
 */
public class LecturaInformacion {

    public ArrayList<Archivo> obtenerFormacion(String ruta) {
        ArrayList<Archivo> lstArchivos = new ArrayList<>();
        File file = new File(ruta);
        File[] listaArchivos = file.listFiles();
        for (File listaArchivo : listaArchivos) {
            Archivo a = new Archivo();
            a.setNombre(listaArchivo.getName());
            a.setEscritura(listaArchivo.canWrite());
            a.setTamaño(Long.toString(listaArchivo.length()));      
            lstArchivos.add(a);
        }
        return lstArchivos;
    }
}
