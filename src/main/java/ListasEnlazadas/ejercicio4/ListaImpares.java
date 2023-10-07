package ListasEnlazadas.ejercicio4;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaSimple;

public class ListaImpares{
    public  static void main(String[]args) {
        ListaSimple<Integer> lista=new ListaSimple<>();
        lista.agregarfinal(1);
        lista.agregarfinal(2);
        lista.agregarfinal(3);
        lista.agregarfinal(4);
        lista.agregarfinal(5);

        obtenerImpares(lista).imprimirLista();


    }
    public static ListaSimple<Integer> obtenerImpares(ListaSimple<Integer> lista) {
        int contador=0;
        ListaSimple<Integer> listaImpares=new ListaSimple<>();
        while(lista.indiceValido(contador)) {
            if(lista.obtenerValorNodo(contador)%2!=0) {
                listaImpares.agregarfinal(lista.obtenerValorNodo(contador));
            }
            contador++;
        }
        return listaImpares;
    }
}
