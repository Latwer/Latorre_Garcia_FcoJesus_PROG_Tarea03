package tarea03;

import utilidades.Entrada;

/**
 *
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Principal {

    //Crear una clase llamada Principal que incluya un método main.
    public static void main(String[] args) {
        /*El método main deberá pedirnos el color del rey a crear y crear un objeto 
        Rey con dicho color. Mediante un menú nos permitirá moverlo en una dirección, 
        mostrar la información de nuestro rey y salir del programa. 
        El menú se repetirá mientras no elijamos la opción salir. 
        En todo caso se debe validar que todas las entradas al programa son correctas.*/
        int color = 1;
        boolean salir = false;
        int movimiento;
        Rey rey = null;

        do {
            System.out.printf("Para Rey Blanco introduzca 1. %nPara Rey Negro introduzca 2. %n");
            color = Entrada.entero();
        } while (color != 1 && color != 2);

        if (color == 1) {
            rey = new Rey(Color.BLANCO);
            System.out.println("Su rey es blanco");
        } else if (color == 2) {
            rey = new Rey(Color.NEGRO);
            System.out.println("Su rey es negro");
        }
        //Mientras salir no sea verdadero el juego no termina.
        while (!salir) {
            System.out.printf("TECLEE UNA DIRECCIÓN %n1: NOROESTE, 2: NORTE, 3: NORESTE, 4: OESTE, 5: ESTE, 6: SUROESTE, 7: SUR, 8: SURESTE y 9: SALIR %n");
            movimiento = Entrada.entero();

            switch (movimiento) {
                case 1:
                    System.out.println("Una casilla dirección NOROESTE");
                    rey.mueve(Direccion.NOROESTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 2:
                    System.out.println("Una casilla dirección NORTE");
                    rey.mueve(Direccion.NORTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 3:
                    System.out.println("Una casilla dirección NORESTE");
                    rey.mueve(Direccion.NORESTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 4:
                    System.out.println("Una casilla dirección OESTE");
                    rey.mueve(Direccion.OESTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 5:
                    System.out.println("Una casilla dirección ESTE");
                    rey.mueve(Direccion.ESTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 6:
                    System.out.println("Una casilla dirección SUROESTE");
                    rey.mueve(Direccion.SUROESTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 7:
                    System.out.println("Una casilla dirección SUR");
                    rey.mueve(Direccion.SUR);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 8:
                    System.out.println("Una casilla dirección SURESTE");
                    rey.mueve(Direccion.SURESTE);
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    break;
                case 9:
                    System.out.println("HAS SELECCIONADO SALIR");
                    System.out.println("La última posición del Rey " + rey.getColor() + " es : " + rey.getPosicion());
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR. Introduzca solo del 1 al 9");
            }
        }
    }
}
