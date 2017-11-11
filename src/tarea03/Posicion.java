/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Posicion {

    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {

        if ((fila >= 1 && fila <= 8) && (columna >= 'a' && columna <= 'h')) {
            this.fila = fila;
            this.columna = columna;
        } else {
            this.fila = 1;
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida.");
        }
    }
}
