/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.DiscountCalculator;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class DiscountCalculatorServicio {
    
    Scanner read = new Scanner(System.in);
    
    DiscountCalculator calculator = new DiscountCalculator();
    
    double a = calculator.getPrecio();
    double b = calculator.getDescuento();
    
    public double descuento(double a, double b){
              
        double cobrar = a - a * b / 100;

        return cobrar;
    }

}
