package ListasEnlazadas.ejercicio3;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaSimple;

public class EliminarNumerosPares {
    public  static void main(String[]args) {
        ListaSimple<Integer> lista=new ListaSimple<>();
        lista.agregarfinal(1);
        lista.agregarfinal(2);
        lista.agregarfinal(3);
        lista.agregarfinal(4);
        lista.agregarfinal(5);

        eliminarPares(lista);
        lista.imprimirLista();

    }
    public static ListaSimple<Integer> eliminarPares(ListaSimple<Integer> lista) {
        int contador=0;
        //ListaSimple<Integer> listaPares=new ListaSimple<>();
        while(lista.indiceValido(contador)) {
            if(lista.obtenerValorNodo(contador)%2==0) {
                lista.eliminar(lista.obtenerValorNodo(contador));
            }
            contador++;
        }
        return lista;
    }
}

