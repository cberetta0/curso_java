package org.cberetta.clasegenerica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//cualquier objeto que implementa esta interfaz se puede iterar
public class Camion<T> implements Iterable<T> { //con el <T> defino que esta clase tiene un parametro generico

    private List<T> objetos;
    private int max; //maxima cantidad de elementos a trasnportar

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto){
        if(this.objetos.size() <= max){
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("no hay mas espacio");
        }

    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
