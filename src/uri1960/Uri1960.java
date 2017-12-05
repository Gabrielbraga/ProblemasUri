/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1960;

import java.util.Scanner;

/**
 *
 * @author gabriel.braga
 */
public class Uri1960 {
    
    
    public static void run() {
        Scanner input = new Scanner(System.in);
        
        int arabico = input.nextInt();
        
        String romano = ConverterRomanos.converte(arabico);
        System.out.println(romano);
    }
}
