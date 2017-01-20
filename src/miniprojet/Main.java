/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("CoucouLesAmis");
        
        
        Pokemon pika = new Pikachu(50);
        Pokemon raich = new Raichu(150);
        
        Pokemon[] tab = new Pokemon[2];
        
        tab[0] = pika ;
        tab[1] = raich ;
        
        for(Pokemon k : tab){
            System.out.println(k);
        }
        
        Attaque monAttaque = new AttaqueRandom();
        
        while(raich.getHp() > 0){
            pika.attaque(raich, monAttaque);
            System.out.println("-----------");
            for(Pokemon k : tab){
                System.out.println(k);
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
}
