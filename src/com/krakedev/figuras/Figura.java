package com.krakedev.figuras;

// Se define como clase abstracta para no permitir instanciar "Figura" genéricas
public abstract class Figura {
    private String nombre;
    private String color;

    // Constructor con parámetros
    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Métodos Abstractos (Obligan a las clases hijas a implementarlos)
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return "Figura [Nombre=" + nombre + ", Color=" + color + "]";
    }
}