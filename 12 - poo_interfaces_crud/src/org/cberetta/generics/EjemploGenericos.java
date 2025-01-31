package org.cberetta.generics;

import org.cberetta.poointerfaces.modelo.Cliente;
import org.cberetta.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Chiara", "Beretta"));

        Cliente chiara = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Chiara", "Beretta"),
                new Cliente("Justina", "Beretta")};
        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Chiara", "Justina", "Fabio", "Alejandra"}, enterosArreglo);

        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]{new ClientePremium("Chiara", "Beretta")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        //maximo
        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Maximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arandanos y manzana es: " + maximo("zanahoria", "arandanos", "manzana"));
    }

    //pueden haber metodos o clases genericas tambien
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    //Bounded Generics: limito al tipo generico
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c); //puede recibir Integer, Float, Double, etc
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c); //puede recibir ClientePremium (ya que implementa la interfaz comparable)
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for (G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    //Wildcard generics
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    } //una List<Cliente> no incluye una List<ClientePremium>, no son lo mismo

    //lo mismo que
    /*
    public static <T extends Cliente> void imprimirClientes(List<T> c){
        c.forEach(System.out::println);
    }
    */

    //Ejemplo genericos: obteniendo el mayor de 3 elementos que implementen la interfaz comparable
    //Pueden ser Number (int, float, double, long, etc), String
    //Recibe 3 elementos y retorna T, el tipo de dato con el que se este trabajando
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
