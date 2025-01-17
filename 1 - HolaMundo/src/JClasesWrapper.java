import java.lang.reflect.Method;

public class JClasesWrapper {

    public static void main(String[] args) {

        //cada tipo primitivo tiene su equivalente en un tipo de referencia o clase
        //dan mayor funcionalidad para operaciones de comprobaciones y conversiones

        // primitivo            clase equivalente
        /*
            byte                   Byte
            short                  Short
            int                    Integer
            long                   Long
            float                  Float
            double                 Double
            char                   Character
            boolean                Boolean
        */

        // INTEGER

        //dos formas de definir el objeto
        Integer intObjeto = Integer.valueOf(12345);
        Integer intObjeto2 =12345;

        //de int a Integer
        int primitivo = 8;
        Integer intObjeto3 = Integer.valueOf(primitivo);
        Integer intObjeto4 = primitivo;

        //de Integer a int
        int num = intObjeto;
        int num2 = intObjeto.intValue();

        //de String a Integer
        String valorString = "6700";
        Integer valor = Integer.valueOf(valorString);


        //Operadores relacionales cuando se trata de clases wrapper (objetos)

        Integer numero1 = 1000;
        Integer numero2 = numero1;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        System.out.println("Son el mismo objeto? " + (numero1 == numero2)); //true poq ambas variables apuntan al mismo objeto (no compara valor, sino la posicion en la memoria)

        numero2 = 1000;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        System.out.println("Son el mismo objeto? " + (numero1 == numero2)); //false, ya que si bien ambos tienen el mismo valor, no se esta apuntando al mismo objeto

        //como comparo por valor
        System.out.println("tienen el mismo valor? " + numero1.equals(numero2));
        System.out.println("tienen el mismo valor? " + (numero1.intValue() == numero2.intValue())); //los primitivos no son objetos sino un valor

        //con <, >, <=, >=, /, *, +, - puedo usar las clases wrappers sin problema. Solo compara por referencia con el ==
        boolean condicion = numero1 >= numero2;
        System.out.println("condicion = " + condicion);


        // BOOLEAN

        Integer nro1, nro2;
        nro1 = 1;
        nro2 = 2;

        boolean booleanPrimitivo = nro1 > nro2; //false
        Boolean objetoBoolean = Boolean.valueOf(booleanPrimitivo); //o booleanPrimitivo
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("booleanPrimitivo = " + booleanPrimitivo);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparando objetos boolean " + (objetoBoolean == objetoBoolean2)); //en este caso compara por valor, da true (no es el mismo caso que Integer)
        System.out.println("Comparando objetos boolean " + (objetoBoolean.equals(objetoBoolean2))); //se puede comparar de cualquier forma
        System.out.println("Comparando objetos boolean " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando objetos boolean " + (objetoBoolean == objetoBoolean3));

        //para convertir de un objeto a tipo primitivo
        boolean booleanPrimitivo2 = objetoBoolean2.booleanValue(); //tambien se puede booleanPrimitivo2 = objetoBoolean2; directamente


        //Metodo getClass() permite conocer info sobre un objeto. La estructura interna de la clase

        String texto = "Hola que tal!";
        Class strClass = texto.getClass();

        //la clase tiene muchos metods que muestran distinta info
        System.out.println("strClass.getName() = " + strClass.getName()); //nombre completo (incluye package)
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName()); //nombre sin paquete
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        //foreach que imprime los metodos de la clase
        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName()); //lista todos los metodos de la clase string
        }


        Integer numero = 34;
        Class intClass = numero.getClass();

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //clase Number
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass()); //class Object

        for(Method metodo: intClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName()); //lista todos los metodos de la clase Integer
        }

    }
}
