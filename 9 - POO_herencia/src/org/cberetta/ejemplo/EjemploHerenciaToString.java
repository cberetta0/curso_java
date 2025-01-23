package org.cberetta.ejemplo;

import org.cberetta.pooherencia.Alumno;
import org.cberetta.pooherencia.AlumnoInternacional;
import org.cberetta.pooherencia.Persona;
import org.cberetta.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Chiara", "Beretta", 22, "Instituto Nacioanl");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("chiara@correo.com");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        Profesor profesor = new Profesor("Andres", "Guzman", "Matematica");
        profesor.setEdad(37);
        profesor.setEmail("andres@correo.com");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("=================================================");
        System.out.println(persona); //se invoca al toString correspondiente a cada tipo de persona
    }
}
