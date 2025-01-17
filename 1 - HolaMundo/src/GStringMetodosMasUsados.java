public class GStringMetodosMasUsados {

    public static void main(String[] args) {

        String nombre = "Chiara";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Chiara\") = " + nombre.equals("Chiara"));
        System.out.println("nombre.equals(\"chiara\") = " + nombre.equals("chiara"));
        System.out.println("nombre.equalsIgnoreCase(\"chiara\") = " + nombre.equalsIgnoreCase("chiara"));
        System.out.println("nombre.compareTo(\"Chiara\") = " + nombre.compareTo("Chiara"));
        System.out.println("nombre.compareTo(\"Justina\") = " + nombre.compareTo("Justina"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //me devuelve el char en la posicion x
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1)); //obtengo de forma dinamica el ultimo caracter
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //me retorna el substring desde alguna posición en adelante
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //le puedo pasar tmb la posicion hasta la que quiero el substring

        String apellido = "Beretta";

        System.out.println("apellido.replace(\"e\", \".\") = " + apellido.replace("e", "."));
        System.out.println("apellido.indexOf() = " + apellido.indexOf("e")); //me retorna la posicion de la primera ocurrencia del caracter q le mando
        System.out.println("apellido.lastIndexOf(\"e\") = " + apellido.lastIndexOf("e")); //me retorna la posicion de la ultima ocurrencia del caracter q le mando
        System.out.println("apellido.indexOf(\"z\") = " + apellido.indexOf("z")); //si no encuentra ninguna ocurrencia me retorna -1
        System.out.println("apellido.contains(\"tta\") = " + apellido.contains("tta")); //me permite tmb saber si un string esta dentro de otr string (es boolean)
        System.out.println("apellido.startsWith(\"Beret\") = " + apellido.startsWith("Beret")); //empieza con
        System.out.println("apellido.startsWith(\"B\") = " + apellido.startsWith("B"));
        System.out.println("apellido.endsWith(\"tta\") = " + apellido.endsWith("tta")); //termina con
        System.out.println("apellido.endsWith(\"a\") = " + apellido.endsWith("a"));
        System.out.println("\"  Beretta  \".trim() = " + "  Beretta  ".trim()); //quita epacios en blanco a izquierda y derecha


        //metodos para convertir en string en un array

        String trabalenguas = "trabalenguas";

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; //aca length no es un metodo sino un atributo del array, por eso va sin ()
        for(int i = 0; i < largo; i++){
            System.out.println(arreglo[i]);
        }

        String[] arreglo2 = trabalenguas.split("a"); //split arma un array de string separando como condicion la expresion regular que recibe
        int largo2 = arreglo2.length;
        for(int i = 0; i < largo2; i++){
            System.out.println(arreglo2[i]); //va a ser [tr, b, lengu, s]
        }

        String strConSeparador = "chiara.sofia.beretta";
        String[] arreglo3 = strConSeparador.split("\\."); //como recibe una expresion regular, uso \\ como escape para q se entienda q es un . sino [.]
        int largo3 = arreglo3.length;
        for(int i = 0; i < largo3; i++){
            System.out.println(arreglo3[i]); //va a ser [chiara, sofia, beretta]
        }
    }
}
