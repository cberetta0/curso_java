package org.cberetta.clasegenerica;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "caballo"));
        transporteCaballos.add(new Animal("Grillo", "caballo"));
        transporteCaballos.add(new Animal("Tunquen", "caballo"));
        transporteCaballos.add(new Animal("Topocalma", "caballo"));
        transporteCaballos.add(new Animal("Longotoma", "caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.add(new Maquinaria("Bulldozer"));
        transporteMaquinaria.add(new Maquinaria("Grua Horquilla"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinaria);

        Camion<Automovil> transporteAutos = new Camion<>(3);
        transporteAutos.add(new Automovil("Toyota"));
        transporteAutos.add(new Automovil("Mitsubishi"));
        transporteAutos.add(new Automovil("Chevrolet"));

        imprimirCamion(transporteAutos);
    }

    public static <T> void imprimirCamion(Camion<T> camion){
        for (T t: camion){
            if(t instanceof Animal){
                System.out.println(((Animal)t).getNombre() + "tipo: " + ((Animal)t).getTipo());
            } else if (t instanceof Automovil) {
                System.out.println(((Automovil)t).getMarca());
            } else if (t instanceof Maquinaria) {
                System.out.println(((Maquinaria)t).getTipo());
            }
        }
    }
}
