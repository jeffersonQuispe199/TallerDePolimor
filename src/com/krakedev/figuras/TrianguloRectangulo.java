package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {
    private double catetoA;
    private double catetoB;
    private double hipotenusa;

    public TrianguloRectangulo(String nombre, String color, double catetoA, double catetoB) {
        super(nombre, color);
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        // La hipotenusa se calcula automáticamente usando el teorema de Pitágoras
        this.hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    @Override
    public double calcularArea() {
        return (catetoA * catetoB) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return catetoA + catetoB + hipotenusa;
    }
}