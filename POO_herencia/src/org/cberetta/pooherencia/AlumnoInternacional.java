package org.cberetta.pooherencia;

public final class AlumnoInternacional extends Alumno {

    //clase final: no se puede heredar
    //metodo final:: no se puede sobreescribir

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){

    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido); //este super seria de la clase Alumno, el padre
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    //esta clase tambien hereda los getters y setters de alumno y persona
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override //sobreescribo el metodo del tipo Alumno en este caso
    public String saludar() {
        return super.saludar() + " soy extranjero del pais " + getPais();
    } //super.saludar viene de Alumno

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio() * 3) + this.notaIdiomas) / 4;
    } //con el *3 neutralizo el /3 del padre, y agrego la nota adicional de alumnoInt y /4

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
