public class HOperadores {

    public static void main(String[] args) {

        // ARITMETICOS
        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("suma = " + suma);

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i / j; //me devuelve la division entera por ser int
        float division2 = (float) i / j; //tengo q castear el resultado ya q i y j al ser enteros, aunque el resultado sea float esos no lo son
        System.out.println("division = " + division);
        System.out.println("division2 = " + division2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        // ASIGNACION

        i += 2; //incremmento i en 2
        System.out.println("i = " + i); //i valia 5, ahora 7

        j -= 3; //decremento j en 3
        System.out.println("j = " + j); //j valia 4, ahora 1

        j *= 6; //multiplico j por 6
        System.out.println("j = " + j); //j valia 1, ahora 6

        String nombre = "Chiara";
        nombre += " Beretta";
        System.out.println("nombre = " + nombre);

        // UNARIOS

        //le cambian el signo a la variable
        int c = -5;

        int h = +c; // h = (1)*i => -5
        System.out.println("h = " + h);

        int k = -c; // k = (-1)*i => 5
        System.out.println("k = " + k);

        // INCREMENTALES

        int g = 1;

        int b = ++g; //pre incremento: primero se incrementa g y luego se asigna a b. b = 2
        System.out.println("g = " + g); // b va a valer 2
        System.out.println("b = " + b); // g va a valer 2

        g = 2;
        b = g++; //post incremento: primero se asigna g a b y luego se incrementa g en 1
        System.out.println("g = " + g); // g va a valer 3
        System.out.println("b = " + b); // b va a valer 2

        g = 3;
        b = --g; //pre decremento: primero se decrementa g y luego se asigna a b. b = 2
        System.out.println("g = " + g); // g va a valer 2
        System.out.println("b = " + b); // b va a valer 2

        g = 4;
        b = g--; //post decremento: primero se asigna g a b y luego se decrementa g en 1
        System.out.println("g = " + g); // g va a valer 3
        System.out.println("b = " + b); // b va a valer 4

        // RELACIONALES

        int o = 3;
        byte l = 7;
        float m = 127e-7f;
        double d = 2.1413e3;
        boolean f = false;

        boolean esIgual = o == l; //si ambos tuviesen el mismo valor seria true
        System.out.println("esIgual = " + esIgual);

        boolean negacion = !esIgual; //la variable era falsa, por lo tanto ahora es true
        System.out.println("negacion = " + negacion);

        boolean esDistinto = o != j; //retorna true pues tienen valores distintos
        System.out.println("esDistinto = " + esDistinto);

        boolean esMayor = o > l; //false pues 3 es menor q 7
        System.out.println("esMayor = " + esMayor);

        boolean esMenor = o < l; //true. 3 menor q 7
        System.out.println("esMenor = " + esMenor);

        boolean esMayorIgual = d >= m; //a m se le corre la coma 7 lugares para la izquierda. true
        System.out.println("esMayorIgual = " + esMayorIgual);

        boolean esMenorIgual = d <= m; //d es mucho mayor q m
        System.out.println("esMenorIgual = " + esMenorIgual);

        // LÓGICOS

        boolean dobleAmpersand = o == l && m > d; //&& va a evaluar la primera condicion y al ver q no se cumple no evaluara la seegunda. Ya es falso
        System.out.println("dobleAmpersand = " + dobleAmpersand);
        //&& no evalua ambas condiciones si no es necesario, mientras que & siempre evalua ambas. Puedo evaluar varias condiciones
        boolean ampersandSimple =  o != l & m < d; //& va a evaluar la primera expresion (true) y luego la segunda (false) => false. si la primera fuese falsa igualmente tambien evaluaria la segunda. En eso se diferencia del &&
        System.out.println("ampersandSimple = " + ampersandSimple);

        boolean doblePipe = o != l || m > d; //como detecta que la primera es true, no evalua la segunda. Devuelve true
        System.out.println("doblePipe = " + doblePipe);

        boolean pipeSimple = o == l | m > d; //la primera es false, la variable seria false ya pero igualmente evalua la segunda condicion
        System.out.println("pipeSimple = " + pipeSimple);

        boolean precedencia = o == l || m < d && f == true; //&& tiene mayor precedencia sobre ||. Se evaluaria de esta forma  o == l || (m < d && f == true)
        System.out.println("precedencia = " + precedencia);

        boolean precedencia2 = true || false && false || false; //Segun la precedencia se evaluaria ((true || (false && false)) || false). Arroja true
        System.out.println("precedencia2 = " + precedencia2);

        // OPERADOR TERNARIO
        // variable = condicion ? si es verdadero : si es falso;

        String variable =  7 == 7 ? "Es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio  = 6.2;
        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("promedio = " + estado);

        int maximo = 0;
        int nro1 = 10;
        int nro2 = 5;
        int nro3 = 0;

        maximo = nro1 > nro2 ? nro1 : nro2;
        maximo = maximo > nro3 ? maximo : nro3;
        System.out.println("maximo = " + maximo);

        // OPERADOR INSTANCE OF

        Integer num = 10;
        Boolean b1 = num instanceof Integer;
        System.out.println("b1 = " + b1);
        boolean b2 = num instanceof Object; //Da true ya q todos los objetos heredan de la clase Object. Los numeros tmb de Number
        System.out.println("b2 = " + b2);
        boolean b3 = b1 instanceof Boolean;
        System.out.println("b3 = " + b3);

        // PRECEDENCIA DE LOS OPERADORES

        /* De más a menos

        ++ -- + - !             de derecha a izquierda (pre y post incremento/decremento)
        ()                      de derecha a izquierda
        * / %                   de derecha a izquierda
        + -                     de derecha a izquierda
        > >= < <= instance of   de derecha a izquierda
        == !=                   de derecha a izquierda
        &&                      de derecha a izquierda
        ||                      de derecha a izquierda
        ()?:                    de derecha a izquierda
        = += -= *= /= %=        de derecha a izquierda

        */
    }
}
