package clases_abstractas;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[6];

        //creo algunas instancias de ejemplo de cada clase concreta, asociadas al tipo mas genérico posible
        Mamifero leon = new Leon("Sur Africa", 120, 5, 7.5f, "Leon", 20, 120, 220, 190);
        Mamifero tigre = new Tigre("Rusia", 7.9f, 72, 130, "Tigre", 330, 300, "Siberiano");
        Mamifero lobo = new Lobo("Europa", 1.5f, 2.5f, 200, "Lobo", "Gris marrón y negro", 80, 120, "Ibérico");
        Mamifero perro = new Perro("Africa", 2.5f, 1.5f, 100, "Perro", "Tricolor de manchas negras, blancas y óxido", 35, 45);
        Mamifero tigreBengala = new Tigre("India e Indonesia", 7.9f, 72, 120, "Tigre", 270, 220, "Bengala");
        Mamifero guepardo = new Guepardo("Africa", 130, 2, 94, "Guepardo", 72, 120);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanioColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanioGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
