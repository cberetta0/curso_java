package org.cberetta.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        this.experiencias.add(experiencia);
        return this; //returno el mismo objeto para q la llamada al metodo se pueda encadenar
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: "); //como tengo un for uso StringBuilder
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: ").append("\n");
        for(String experiencia: experiencias){
            sb.append("- ").append(experiencia).append("\n");
        }
        return sb.toString();
    }
}
