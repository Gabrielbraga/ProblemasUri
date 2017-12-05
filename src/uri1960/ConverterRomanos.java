/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1960;

/**
 *
 * @author gabriel.braga
 */
public class ConverterRomanos {

    public static String converte(int vlr) {
        //declarando as variaveis

        String roma = "";

        //para 900 ->CM
        while (vlr >= 900) {
            roma += "CM";
            vlr -= 900;
        }
        //para 500 -> D
        while (vlr >= 500) {
            roma += "D";
            vlr -= 500;
        }
        //para 400 -> CD
        while (vlr >= 400) {
            roma += "CD";
            vlr -= 400;
        }
        //para 100 -> C
        while (vlr >= 100) {
            roma += "C";
            vlr -= 100;
        }
        //para 90 -> XC
        while (vlr >= 90) {
            roma += "XC";
            vlr -= 90;
        }
        //para 50 -> L
        while (vlr >= 50) {
            roma += "L";
            vlr -= 50;
        }
        //para 40 -> XL
        while (vlr >= 40) {
            roma += "XL";
            vlr -= 40;
        }
        //para 10 -> X
        while (vlr >= 10) {
            roma += "X";
            vlr -= 10;
        }
        //para 9 -> IX
        while (vlr >= 9) {
            roma += "IX";
            vlr -= 9;
        }
        //para 5 -> V
        while (vlr >= 5) {
            roma += "V";
            vlr -= 5;
        }
        //para 4 -> IV
        while (vlr >= 4) {
            roma += "IV";
            vlr -= 4;
        }
        //para 1 -> I
        while (vlr >= 1) {
            roma += "I";
            vlr -= 1;
        }
        return roma;
    }
}

