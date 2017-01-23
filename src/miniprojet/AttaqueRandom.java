/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.util.Random;

/**
 *
 * @author clement
 */
public class AttaqueRandom extends Attaque {

    @Override
    public void attaque(Pokemon attaquant, Pokemon adversaire) {
       int degats = new Random().nextInt(11);
       adversaire.infligerDegats(degats);   
    }
    
}
//bonjour
