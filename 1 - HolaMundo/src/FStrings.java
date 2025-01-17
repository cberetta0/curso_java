public class FStrings {

    public static void main(String[] args) {

        // distintas forms de instanciar strings
        String curso = "Programación Java"; //Objeto. Tipo por referencia
        String curso2 = new String("Programación Java");

        /// comparacion de strings
        boolean esIgual = curso == curso2; //compara a ver si son el mismo objeto (false)
        esIgual = curso.equals(curso2); //compara a ver su tienen el mismo valor (true)

        // concatenacion
        String profesor = "Andrés Guzmán";
        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);
        String detalle2 = curso.concat(" " + profesor);
        System.out.println("detalle2 = " + detalle2);

        // inmutabilidad
        curso.concat(profesor); //concat devuelve una nueva instancia de String, por lo q no modifica la variable curso
        System.out.println("curso = " + curso); //seguira siendo "Programacion Java"

        // transform: tambien retorna una nueva instancia de string
        curso.transform(c -> {
            return c + " con " + profesor;
        });

        // replace: reemplaza un caracter por otro. Tambien devuelve una nueva instancia
        curso.replace("a", "A");

        // isEmpty : valida q el string sea distinto de null, distinto de vacio
        String vacio = "";
        boolean esVacio = vacio.isEmpty();
        System.out.println("esVacio = " + esVacio);

        // isBlank : valida q el string sea distinto de null, distinto de empty y si tene contenido q sea distinto de un espacio en blanco
        String blanco = " ";
        boolean esBblanco = vacio.isBlank();
        System.out.println("esBblanco = " + esBblanco);
    }
}
