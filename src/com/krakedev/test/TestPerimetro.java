package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado("Cuadrado 1", "Rojo", 5);
        Rectangulo r = new Rectangulo("Rectángulo 1", "Azul", 4, 6);

        System.out.println("Perímetro del Cuadrado: " + c.calcularPerimetro());
        System.out.println("Perímetro del Rectángulo: " + r.calcularPerimetro());
    }
}