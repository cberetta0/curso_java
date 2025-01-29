package clases_abstractas;

import javax.swing.*;

abstract public class Canino extends Mamifero {
    //como es una clase abstracta, no debe sobreescribir los metodos del padre

    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos){
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }
}
