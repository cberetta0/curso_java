import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PEjAsignarPropiedadesDeSistema {

    public static void main(String[] args) {

        try { //me obliga a manejar la excepcion por si la ruta al archivo no existe y no se encuentra

            //encargado de leer el contenido del archivo de properties
            FileInputStream archivo = new FileInputStream("src/qconfig.properties");

            Properties properties = new Properties(System.getProperties()); //leo las properties de sistema
            properties.load(archivo); //y agrego las creadas por mi tambien
            properties.setProperty("mi.propiedad.personalizada", "valor de la property"); //otra forma alternativa a crear el archivo
            System.setProperties(properties); //sin esto si listo las properties no aparecen las que cree yo
            System.getProperties().list(System.out); //ahora aparecen todas, incluidas las del archivo

            //como obtener una property especifica
            System.out.println("mi.propiedad.personalizada: " + System.getProperty("mi.propiedad.personalizada"));
            System.out.println("config.puerto.servidor: " + System.getProperty("config.puerto.servidor"));

        } catch (Exception e) {
            System.err.println("no existe el archivo = " + e);
            System.exit(1); //termina el programa
        }
    }
}
