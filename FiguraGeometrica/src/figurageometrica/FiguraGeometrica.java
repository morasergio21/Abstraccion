/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.*;

/**
 *
 * @author Estudiantes
 */
public class FiguraGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado miCuadrado = new Cuadrado();
        Circulo miCirculo = new Circulo ();
        
        Scanner miS = new Scanner(System.in);
        float entrada;
        
        System.out.println("Ingrese la base del cuadrado: ");
        entrada = miS.nextFloat();
        miCuadrado.setA(entrada);
        System.out.println("Ingrese la  del cuadrado: ");
        entrada = miS.nextFloat();
        miCuadrado.setB(entrada);
        System.out.println(miCuadrado.calcularArea());
        System.out.println(miCuadrado.calcularPerimetro());
        
        System.out.println("Ingrese el radio del circulo: ");
        entrada = miS.nextFloat();
        miCuadrado.setR(entrada);
        
    
        System.out.println(miCirculo.calcularArea());
        System.out.println(miCirculo.calcularPerimetro());
        
        
        
       
        
        
        
   
        
    }
    
}
