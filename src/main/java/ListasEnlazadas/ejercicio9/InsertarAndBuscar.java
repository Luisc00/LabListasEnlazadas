package ListasEnlazadas.ejercicio9;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaDobleCircular;

public class InsertarAndBuscar {
    public static void main(String []arg) {
        ListaDobleCircular<Integer> listaDobleCircular=new ListaDobleCircular<>();
        listaDobleCircular.agregarFinal(1);
        listaDobleCircular.agregarFinal(2);
        listaDobleCircular.agregarFinal(3);
        listaDobleCircular.imprimirLista();

        listaDobleCircular.insertar(4, 0);

        System.out.println("el nodo esta en la posicion: "+listaDobleCircular.buscar(3));

        listaDobleCircular.imprimirLista();



    }


}

