package ListasEnlazadas.ejercicio5;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaSimple;

public class repetidosLista {
    public static void main(String []arg) {
        ListaSimple<Integer> listaSimple=new ListaSimple<>();
        listaSimple.agregarfinal(1);
        listaSimple.agregarfinal(2);
        listaSimple.agregarfinal(1);
        listaSimple.agregarfinal(1);
        listaSimple.agregarfinal(2);
        listaSimple.agregarfinal(3);
        System.out.println(contarRepetidos(listaSimple,1));
        System.out.println(contarRepetidos(listaSimple,3));
    }
    public static int contarRepetidos(ListaSimple<Integer> lista, Integer valorNodo) {
        int contador=0;
        for(int i=0;i<lista.getTamanio();i++) {
            if(lista.obtenerValorNodo(i).equals(valorNodo)) {
                contador++;
            }

        }
        return contador;
    }
}