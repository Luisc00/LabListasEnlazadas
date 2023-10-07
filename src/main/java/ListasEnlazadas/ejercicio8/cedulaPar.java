package ListasEnlazadas.ejercicio8;

import ListasEnlazadas.ListasEnlazadasGenericas.ListaDoble;
import ListasEnlazadas.ListasEnlazadasGenericas.ListaSimple;

public class cedulaPar {
    public static void main(String arg[]) {
        ListaDoble<Persona> listaPersonas = new ListaDoble<>();
        listaPersonas.agregarfinal(new Persona(1022));
        listaPersonas.agregarfinal(new Persona(1021));
        listaPersonas.agregarfinal(new Persona(1024));
        listaPersonas.agregarfinal(new Persona(1025));

        System.out.println("Lista original:");
        listaPersonas.imprimirLista();

        listaPersonas = obtenerCedulasPares(listaPersonas);


        System.out.println("Lista con cédulas pares:");
        listaPersonas.imprimirLista();

    }

    public static ListaDoble<Persona> obtenerCedulasPares(ListaDoble<Persona> lista) {
        int contador = 0;
        ListaDoble<Persona> listaPar = new ListaDoble<>();
        while (contador < lista.getTamanio()) {
            Persona persona = lista.obtenerValorNodo(contador);
            if (persona != null && persona.getCedula() % 2 == 0) {
                listaPar.agregarInicio(new Persona(persona.getCedula()));
            }
            contador++;
        }
        return listaPar;
    }
}
