package org.cberetta.pooclasesabstractas.form;

import org.cberetta.pooclasesabstractas.form.elementos.*;
import org.cberetta.pooclasesabstractas.form.elementos.select.Opcion;
import org.cberetta.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        //ElementoForm elemento = new ElementoForm(); esto no es posible ya que la clase es abstracta

        InputForm username = new InputForm("username"); //por defecto es text
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NumeroValidador());
        lenguaje.addOpcion(new Opcion("1", "Java").setSelected())
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScript"))
        .addOpcion(new Opcion("4", "Typescript"))
        .addOpcion(new Opcion("5", "PHP"));

        //clase anonima, es utilizable una unica vez, y debo implementar su metodo abstracto
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "'>";
            }
        };

        saludar.setValor("Hola este campo esta deshabilitado");

        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 años de experiencia ...");

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        elementos.forEach(elemento -> {
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(elemento -> {
            if(!elemento.esValido()){
                elemento.getErrores().forEach(System.out::println); //err -> System.out.printl(err)
            }
        });
    }
}
