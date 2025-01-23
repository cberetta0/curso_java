package org.cberetta.ejemplo;

import org.cberetta.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos en comun del tipo Persona");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("institucion: " + ((Alumno)persona).getInstitucion());
            System.out.println("nota matematica: " + ((Alumno)persona).getNotaMatematica());
            System.out.println("nota historia: " + ((Alumno)persona).getNotaHistoria());
            System.out.println("nota castellano: " + ((Alumno)persona).getNotaCastellano());

            //AlumnoInternacional tambien hereda de alumno
            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("pais: " + ((AlumnoInternacional)persona).getPais());
                System.out.println("nota idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
            }

            System.out.println("==================== sobre escritura promedio ============================");
            System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
            System.out.println("==================== sobre escritura promedio ============================");
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("asignatura: " + ((Profesor)persona).getAsignatura());
        }

        System.out.println("==================== sobre escritura saludar ============================");
        System.out.println(persona.saludar());
        System.out.println("================================================");
    }
}
