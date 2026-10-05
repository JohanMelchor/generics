package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import co.edu.uniquindio.poo.Service.CarritoIterator;
import co.edu.uniquindio.poo.Service.Producto;

public class Carrito<T extends Producto> implements Iterable<T> {
    private List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public T obtenerProductoMayorPrecio() {
        T mayor = null;
        for (T producto : productos) {
            if (mayor == null || producto.getPrecio() > mayor.getPrecio()) {
                mayor = producto;
            }
        }
        return mayor;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (T producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        productos.forEach(System.out::println);
    }

    public Iterator<T> Iterador(double precioMinimo) {
        return new CarritoIterator<>(productos, precioMinimo);
    }

    @Override
    public Iterator<T> iterator() {
        return new CarritoIterator<>(productos, 0.0);
    }
}
