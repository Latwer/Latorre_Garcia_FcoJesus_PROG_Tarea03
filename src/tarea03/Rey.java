package tarea03;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 *
 * Creamos la clase Rey, cuyos atributos serán un color (del tipo enumerado
 * Color) y posicion (de la clase Posicion), con la visibilidad adecuada.
 */
public class Rey {

    private Color color;
    private Posicion posicion;

    /*Creamos un constructor para la clase anterior que acepte como parámetros el color. 
    Tengamos en cuenta que el rey blanco se posiciona inicialmente en la casilla e1 
    y el negro en la casilla e8.*/
    public Rey(Color color) {
        this.color = color;
        switch (color) {
            case BLANCO:
                posicion = new Posicion(1, 'e');
                break;
            case NEGRO:
                posicion = new Posicion(8, 'e');
                break;
        }
    }

    //Crear un constructor por defecto para la clase que cree un rey blanco. 
    /*public Rey() {
        this.color = Color.BLANCO;
        posicion = new Posicion(1, 'e');
    }*/
    //Crear los métodos get para cada atributo.
    public Color getColor() {
        return color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    //Crear un método llamado toString y que devuelva un String que será la representación de dicho objeto (color y posición).
    public String toString() {
        return "El color del rey es " + color + " y la posición es " + posicion;
    }

    //Crear un método llamado mueve que acepte como parámetro una dirección 
    //y que actualice adecuadamente la posición de dicho objeto o 
    //informe del error si ese movimiento no se puede llevar a cabo.
    public void mueve(Direccion nuevaDireccion) {
        int fila = posicion.getFila();
        char columna = posicion.getColumna();

        // Evitar la salida del rey del tablero...
        /*if ((fila == 1 && nuevaDireccion == nuevaDireccion.SUROESTE || nuevaDireccion == nuevaDireccion.SUR || nuevaDireccion == nuevaDireccion.SURESTE) //Por abajo.
                || (fila == 8 && nuevaDireccion == nuevaDireccion.NOROESTE || nuevaDireccion == nuevaDireccion.NORTE || nuevaDireccion == nuevaDireccion.NORESTE) //Por arriba.
                || (columna == 'a' && nuevaDireccion == nuevaDireccion.OESTE || nuevaDireccion == nuevaDireccion.NOROESTE || nuevaDireccion == nuevaDireccion.SUROESTE) //Por la izquierda.
                || (columna == 'h' && nuevaDireccion == nuevaDireccion.ESTE || nuevaDireccion == nuevaDireccion.NORESTE || nuevaDireccion == nuevaDireccion.SURESTE)) { //Por la derecha.
            System.out.println("Movimiento no permitido");
        }
        //else
         */
        // Movimientos Rey Blanco y Rey Negro
        if (color == Color.BLANCO || color == Color.NEGRO) {
            switch (nuevaDireccion) {
                case NOROESTE:
                    nuevaDireccion = Direccion.NOROESTE;
                    posicion.setFila(fila + 1); //Al ser noroeste la fila se incrementará en 1 ya que estará subiendo 
                    posicion.setColumna((char) (columna - 1)); //Y se desplazará a la izquierda osea una letra menos (si está en la c pues irá a la b.
                    break;
                case NORTE:
                    nuevaDireccion = Direccion.NORTE; //No cambiará la posición de la columna pero sí la de la fila subiendo una posición en el tablero.
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna));
                    break;
                case NORESTE:
                    nuevaDireccion = Direccion.NORESTE; //Lo mismo que el noroeste pero incrementando una letra.
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna + 1));
                    break;
                case OESTE:
                    nuevaDireccion = Direccion.OESTE;
                    posicion.setFila(fila);
                    posicion.setColumna((char) (columna - 1)); //En este caso la fila no se verá alterada pero si habrá movimiento en la columna restando una letra.
                    break;
                case ESTE:
                    nuevaDireccion = Direccion.ESTE; //Y así con los demás teniendo en cuenta la lógica de los puntos cardinales aplicandolo a un tablero de ajedrez.
                    posicion.setFila(fila);
                    posicion.setColumna((char) (columna + 1));
                    break;
                case SUROESTE:
                    nuevaDireccion = Direccion.SUROESTE;
                    posicion.setFila(fila - 1);
                    posicion.setColumna((char) (columna - 1));
                    break;
                case SUR:
                    nuevaDireccion = Direccion.SUR;
                    posicion.setFila(fila - 1);
                    posicion.setColumna((char) (columna));
                    break;
                case SURESTE:
                    nuevaDireccion = Direccion.SURESTE;
                    posicion.setFila(fila - 1);
                    posicion.setColumna((char) (columna + 1));
                    break;
            }
        }
    }
}
