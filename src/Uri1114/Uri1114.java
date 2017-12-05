/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1114;

import java.util.Scanner;

/**
 *
 * @author gabriel.braga
 */
public class Uri1114 {
    
    public static void run() {
        Scanner input = new Scanner(System.in);
        
        if (SenhaFixa.checaSenha(input.nextInt())) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Senha Invalida");
        }
    }
}
