package tarea03;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Posicion {

    //Atributos de la clase posición privados.
    private int fila;
    private char columna;

    //Constructor de la clase posición con sus valores.
    public Posicion(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;

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
        } else if (fila < 1) {
            this.fila = 1;
            System.out.printf("Error. No se ha insertado una posición válida para la fila.\n");
        } else if (fila > 8) {
            this.fila = 8;
            System.out.printf("Error. No se ha insertado una posición válida para la fila.\n");
        }
    }

    //Creamos el método setColumna y su posterior comprobación
    public void setColumna(char columna) {
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else if (columna < 'a') {
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida para la columna.\n");
        } else if (columna > 'h') {
            this.columna = 'h';
            System.out.printf("Error. No se ha insertado una posición válida para la columna.\n");
        }
    }

    //Creamos un método llamado toString que devolverá un String y será la representación de la fila y la columna.
    //Creamos el método toString que nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos.
    public String toString() {
        return "Fila: " + fila + " y " + "Columna: " + columna;
    }
}
