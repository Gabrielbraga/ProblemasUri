/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1114;

/**
 *
 * @author gabriel.braga
 */
public class SenhaFixa {
    
    private static final int SENHA_FIXA = 2002;
    
    public static boolean checaSenha(int senha) {
        return senha == SENHA_FIXA;
    }
}

