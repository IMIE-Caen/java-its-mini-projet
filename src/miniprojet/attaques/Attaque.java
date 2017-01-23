/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet.attaques;
import miniprojet.*;

/**
 *
 * @author clement
 */
public abstract class Attaque {
    public abstract void attaque(Pokemon attaquant, Pokemon adversaire);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() ;
    }
    
}
