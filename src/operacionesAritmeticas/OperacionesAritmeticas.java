/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesAritmeticas;

/**
 *
 * @author pablo temporal
 */
public class OperacionesAritmeticas {

    public void obtenerSuma(int calificaciones[]) {
        int suma = 0;
        for (int calificacione : calificaciones) {
            suma += calificacione;
        }
        System.out.println("La suma es " + suma);
    }

    public void obtenerMenor(int[] calificaciones) {
        int valorMenor = calificaciones[0];
        for (int calificacione : calificaciones) {
            if (calificacione < valorMenor) {
                valorMenor = calificacione;
            }
        }
        System.out.println("El valor menor es :" + valorMenor);
    }

    public void obtenerMayor(int[] calificaciones) {
        int valorMayor = calificaciones[0];
        for (int calificacione : calificaciones) {
            if (calificacione > valorMayor) {
                valorMayor = calificacione;
            }
        }
        for (int x = 0; x < calificaciones.length; x++) {
            if (valorMayor > calificaciones[x]) {
                valorMayor = calificaciones[x];
            }
        }
        System.out.println("El valor mayor es :" + valorMayor);
    }
}
