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

    //Atributos de la clase posición privados.
    private int fila;
    private char columna;

    //Constructor de la clase posición con sus valores.
    public Posicion(int fila, char columna) {

        if ((fila >= 1 && fila <= 8) && (columna >= 'a' && columna <= 'h')) {
            this.fila = fila;
            this.columna = columna;
        } else {
            this.fila = 1;
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida.\n");
        }
    }

    /*Creamos los métodos get y set para los atributos. Recuerdemos que para el método set se debe 
    tener en cuenta que los valores son correctos y si no se comportará lo mismo que el constructor.*/
    //Creamos el método getFila
    public int getFila() {
        return fila;
    }
    //Creamos el método getColumna
    public char getColumna() {
        return columna;
    }
    //Creamos el método setFila y su posterior comprobación
    public void setFila(int fila) {

        if (fila >= 1 && fila <= 8) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.printf("Error. No se ha insertado una posición válida para la fila.\n");
        }
    }
    //Creamos el método setColumna y su posterior comprobación
    public void setColumna(char columna) {
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida para la columna.\n");
        }
    }

    //Creamos un método llamado toString que devolverá un String y será la representación de la fila y la columna.
    //Creamos el método toString que nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos.
    public String toString() {
        String mensaje = "La fila es " + fila + " y " + " la columna es" + columna;
        return mensaje;
    }
}
