/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends FiguraGeometricaAbstracta {

    private float a, b, c;

    public Cuadrado() {
    }

    @Override
    public float calcularArea() {
        return c = a * b;
    }

    @Override
    public float calcularPerimetro() {
        c = 2 * a + 2 * b;
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    void setR(float entrada) {
    }
    
    
}
