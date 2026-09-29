package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {
    public static void main(String[] args) {
        Graficador graficador = new Graficador();

        // Polimorfismo: la variable es de tipo Figura, pero referencia instancias de las clases hijas
        Figura f1 = new Cuadrado("Cuadrado", "Rojo", 5);
        Figura f2 = new Rectangulo("Rectángulo", "Azul", 4, 6);
        Figura f3 = new TrianguloRectangulo("Triángulo Rectángulo", "Amarillo", 3, 4);
        Figura f4 = new Hexagono("Hexágono", "Morado", 6);

        // Una sola llamada al método graficar ejecuta el cálculo correcto de cada figura
        graficador.graficar(f1);
        graficador.graficar(f2);
        graficador.graficar(f3);
        graficador.graficar(f4);
    }
}