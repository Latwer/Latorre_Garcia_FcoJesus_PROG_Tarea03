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

}
