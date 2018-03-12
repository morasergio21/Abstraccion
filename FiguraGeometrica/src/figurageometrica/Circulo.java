/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import static java.lang.Math.*;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends FiguraGeometricaAbstracta {

    private float r;
    private double perimetro, area;

    @Override
    public float calcularArea() {
        area = (float) (PI * (r * r));
        return (float) area;

    }

    @Override
    public float calcularPerimetro() {
        perimetro = (float) (2 * PI * r);
        return (float) perimetro;

    }

    public void setR(float r) {
        this.r = r;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

}
