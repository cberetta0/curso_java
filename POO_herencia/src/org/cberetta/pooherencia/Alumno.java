package org.cberetta.pooherencia;

public class Alumno extends Persona {

    //una clase que extiende de otra no puede acceder a los atributos del padre si son privados.
    //lo debe hacer como el resto, a traves de los getters y setters
    //si los atributos se los pone protected, los hijos lo pueden acceder, es para herencia, pero no es recomendado
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    //los constructores se van encadenando en las llamadas implicitamente
    //antes de invocar el de alumno, se llama al de persona y asi sucesivamente
    public Alumno() {

    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaMatematica, double notaCastellano, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    //Alumno tiene sus getters y setters, pero ademas tiene los del padre, ya que los hereda

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override //sobreescribo el metodo del padre para q sea mas especifico
    public String saludar(){
        return super.saludar() + " soy alumno y mi nombre es " + getNombre();
    } //super.saludar() retorna exactamente lo que el padre, me sirve para reutilizar el codigo y agregar lo q necesite

    public double calcularPromedio(){
        return (this.notaMatematica + this.notaCastellano + this.notaHistoria) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio=" + this.calcularPromedio();
    }
}
