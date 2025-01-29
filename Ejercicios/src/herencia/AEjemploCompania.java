package herencia;

public class AEjemploCompania {

    public static void main(String[] args) {
        /*
            Una compañía maneja empleados y clientes, entre los empleados hay gerentes
            que manejan presupuesto para su área (modificable) y a todos los empleados
            se les puede aumentar el sueldo, se pide una jerarquía de clase de los tipos
            de persona mencionados, tomando como base la figura del diagrama UML de clases.
            Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un
            constructor y el toString() con sobre-escritura, para Gerente además el método
            setter de presupuesto. También incluir una clase main con algún ejemplo de un
            Gerente e imprimir todos sus datos (y heredados) vía toString().
         */

        AGerente gerente = new AGerente("Chiara", "Beretta", "123", "Rivadavia 224", 23, 1000000, 23456);

        System.out.println(gerente);
    }
}
