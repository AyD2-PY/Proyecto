/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileJunit;

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
public class MyAgileTestTest {
    
    public MyAgileTestTest() {
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
     * Test of add method, of class MyAgileTest.
     */
    @Test 
    public void testAdd() {
        System.out.println("add");
        String s1 = "2"; //Valor de prueba 1
        String s2 = "2"; //Valor de prueba 2
        MyAgileTest instance = new MyAgileTest();
        int expResult = 4; //Resultado esperado de la Suma.
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    @Test   //Prueba 2 en donde se prueban numeros distintos
    public void testAdd2() {
        System.out.println("add");
        String s1 = "6"; //Valor de prueba 1
        String s2 = "4"; //Valor de prueba 2
        MyAgileTest instance = new MyAgileTest();
        int expResult = 10; //Resultado esperado de la Suma.
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    //Prueba en donde se verifica que el codigo ingresado sea solamente numeros y no texto
    @Test (expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "Texto"; //Valor de prueba 1
        String s2 = "2"; //Valor de prueba 2
        MyAgileTest instance = new MyAgileTest();
        int expResult = 4; //Resultado esperado de la Suma.
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
}
