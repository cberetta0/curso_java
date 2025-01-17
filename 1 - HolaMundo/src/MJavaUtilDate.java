import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MJavaUtilDate {

    public static void main(String[] args) {

        //clase Date

        Date fecha = new Date();

        System.out.println("fecha = " + fecha); //Fri Dec 27 15:13:28 BRT 2024

        //Clase para formatear una fecha al pasarle un patron

        SimpleDateFormat simpleDate = new SimpleDateFormat("dd 'de' MMMM, yyyy"); //para ver ejemplos de patrones https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        String fechaStr = simpleDate.format(fecha); //fecha formateada

        System.out.println("fechaStr = " + fechaStr);

        //getTime() devuelve la cantidad de milisegundos transcurridos a partir del 1 de enero de 1970 (epoca de Unix)
        //pertenece a la clase Date
        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);


        //de string a Date
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        //la idea seria que la fecha string (dentro del parse) la ingrese el usuario usando scanner
        try { //el parse me obliga a poner el try and catch por si se ingresa cualquier cosa
            Date date = formato.parse("2020-01-30"); //convierte la fecha string a formato date -> Thu Jan 30 00:00:00 BRT 2020
            System.out.println("date = " + date);
            System.out.println("formato = " + formato.format(date)); //formateo el date

            //comparar 2 fechas. Cual es mas cercana???
            Date date2 = new Date();

            if(date.after(date2)){
                System.out.println("date es despues que date2");
            } else if(date.before(date2)){
                System.out.println("date es anterior a date2");
            } else if (date.equals(date2)) {
                System.out.println("date es igual a date2");
            }

            //otra forma de comparar fechas
            if(date.compareTo(date2) > 0){
                System.out.println("date es despues que date2");
            } else if (date.compareTo(date2) < 0) {
                System.out.println("date es anterior a date2");
            } else if (date.compareTo(date2) == 0) {
                System.out.println("date es igual a date2");
            }

        } catch (ParseException e) {
            System.err.println("La fecha tiene un formato incorrecto " + e);
            System.err.println("El formato debe ser yyyy-MM-dd");
            System.exit(1);
            //main(args); si la fecha me la ingresara el usuario podria volver a invocar el main para que se reinicie el programa
        }
    }
}
