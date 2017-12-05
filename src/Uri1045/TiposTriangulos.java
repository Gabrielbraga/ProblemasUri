/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1045;

/**
 *
 * @author gabriel.braga
 */
public class TiposTriangulos {
    
    
    public static String testaTriangulos(double a, double b, double c) {
        if (a >= (b+c)) {
            return "NAO FORMA TRIANGULO";
        }
        
        String result = "";
        
        if (a*a == (b*b + c*c)) {
            result += "TRIANGULO RETANGULO\n";
        } else if (a*a > b*b + c*c) {
            result += "TRIANGULO OBTUSANGULO\n";
            
            
        } else { 
            result += "TRIANGULO \n";
                    
        }
        
        if (a == b && b == c && a==c){ 
             result += "TRIANGULO \n";
            
        } else if (a==b || a==c || b==c) 
            result += "TRIANGULO ISOCELES";      
            
        
        
        
        
           

 
    
}
