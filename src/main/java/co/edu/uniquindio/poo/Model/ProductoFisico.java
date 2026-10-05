package co.edu.uniquindio.poo.Model;

import co.edu.uniquindio.poo.Service.Producto;

public class ProductoFisico implements Producto {
    private String nombre;
    private double precio;
    private double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Físico: " + nombre + " ($" + precio + ", " + peso + " kg)";
    }
}

