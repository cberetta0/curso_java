public class IFlujosDeControl {

    public static void main(String[] args) {

        // IF ELSE

        float promedio = 5.8f;

        if(promedio >= 6.5)
            System.out.println("Felicitaciones, excelente promedio!"); //si tengo una sola linea de código puedo omitir las llaves
        else if(promedio >= 6.0){
            System.out.println("Muy buen promedio!");
        } else if(promedio >= 5.5){
            System.out.println("Buen promedio");
        } else{
            System.out.println("Insuficiente");
        }

        // SWITCH CASE

        int numero = 2;

        switch(numero){ //el switch soporta byte, short, int, char, string (y las clases wrappers)
            case 0:
                System.out.println("El numero es cero");
                break; //si no pongo los break va a entrar en todos los casos
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Numero desconocido");
        }

        int mes = 12;
        int nroDias = 0;
        int anio = 2020;

        switch(mes){ //en este caso es util omitir el break
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nroDias = 30;
                break;
            case 2:
                if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){ //pregunto si es anio bisiesto
                    nroDias = 29;
                } else{
                    nroDias = 28;
                }
            default:
                nroDias = 0;
        }

        System.out.println("nroDias = " + nroDias);

        // WHILE

        int c = 0;

        while(c < 5){
            System.out.println("c = " + c);
            c++;
        }

        c = 0;
        boolean prueba = true;

        while(prueba){

            if(c == 7){
                prueba = false;
            }
            System.out.println("i = " + c);
            c++;
        }

        // DO WHILE
        // es una iteracion post-condicion, primero ejecuta la sentencia y al final evalua la expresion (siempre se ejecuta por lo menos una vez)

        prueba = false;
        do {
            System.out.println("Se ejecuta al menos una sola vez");
        } while(prueba);

        // BUCLE FOR

        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        for(int i = 5; i >= 0; i--){
            System.out.println("i = " + i);
        }

        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                continue; //si es par no hace nada, sigue con el resto de iteraciones
            }

            System.out.println("i = " + i); //imprimo los nros impares
        }

        String[] nombres = {"Chiara", "Justina", "Uma", "Fabio", "Alejandra"};
        int longitud = nombres.length;

        for(int i = 0; i < longitud ; i++){
            if(nombres[i].equalsIgnoreCase("Uma")){
                continue;
            }
            System.out.println(i + ": " + nombres[i]);
        }

        // SENTENCIA FOREACH
        // solo para arreglos

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 14};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }

        // ETIQUETAS PARA BUCLES (for o while)

        bucle1:
        for(int i = 0; i < 5; i++){

            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n===============================");

        etiqueta:
        for(int i = 0; i < 5; i++){

            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n===============================");

        //una persona trabaja 5 dias 8 horas
        bucle:
        for(int i = 1; i < 8; i++){

            System.out.println();
            for(int j = 1; j <= 8; j++){
                if(i == 6 || i == 7){
                    System.out.println("Dia " + i + ": descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs. ");
            }
        }
    }
}
