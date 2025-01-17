import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ClasesDateYCalendar {
    public static void main(String[] args) {

         /*
            Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
            convertirla a una fecha del tipo java.util.Date y calcular la edad de la
            persona de acuerdo a la fecha actual.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento en formato 'dd-MM-yyyy'");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {

            Date fechaNac = dateFormat.parse(scanner.next());
            Calendar calendarioNac = Calendar.getInstance();
            calendarioNac.setTime(fechaNac);

            Date fechaActual = new Date();
            Calendar calendarioAct = Calendar.getInstance();
            calendarioAct.setTime(fechaActual);

            int edad = calendarioAct.get(Calendar.YEAR) - calendarioNac.get(Calendar.YEAR);

            //ajuste por si el cumpleaños aun no ha ocurrido este año
            if(calendarioAct.get(Calendar.DAY_OF_YEAR) < calendarioNac.get(Calendar.DAY_OF_YEAR)){
                edad--;
            }

            System.out.println("Su edad es de " + edad + " años");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
