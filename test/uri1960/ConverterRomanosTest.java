/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1960;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel.braga
 */
public class ConverterRomanosTest {
    
    public ConverterRomanosTest() {
    }

    /**
     * Test of converte method, of class ConverterRomanos.
     */
    @Test
    public void testConverte() {
        System.out.println("converte");
        int vlr = 666;
        String expResult = "DCLXVI";
        String result = ConverterRomanos.converte(vlr);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testConverte1() {
        System.out.println("converte");
        int vlr = 83;
        String expResult = "LXXXIII";
        String result = ConverterRomanos.converte(vlr);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testConverte2() {
        System.out.println("converte");
        int vlr = 999;
        String expResult = "CMXCIX";
        String result = ConverterRomanos.converte(vlr);
        assertEquals(expResult, result);
    }
    
}
