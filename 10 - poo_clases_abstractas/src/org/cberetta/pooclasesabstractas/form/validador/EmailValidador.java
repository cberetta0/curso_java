package org.cberetta.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "el campo %s tiene un formato de correo invalido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX); //valida que cumpla con el patron especificado en la expresion regular
    }
}
