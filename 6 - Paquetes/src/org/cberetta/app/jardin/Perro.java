package org.cberetta.app.jardin;

import org.cberetta.app.hogar.Persona;

public class Perro {
    protected String nombre; //solo se pueden acceder dentro del mismo paquete
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
