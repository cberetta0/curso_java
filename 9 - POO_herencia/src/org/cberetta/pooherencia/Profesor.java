package org.cberetta.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(){

    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override //click derecho -> Generate -> Override methods -> saludar
    public String saludar() {
        return "Buenos dias soy el profesor de " + getAsignatura()
                + ", mi nombre es " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura=" + asignatura;
    }
}
