package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Model.Carrito;
import co.edu.uniquindio.poo.Model.ProductoDigital;
import co.edu.uniquindio.poo.Model.ProductoFisico;
import co.edu.uniquindio.poo.Service.Producto;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Carrito<Producto> carrito = new Carrito<>();

        carrito.agregarProducto(new ProductoFisico("Laptop", 1200.50, 2.5));
        carrito.agregarProducto(new ProductoDigital("Licencia Office", 99.99, 0.5));
        carrito.agregarProducto(new ProductoFisico("Mouse", 25.99, 0.2));
        carrito.agregarProducto(new ProductoDigital("Antivirus", 49.99, 1.2));
        carrito.agregarProducto(new ProductoFisico("Monitor", 350.00, 4.0));
        carrito.agregarProducto(new ProductoDigital("Curso de Java", 150.00, 0.0));
        carrito.agregarProducto(new ProductoFisico("Teclado", 75.00, 1.0));
        carrito.agregarProducto(new ProductoDigital("Ebook de POO", 15.00, 0.0));
        carrito.agregarProducto(new ProductoFisico("Impresora", 200.00, 6.0));

        System.out.println("Todos los productos");
        for (Producto p : carrito) {
            System.out.println(p);
        }

        System.out.println("\nProductos caros (>= $100) con iterador propio");
            Iterator<Producto> it = carrito.Iterador(100.0);
            while (it.hasNext()) {
                System.out.println(it.next());
        }

        System.out.println("\nProductos muy caros (>= $500) con iterador propio");
            it = carrito.Iterador(500.0);
            while (it.hasNext()) {
                System.out.println(it.next());
        }

        System.out.println("\nProducto de mayor precio:");
        System.out.println(carrito.obtenerProductoMayorPrecio());

        System.out.printf("\nPrecio total: $%.2f%n", carrito.calcularPrecioTotal());
    }
}