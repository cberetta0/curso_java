package clases_abstractas;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + this.especieTigre + " caza solitario en los manglares y bosques monzónicos de " + this.habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + this.especieTigre + " duerme en la selvas de " + this.habitat;
    }

    @Override
    public String correr() {
        return "El Tigre " + this.especieTigre + " corre a " + this.velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Ruge Tigre y agacha sus orejas";
    }
}
