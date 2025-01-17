public class UArgsLineaDeComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos!!");
            System.exit(-1); //0: se ejecuta bien, 1: se lanza una excepcion, -1: ocurre un error
        }

        for(int i = 0; i < args.length; i++){
            System.out.println("Argumento nro " + i + ": " + args[i]);
        }
    }
}

//pasos para ejecutar mi archivo desde la terminal

//me situo en la raiz del proyecto: C:\Cursos\Java\Proyectos\HolaMundo
//luego en src:  C:\Cursos\Java\Proyectos\HolaMundo\src
//compilo: javac (nombre de la clase).java -> C:\Cursos\Java\Proyectos\HolaMundo\src> javac UArgsLineaDeComando.java
//esto me genera el archivo .class que es un intermedio entre el .java y el archivo binario (javac es el compilador)
//por ultimo lo ejecuto con el comandp java ->  java UArgsLineaDeComando (java es el runtime)
//para esta clase si le paso parametros me los itera, responde:
//PS C:\Cursos\Java\Proyectos\HolaMundo\src> java UArgsLineaDeComando chiara sofia "chiara sofia beretta"
//Argumento nro 0: chiara
//Argumento nro 1: sofia
//Argumento nro 2: chiara sofia beretta
//cada vez que hago un cambio en el archivo tengo que volver a compilar antes de ejecutar para que se guarden los cambios
//tambien podria ejecutar los archivos si me paro en C:\Cursos\Java\Proyectos\HolaMundo\out\production\HolaMundo ahi tengo todos los .class
//si cuando compilo agrego javac .\UArgsLineaDeComando.java -encoding utf8 eso me permite q la terminal use utf8 y salgan simbolos y acentos
