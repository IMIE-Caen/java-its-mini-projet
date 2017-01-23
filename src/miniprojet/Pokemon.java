/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.util.ArrayList;
import java.util.Scanner;
import miniprojet.attaques.*;

/**
 *
 * @author clement
 */



public abstract class Pokemon {
    
    private int hp = 20;
    private ArrayList<Attaque> attaquesApprises = new ArrayList<Attaque>();
    
    Pokemon( int hp){
        this.hp = hp;
    }
    
    Pokemon(int hp, ArrayList<Attaque> attaques){
        this(hp);
        this.attaquesApprises = attaques;
    }
    
    public void apprendre(Attaque attaque){
        if(attaquesApprises.size() < 4)
            attaquesApprises.add(attaque);
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
        
        for(int i = 0 ; i < attaquesApprises.size() ; i ++){
            System.out.println( i + ". " + attaquesApprises.get(i));
        }
        
        Scanner reader = new Scanner(System.in);
        int choix = reader.nextInt();
        
        return attaquesApprises.get(choix);

    }


}
