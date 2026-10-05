package co.edu.uniquindio.poo.Model;

import co.edu.uniquindio.poo.Service.Producto;

public class ProductoDigital implements Producto {
    private String nombre;
    private double precio;
    private double tamano;

    public ProductoDigital(String nombre, double precio, double tamano) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamano = tamano;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public double gettamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "Digital: " + nombre + " ($" + precio + ", " + tamano + " MB)";
    }
}
