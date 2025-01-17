import java.util.Properties;

public class OPropiedadesDelSistema {
    public static void main(String[] args) {

        //todas las propiedades en https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

        //nombre de usuario del sistma operativo
        String username = System.getProperty("user.name");
        System.out.println("username = " + username); //ffber

        //la ruta del usuario del sistema operativo
        String home = System.getProperty("user.home");
        System.out.println("home = " + home); //C:\Users\ffber

        //directorio del proyecto actual
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace); //C:\Cursos\Java\Proyectos\HolaMundo

        //version de java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java); //21.0.1

        //sistema operativo
        String os = System.getProperty("os.name");
        System.out.println("os = " + os); //Windows 10

        //arquitectura del os
        String osArq = System.getProperty("os.arch");
        System.out.println("osArq = " + osArq); //amd64

        //Listar todas las propiedades (de mi maquina)
        Properties properties = System.getProperties();
        properties.list(System.out);


    }
}
