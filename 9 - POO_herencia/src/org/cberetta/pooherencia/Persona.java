package org.cberetta.pooherencia;

public class Persona {

    //Si los atributos fuesen protected, las clases que hereden de persona podrian accederlos
    //directamente, sin los getters y setters, siempre y cuando todas se encuentren en el
    //mismo package
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona() {
        //cada que implemento un constructor con parametros se pierde el
        //constrcutor por default (vacio) entonces lo dejo implementado
        //si lo saco veria tmb un error en la herencia, ya que al querer
        //Alumno invocar el constructor vacio de persona no lo va a encontrar
        //porque cada constructor llama al del padre implicitamente (haria super())
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!";
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email=" + email +
                ", saludo= " + this.saludar();
    }
}
