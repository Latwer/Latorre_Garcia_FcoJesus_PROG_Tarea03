# Latorre_Garcia_FcoJesus_PROG_Tarea03
Francisco Jesús Latorre García

1. Lo primero que debes hacer es crearte un usuario en GitHub si es que aún no lo tienes y crear un repositorio denominado Apellido1_Apellido2_Nombre_PROG_Tarea03 que será donde vayas guardando los diferentes cambios que se pide realices a la tarea. Deberás inicializar el fichero README.md con tu nombre y una descripción de la tarea.

2. Una vez hecho esto deberás clonarlo a tu espacio de trabajo y hacer que se convierta en un proyecto Java visible desde tu IDE y enlazado a dicho repositorio de GitHub. Según tu IDE deberás elegir correctamente los tipos de ficheros a incluir en el fichero .gitignore.

3. Añade a tu proyecto el paquete utilidades que contendrá la clase Entrada (java - 4124 B). Haz tu primer commit.

4. Crea un nuevo paquete nombrado tarea03. Haz un commit.

5. Crea un enumerado llamado Color, dentro del paquete anterior, que contenga los valores: BLANCO y NEGRO. Añade comentarios tipo javadoc a este enumerado. Haz un commit.

6. Crea un enumerado llamado Direccion, dentro del paquete anterior, que contenga los valores: NORTE, NORESTE, ESTE, SURESTE, SUR, SUROESTE, OESTE y NOROESTE. Añade comentarios tipo javadoc a este enumerado. Haz un commit.

7. Crea la clase Posicion, dentro del paquete anterior. Crea los atributos fila (int) y columna (char) con la visibilidad adecuada. Haz un commit.

8. Crea un constructor para esta clase que acepte como parámetros la fila y la columna y que los asigne a los atributos si son correctos (las filas van del 1 al 8 -ambos inclusive- y las columnas de la 'a' a la 'h' -ambos inclusive-) y si no le ponga un valor por defecto (1 para fila incorrecta, 'a' para columna incorrecta) e informe de dicho problema. Haz un commit.

9. Crea los métodos get y set para los atributos. Recuerda que para el método set se debe tener en cuenta que los valores son correctos y si no se comportará lo mismo que el constructor. Haz un commit.

10. Crea un método llamado toString que devolverá un String y será la representación de la fila y la columna. Haz un commit.

11. Añade comentarios tipo javadoc a la clase y a cada uno de los métodos. Haz un commit.

12. Crea la clase Rey, dentro del paquete anterior, cuyos atributos serán un color (del tipo enumerado Color) y posicion (de la clase Posicion), con la visibilidad adecuada. Haz un commit.

13. Crea un constructor para la clase anterior que acepte como parámetros el color. Ten en cuenta que el rey blanco se posiciona inicialmente en la casilla e1 y el negro en la casilla e8. Haz un commit.

14. Crea un constructor por defecto para la clase que cree un rey blanco. Haz un commit.

15. Crea los métodos get para cada atributo. Haz un commit.

16. Crea un método llamado toString y que devuelva un String que será la representación de dicho objeto (color y posición). Haz un commit.

17. Crea un método llamado mueve que acepte como parámetro una dirección y que actualice adecuadamente la posición de dicho objeto o informe del error si ese movimiento no se puede llevar a cabo. Haz un commit.

18. Añade comentarios tipo javadoc a la clase y a cada uno de los métodos. Haz un commit.

19. Crea una clase llamada Principal que incluya un método main. Haz un commit.

20. El método main deberá pedirnos el color del rey a crear y crear un objeto Rey con dicho color. Mediante un menú nos permitirá moverlo en una dirección, mostrar la información de nuestro rey y salir del programa. El menú se repetirá mientras no elijamos la opción salir. En todo caso se debe validar que todas las entradas al programa son correctas. Haz un commit.
