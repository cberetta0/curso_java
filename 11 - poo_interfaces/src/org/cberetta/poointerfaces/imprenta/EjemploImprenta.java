package org.cberetta.poointerfaces.imprenta;

import org.cberetta.poointerfaces.imprenta.modelo.Hoja;
import org.cberetta.poointerfaces.imprenta.modelo.*;
//import static org.cberetta.poointerfaces.imprenta.modelo.Genero.*; de esta forma podria usar el egenero como PROGRAMACION solo

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Resumen laboral...", new Persona("John", "Doe"), "Ingeniero en Sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Fullstack")
                .addExperiencia("Angular");

        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Martin", "Fowler"), new Persona("James", "Gosling"));

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observer"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
