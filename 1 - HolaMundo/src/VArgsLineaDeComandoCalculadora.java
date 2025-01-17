public class VArgsLineaDeComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.err.println("Por favor ingresar una operación (sumar, restar, multiplicar, dividir) y dos numeros enteros");
            System.exit(-1);
        }

        //3 args: tipo de operacion y dos numeros
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try{

            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch (Exception e){

            System.err.println("a y b deben ser enteros");
        }

        switch(operacion){
            case "sumar":
                resultado = a+b;
                break;
            case "restar":
                resultado = a-b;
                break;
            case "multiplicar":
                resultado = a*b;
                break;
            case "dividir":
                if(b == 0){
                    System.err.println("No se puede dividir por cero");
                    System.exit(-1);
                }
                resultado = (double) a/b;
                break;
            default:
                resultado = a+b;
        }

        System.out.println("Resultado de la operacion " + operacion + " es " + resultado);
    }
}

//para pasar argumentos al main desde intellij selecciono la clase que quiero ejecutar arriba a la derecha
//voy a los tres puntitos y selecciono run with parameters
//ingreso los parametros y le doy a run
