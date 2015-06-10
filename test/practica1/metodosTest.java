/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import proyecto.metodos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author naul
 */
public class metodosTest {
    
    public metodosTest() {
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
     * Test of precionacional method, of class metodos.
     
        */
    
    @Test
    public void testPrecionacional() {
        System.out.println("precionacional");
        double precio = 250.0;  //Precio real
        metodos instance = new metodos();
        double expResult = 342.5;  // a Q250 el precio correcto es = 342.5
        double result = instance.precionacional(precio);
        assertEquals(expResult, result, 0.0); //Comparacion de resultados para validar la prueba
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
        {
        fail("The test case is a prototype.");
        }
    }
    
    /**
     * Test of precioeextranjero method, of class metodos.
     */
    @Test
    public void testPrecioeextranjero() {
        System.out.println("precioeextranjero");
        double precio = 350.0;
        metodos instance = new metodos();
        double expResult = 3101.0;   // A $350 el resultado es = 3101.0
        double result = instance.precioeextranjero(precio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
        {
        fail("The test case is a prototype.");
        }
    }

    
}
