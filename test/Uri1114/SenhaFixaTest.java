/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1114;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uri1114.SenhaFixa;

/**
 *
 * @author gabriel.braga
 */
public class SenhaFixaTest {
    
    public SenhaFixaTest() {
    }

    /**
     * Test of checaSenha method, of class SenhaFixa.
     */
    @Test
    public void testChecaSenha() {
        System.out.println("checaSenha");
        int senha = 1960;
        boolean expResult = false;
        boolean result = SenhaFixa.checaSenha(senha);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testChecaSenha1() {
        System.out.println("checaSenha");
        int senha = 2001;
        boolean expResult = false;
        boolean result = SenhaFixa.checaSenha(senha);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testChecaSenha2() {
        System.out.println("checaSenha");
        int senha = 2002;
        boolean expResult = true;
        boolean result = SenhaFixa.checaSenha(senha);
        assertEquals(expResult, result);
    }

    
}
