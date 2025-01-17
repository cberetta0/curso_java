import java.util.Map;

public class RVariablesDeEntorno {
    public static void main(String[] args) {

        //lista todas las variables de ambiente
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        //una variable e particular
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        //otra forma es agarrarla del map donde estan todas
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        //con setx en la terminal de intellij puedo crear mis propias variables de entorno, por ej: setx HOLA_MUNDO "Hola amigos, que tal!"
        //luego al reiniciar el intellij tendria esa variable en el map y la podria acceder

        ///iterar el mapa
        System.out.println("Listando variables de entorno del sistema");

        for(String key: varEnv.keySet()){ //lista de keys
            System.out.println(key + " => " + varEnv.get(key));
        }
    }
}
