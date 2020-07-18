/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.area;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel
 */
public class Controlador_areaTest {
    
    public Controlador_areaTest() {
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
     * Test of listar method, of class Controlador_area.
     */
//    @Test
//    public void testListar() {
//        System.out.println("listar");
//        Controlador_area instance = new Controlador_area();
//        int expResult = 1;
//        int result = instance.listar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of insertar method, of class Controlador_area.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        area a = null;
        a = new area(100,"Contabilidad");
        Controlador_area instance = new Controlador_area();
        int expResult = 1;
        int result = instance.insertar(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
