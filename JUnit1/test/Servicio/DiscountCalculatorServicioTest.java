/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.DiscountCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dani_
 */
public class DiscountCalculatorServicioTest {
    
    public DiscountCalculatorServicioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
               
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of descuentoDiezPorcientoP1 method, of class DiscountCalculatorServicio.
     */
    
    @Test
    public void testDescuento() {
        
        DiscountCalculatorServicio calculator = new DiscountCalculatorServicio(); 
        
        double result =  calculator.descuento(100, 10);
        
        assertEquals(90, result, 0.01);

    }
    
}
