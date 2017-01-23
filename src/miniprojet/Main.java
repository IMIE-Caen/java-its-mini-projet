/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;
import miniprojet.attaques.*;

import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("CoucouLesAmis");
        
        
        Pokemon pika = new Pikachu(50);
        Pokemon raich = new Raichu(50);
        
        Combat comb = new Combat(pika, raich);
        
        System.out.println(comb);
        comb.lancerCombat();
        
        
    }
    
}
