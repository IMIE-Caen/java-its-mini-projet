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
public class AttaqueConstante extends Attaque {

    @Override
    public void attaque(Pokemon attaquant, Pokemon adversaire) {
       adversaire.infligerDegats(20);   
       attaquant.infligerDegats(10);   
    }
    
}
