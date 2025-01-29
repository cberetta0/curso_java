package clases_abstractas;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + this.especieLobo + " caza junto a su grupo de " + this.numCamada + " individuos en los bosques de " + this.habitat;
    }

    @Override
    public String dormir() {
        return "El Lobo " + this.color + " duerme en las cabernas de " + this.habitat;
    }

    @Override
    public String correr() {
        return "El Lobo " + this.especieLobo + " corre en las llanuras aledañas a los bosques de " + this.habitat;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + this.especieLobo + " " + this.color + " aulla en luna llena";
    }
}
