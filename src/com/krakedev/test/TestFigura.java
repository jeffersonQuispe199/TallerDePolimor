package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFigura {
    public static void main(String[] args) {
        // Nota: No se puede instanciar Figura directamente porque es abstracta:
        // Figura f = new Figura("Figura", "Azul"); -> Genera ERROR

        // Usamos referencias de la clase padre asignando objetos de clases hijas
        Figura cuadrado = new Cuadrado("Cuadrado", "Rojo", 4);
        Figura triangulo = new Triangulo("Triángulo", "Verde", 5, 8);

        // Se prueba la impresión directa (invoca automáticamente toString())
        System.out.println(cuadrado);
        System.out.println(triangulo);
    }
}