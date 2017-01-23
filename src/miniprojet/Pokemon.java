/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.util.Scanner;
import miniprojet.attaques.*;

/**
 *
 * @author clement
 */



public abstract class Pokemon {
    
    private int hp = 20;
    
    Pokemon( int hp){
        this.hp = hp;
    }
    
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
        
    void attaque(Pokemon adversaire, Attaque instanceAttaque) {
       instanceAttaque.attaque(this , adversaire);
    }
    
    public void infligerDegats(int degats) {
        this.hp = this.hp - degats;
        if(this.hp < 0 ){
            this.hp = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " (HP: " + this.getHp() + ")";
    }

    public Attaque selectionnerAttaque() {
        Attaque att1 = new AttaqueRandom();
        Attaque att2 = new AttaqueConstante();
        System.out.println("1. "+att1);
        System.out.println("2. "+att2);
        
        Scanner reader = new Scanner(System.in);
        int choix = reader.nextInt();
        
        switch(choix){
            case 1 :
                return att1;
            default :
                return att2;
        }
    }


}
