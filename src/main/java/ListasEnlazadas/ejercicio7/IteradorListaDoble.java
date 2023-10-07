package ListasEnlazadas.ejercicio7;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaDoble;

import java.util.Iterator;
import java.util.ListIterator;
public class IteradorListaDoble {
    public static void main(String []arg) {
        ListaDoble<Integer> listaDoble=new ListaDoble<>();
        listaDoble.agregarfinal(1);
        listaDoble.agregarfinal(2);
        listaDoble.agregarInicio(3);
        listaDoble.imprimirLista();

        ListaDoble<Integer>.IteradorListaDoble iterator = listaDoble.new IteradorListaDoble(listaDoble.getNodoPrimero());
        ListaDoble<Integer>.IteradorListaDoble iterator2 = listaDoble.new IteradorListaDoble(listaDoble.getNodoUltimo());

        System.out.println("Iterando en orden:");
        while (iterator.hasNext()) {
            int elemento = iterator.next();

            System.out.println("Elemento: " + elemento);
        }
        System.out.println("Iterando al reves:");
        while (iterator2.hasPrevious()) {
            int elemento = iterator2.previous();
            System.out.println("Elemento: " + elemento);
        }
    }
}

