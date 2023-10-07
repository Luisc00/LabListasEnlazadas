package ListasEnlazadas.ejercicio1;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaSimple;

import java.util.Iterator;


public class ImparesLista {

    public static void main(String arg[]) {
        ListaSimple<Integer> lista=new ListaSimple<>();
        lista.agregarfinal(0);
        lista.agregarfinal(1);
        lista.agregarfinal(2);
        lista.agregarfinal(3);
        lista.agregarfinal(4);
        lista.agregarfinal(5);
        lista.imprimirLista();


        System.out.println("posicionesImpares");
        obtenerNumeros_posicionesImpares(lista).imprimirLista();

    }
    public static ListaSimple<Integer> obtenerNumeros_posicionesImpares(ListaSimple<Integer> lista) {
        int contador=0;
        ListaSimple<Integer> listaImpares=new ListaSimple<>();
        while(lista.indiceValido(contador)) {
            if(contador%2!=0) {
                listaImpares.agregarfinal(lista.obtenerValorNodo(contador));
            }
            contador++;
        }
        return listaImpares;
    }
}
