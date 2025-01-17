import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); //es una clase abstracta, por eso no hago el new

        //puedo setear otra fecha que no sea la actual
        calendario.set(2020, 0, 25, 19, 20, 10); //los meses se arrancan a contar de 0. Puedo no pasarle todos los param

        //otra forma de setear la fecha
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR, 7); //de 0 a 11
        //calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.HOUR_OF_DAY, 19); //de 1 a 24
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        //si no seteo nada me da la fecha actual
        Date fecha = calendario.getTime(); //con el metodo getTime de calendario obtengo la fecha
        System.out.println("fecha sin fomato = " + fecha); //igual a instanciar un objeto tipo Date

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaStr = df.format(fecha);
        System.out.println("fecha con formato = " + fechaStr);



    }
}
