package clases_abstractas;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Guepardo es el felino mas rapido del mundo, corre a " + this.velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo ruge no tan fuerte como el Leon";
    }
}
