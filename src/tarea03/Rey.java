package tarea03;

/**
 *
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
    public Rey() {
        this.color = Color.BLANCO;
        posicion = new Posicion(1, 'e');
    }
    //Crear los métodos get para cada atributo.

    public Color getColor() {
        return color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    //Crear un método llamado toString y que devuelva un String que será la representación de dicho objeto (color y posición).
    public String toString() {
        String mensaje = "El color del rey es " + color + " y la posición es " + posicion;
        return mensaje;
    }

    //Crear un método llamado mueve que acepte como parámetro una dirección 
    //y que actualice adecuadamente la posición de dicho objeto o 
    //informe del error si ese movimiento no se puede llevar a cabo.
    public void mueve(Direccion nuevaDireccion) {
        int fila = posicion.getFila();
        char columna = posicion.getColumna();
        // Evitar salida de tablero del rey por abajo.
        if (fila == 1 && nuevaDireccion == nuevaDireccion.SUROESTE || nuevaDireccion == nuevaDireccion.SUR || nuevaDireccion == nuevaDireccion.SURESTE) {
            System.out.println("Movimiento no permitido");
        }
        // Evitar salida de tablero del rey por arriba.
        if (fila == 8 && nuevaDireccion == nuevaDireccion.NOROESTE || nuevaDireccion == nuevaDireccion.NORTE || nuevaDireccion == nuevaDireccion.NORESTE) {
            System.out.println("Movimiento no permitido");
        }
        // Evitar salida de tablero del rey por la izquierda.
        if (columna == 'a' && nuevaDireccion == nuevaDireccion.OESTE || nuevaDireccion == nuevaDireccion.NOROESTE || nuevaDireccion == nuevaDireccion.SUROESTE) {
            System.out.println("Movimiento no permitido");
        }
        // Evitar salida de tablero del rey por la derecha
        if (columna == 'h' && nuevaDireccion == nuevaDireccion.ESTE || nuevaDireccion == nuevaDireccion.NORESTE || nuevaDireccion == nuevaDireccion.SURESTE) {
            System.out.println("Movimiento no permitido");
        }

        // Movimientos Rey Blanco
        if (color == Color.BLANCO) {
            switch (nuevaDireccion) {
                case NOROESTE:
                    nuevaDireccion = Direccion.NOROESTE;
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna - 1));
                    break;
                case NORTE:
                    nuevaDireccion = Direccion.NORTE;
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna));
                    break;
                case NORESTE:
                    nuevaDireccion = Direccion.NORESTE;
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna + 1));
                    break;
                case OESTE:
                    nuevaDireccion = Direccion.OESTE;
                    posicion.setFila(fila);
                    posicion.setColumna((char) (columna - 1));
                    break;
                case ESTE:
                    nuevaDireccion = Direccion.ESTE;
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
        // Movimientos Rey Negro
        if (color == Color.NEGRO) {
            switch (nuevaDireccion) {
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
                case OESTE:
                    nuevaDireccion = Direccion.OESTE;
                    posicion.setFila(fila);
                    posicion.setColumna((char) (columna - 1));
                    break;
                case ESTE:
                    nuevaDireccion = Direccion.ESTE;
                    posicion.setFila(fila);
                    posicion.setColumna((char) (columna + 1));
                    break;
                case NOROESTE:
                    nuevaDireccion = Direccion.NOROESTE;
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna - 1));
                    break;
                case NORTE:
                    nuevaDireccion = Direccion.NORTE;
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna));
                    break;
                case NORESTE:
                    nuevaDireccion = Direccion.NORESTE;
                    posicion.setFila(fila + 1);
                    posicion.setColumna((char) (columna + 1));
                    break;
            }
        }
    }
}
