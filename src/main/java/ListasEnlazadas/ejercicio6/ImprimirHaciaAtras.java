package ListasEnlazadas.ejercicio6;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaDoble;

public class ImprimirHaciaAtras {

    public static void main(String[] args) {
        ListaDoble<Integer> listaDoble=new ListaDoble<>();
        listaDoble.agregarfinal(1);
        listaDoble.agregarfinal(2);
        listaDoble.agregarfinal(3);
        listaDoble.agregarfinal(4);
        listaDoble.agregarfinal(5);
        System.out.println("Lista:");
        listaDoble.imprimirLista();

        System.out.println("Lista hacia atras: ");
        listaDoble.imprimirHaciaAtras();

    }

}
