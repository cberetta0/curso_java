import java.io.IOException;

public class SEjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); //instancio la clase runtime, sirve para ejecutar programas
        Process proceso;

        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad"); //en caso de windows
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit"); //en caso de que sea mac
            } else if (System.getProperty("os.name").toLowerCase().endsWith("nux") || System.getProperty("os.name").toLowerCase().endsWith("nix")) {
                proceso = rt.exec("gedit"); //en caso de linux, unix, etc
            } else {
                proceso = rt.exec("gedit");
            }

            proceso.waitFor();

        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
