/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class CuentaBancariaTest {
    
    public CuentaBancariaTest() {
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
     * Test of retiro method, of class CuentaBancaria.
     */
    @Test
    public void testRetiro() {
        System.out.println("retiro");
        long cantidad = 0L;
        CuentaBancaria instance = new CuentaBancariaImpl();
        instance.retiro(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consignar method, of class CuentaBancaria.
     */
    @Test
    public void testConsignar() {
        System.out.println("consignar");
        long cantidad = 0L;
        CuentaBancaria instance = new CuentaBancariaImpl();
        instance.consignar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitular method, of class CuentaBancaria.
     */
    @Test
    public void testGetTitular() {
        System.out.println("getTitular");
        CuentaBancaria instance = new CuentaBancariaImpl();
        String expResult = "";
        String result = instance.getTitular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitular method, of class CuentaBancaria.
     */
    @Test
    public void testSetTitular() {
        System.out.println("setTitular");
        String titular = "";
        CuentaBancaria instance = new CuentaBancariaImpl();
        instance.setTitular(titular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNo_cuenta method, of class CuentaBancaria.
     */
    @Test
    public void testGetNo_cuenta() {
        System.out.println("getNo_cuenta");
        CuentaBancaria instance = new CuentaBancariaImpl();
        long expResult = 0L;
        long result = instance.getNo_cuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNo_cuenta method, of class CuentaBancaria.
     */
    @Test
    public void testSetNo_cuenta() {
        System.out.println("setNo_cuenta");
        long no_cuenta = 0L;
        CuentaBancaria instance = new CuentaBancariaImpl();
        instance.setNo_cuenta(no_cuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class CuentaBancaria.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        CuentaBancaria instance = new CuentaBancariaImpl();
        long expResult = 0L;
        long result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class CuentaBancaria.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        long saldo = 0L;
        CuentaBancaria instance = new CuentaBancariaImpl();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class CuentaBancaria.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        CuentaBancaria instance = new CuentaBancariaImpl();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class CuentaBancaria.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        CuentaBancaria instance = new CuentaBancariaImpl();
        instance.setClave(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of auntenticarUsuario method, of class CuentaBancaria.
     */
    @Test
    public void testAuntenticarUsuario() {
        System.out.println("auntenticarUsuario");
        String clave = "";
        long no_cuenta = 0L;
        CuentaBancaria instance = new CuentaBancariaImpl();
        boolean expResult = false;
        boolean result = instance.auntenticarUsuario(clave, no_cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CuentaBancaria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CuentaBancaria instance = new CuentaBancariaImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CuentaBancariaImpl extends CuentaBancaria {

        public void retiro(long cantidad) {
        }

        public void consignar(long cantidad) {
        }
    }
    
}
