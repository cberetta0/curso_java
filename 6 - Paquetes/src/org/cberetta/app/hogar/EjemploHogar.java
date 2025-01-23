package org.cberetta.app.hogar;

import org.cberetta.app.jardin.Perro;

import static org.cberetta.app.hogar.Persona.*;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona(); //no hace falta impotarla porque esta dentro del mismo package
        Perro perro = new Perro(); //si lo importo porque es otro package
        //perro.jugar(); no lo puedo utilizar porque es default, no puedo invocarlo desde otro paquete

        String saludo = saludar(); //hago el import estatico pero no hace falta importar la clase persona porque se encuentra dentro del mismo package
    }
}
