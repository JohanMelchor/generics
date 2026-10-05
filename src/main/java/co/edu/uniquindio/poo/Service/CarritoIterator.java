package co.edu.uniquindio.poo.Service;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarritoIterator<T extends Producto> implements Iterator<T> {

    private final List<T> lista;
    private final double precioMinimo;
    private int indice = 0;
    private T siguiente;

    public CarritoIterator(List<T> lista, double precioMinimo) {
        this.lista = lista;
        this.precioMinimo = precioMinimo;
        avanzarHastaCaro();
    }

    /**
     * Avanza el índice hasta encontrar el próximo producto
     * cuyo precio sea >= precioMinimo.
     * Si no hay más, deja 'siguiente' en null.
     */
    private void avanzarHastaCaro() {
        while (indice < lista.size()) {
            T actual = lista.get(indice++);
            if (actual.getPrecio() >= precioMinimo) {
                siguiente = actual;
                return;
            }
        }
        siguiente = null;
    }

    @Override
    public boolean hasNext() {
        return siguiente != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más productos caros");
        }
        T actual = siguiente;
        avanzarHastaCaro();
        return actual;
    }
}