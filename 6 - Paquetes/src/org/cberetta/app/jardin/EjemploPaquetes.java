package org.cberetta.app.jardin;

import org.cberetta.app.hogar.ColorPelo;
import org.cberetta.app.hogar.Persona; //importo por fuera para no usar el nombre largo
import org.cberetta.app.hogar.Gato;
//import org.cberetta.app.hogar.*; podria borrar las dos de arriba y reemplazarlas por esta linea

//import static org.cberetta.app.hogar.Persona.saludar;
//import static org.cberetta.app.hogar.Persona.GENERO_FEMENINO;
//import static org.cberetta.app.hogar.Persona.GENERO_MASCULINO;
import static org.cberetta.app.hogar.Persona.*; //usar los de arriba seria lo mismo
import static org.cberetta.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        //org.cberetta.app.hogar.Persona p = new org.cberetta.app.hogar.Persona(); reemplazado por el import
        Persona p = new Persona();
        p.setNombre("Chiara");
        p.setApellido("Beretta");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Gato g = new Gato();
        Perro perro = new Perro(); //no es necesario importarla porque esta en el mismo nivel q main (.app que esta arriba en el import del package)
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        //String saludo = Persona.saludar(); para evitarme utiliza rel nombre de la clase puedo tener un import estatico
        String saludo = saludar(); //esto mismo tambien sirve para enumeradores, constantes, etc, todo lo que sea estatico
        System.out.println("saludo = " + saludo);
        String generoMasculino= GENERO_MASCULINO;
        String generoMujer= GENERO_FEMENINO;
    }
}
