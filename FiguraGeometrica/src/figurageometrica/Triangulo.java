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
public class Triangulo extends FiguraGeometricaAbstracta {
    
    float perimetro, area, ladoUno, ladoDos, ladoTres, semiP;
    
    public float calcularArea() {
        semiP = (ladoUno+ladoDos+ladoTres)/2
        area = (float) Math.sqrt(( semiP*(semiP-ladoUno))(semiP*(semiP-ladoDos))(semiP*(semiP-ladoTres)));
        return (float) area;

    }
    
    
    public float calcularPerimetro() {
        perimetro = (ladoUno+ladoDos+ladoTres);
        return perimetro;
        
        

    }
    
}
