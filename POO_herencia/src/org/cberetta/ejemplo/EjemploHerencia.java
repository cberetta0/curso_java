package org.cberetta.ejemplo;

import org.cberetta.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        //Cualquier clase hija es tambien del tipo de sus padres, por ejemplo podria hacer
        //Persona alumno = new Alumno()
        //((Alumno)alumno).setInstitucion("institucion");
        //setNombre y Apeellido se podrian utilizar directo sin cast ya q los tiene la clase Persona
        Alumno alumno = new Alumno();
        alumno.setNombre("Chiara");
        alumno.setApellido("Beretta");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Matematica");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        //Recorro toda la jerarquia de clases de alumno internacional
        Class clase = alumnoInt.getClass(); //Class me muestra toda la metadata de la clase
        while(clase.getSuperclass() != null){
            String hija = clase.getName(); //devuelve el nombre, incluido el package
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
