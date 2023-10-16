/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit1;

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorServicio;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class JUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        DiscountCalculator calculator = new DiscountCalculator();
        
        DiscountCalculatorServicio servicio = new DiscountCalculatorServicio();
        
        System.out.println("Ingrese el valor del producto"); 
        calculator.setPrecio(read.nextDouble());
        
        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = read.nextDouble();
        calculator.setDescuento(descuento);
        
        if (descuento < 0 && descuento > 100) {
            System.out.println("Lo sentimos, este procentaje no aplica a tu compra");
        } 
      
        System.out.println("El valor a cobrar es: " + servicio.descuento(calculator.getPrecio(), calculator.getDescuento()));
        
    }
    
}
