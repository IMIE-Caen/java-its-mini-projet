/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import miniprojet.attaques.Attaque;
import miniprojet.attaques.AttaqueRandom;

/**
 *
 * @author duche
 */
public class Combat {

    Pokemon pok1;
    Pokemon pok2;
    
     public Combat(Pokemon pok1, Pokemon pok2) {
         this.pok1 = pok1;
         this.pok2 = pok2;
                
     }

     public void lancerCombat(){
        
        
        boolean tourDePok1 = true;
        Pokemon attaquant;
        Pokemon attaqué;
        
        while(pok1.getHp() > 0 && pok2.getHp() > 0){
            if(tourDePok1){
                attaquant = pok1;
                attaqué = pok2;
            }
            else{
                attaquant = pok2;
                attaqué = pok1;
            }
            
            Attaque attaqueLancée ;
            
            if(tourDePok1){
                attaqueLancée = pok1.selectionnerAttaque();
                
            }
            else{
              attaqueLancée = new AttaqueRandom();   
            }
            
                       
            attaquant.attaque(attaqué, attaqueLancée);
            System.out.println("-----------");
            for(Pokemon k : new Pokemon[]{pok1, pok2}){
                System.out.println(k);
            }
            
            tourDePok1 = !tourDePok1;
        }   
     }
     
     
     @Override
     public String toString() {
          return "Combat : " + pok1 + " VERSUS " + pok2;
     }
     
}
