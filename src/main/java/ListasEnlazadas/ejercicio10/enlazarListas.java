package ListasEnlazadas.ejercicio10;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaSimple;

public class enlazarListas {
    public static void main(String[] arg) {
        ListaSimple<Integer> lista1=new ListaSimple<>();
        ListaSimple<Integer> lista2=new ListaSimple<>();

        System.out.println("lista1:");
        lista1.agregarfinal(1);
        lista1.agregarfinal(2);
        lista1.agregarfinal(3);
        lista1.imprimirLista();

        System.out.println("lista2");
        lista2.agregarfinal(4);
        lista2.agregarfinal(3);
        lista2.agregarfinal(6);
        lista2.imprimirLista();

        System.out.println("unionLista");
        unirListas(lista1, lista2).imprimirLista();

        System.out.println("unionLista sin nodos repetidos");
        unirListasSinRepeticion(lista1, lista2).imprimirLista();
    }
    public static ListaSimple<Integer> unirListas(ListaSimple<Integer> lista1, ListaSimple<Integer> lista2) {
        ListaSimple<Integer> listaFinal = new ListaSimple<>();
        for (Integer valor : lista1) {
            listaFinal.agregarfinal(valor);
        }
        for (Integer valor : lista2) {
            listaFinal.agregarfinal(valor);
        }

        return listaFinal;
    }
    public static ListaSimple<Integer> unirListasSinRepeticion(ListaSimple<Integer> lista1, ListaSimple<Integer> lista2) {
        ListaSimple<Integer> listaFinal = new ListaSimple<>();
        for (Integer valor : lista1) {
            if (!listaFinal.contiene(valor)) {
                listaFinal.agregarfinal(valor);
            }
        }
        for (Integer valor : lista2) {
            if (!listaFinal.contiene(valor)) {
                listaFinal.agregarfinal(valor);
            }
        }

        return listaFinal;
    }

}
