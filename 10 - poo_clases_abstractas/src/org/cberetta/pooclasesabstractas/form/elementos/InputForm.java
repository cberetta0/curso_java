package org.cberetta.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm{ //hereda de la clase abstracta

    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //si esta clase fuese abstracta, no estaria a obligada a implementar el metodo de la clase padre
    @Override
    public String dibujarHtml() {
        return "<input type='" + this.tipo + "'" +
                " name='" + this.nombre + "'" +
                " value='" + this.valor + "'>";
    }
}
