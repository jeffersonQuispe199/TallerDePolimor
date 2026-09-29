package com.krakedev.figuras;

public class Graficador {

    // Método que aprovecha el POLIMORFISMO
    // Recibe cualquier objeto que herede de Figura
    public void graficar(Figura figura) {
        System.out.println("Graficando " + figura.getNombre().toUpperCase() + 
                           " de color " + figura.getColor().toUpperCase() + 
                           " | Perímetro: " + figura.calcularPerimetro() + 
                           " | Área: " + figura.calcularArea());
    }
}