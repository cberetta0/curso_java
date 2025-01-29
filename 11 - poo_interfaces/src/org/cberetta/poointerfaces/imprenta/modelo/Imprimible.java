package org.cberetta.poointerfaces.imprenta.modelo;

public interface Imprimible {

    //las interfaces no pueden implementar metodos, unicamente los definen
    //no se les pone abstractos, no llevan llaves
    //tmpc se usan atributos, unicamente constantes con final
    //ponerle public a un metodo es redundante, ya que siempre deberia ser public

    String imprimir();

    /* un metodo default permite que no todas las clases implementen todos los metodos, si por ejemplo la interfaz tiene mucho contenido que no es relevante para todos
       metodo opcional
        default String imprimir(){
            return "Imprimiendo un valor por defecto";
        }
     */
}
