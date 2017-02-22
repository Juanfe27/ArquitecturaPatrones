/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronEstrategia.objetos;

import patronEstrategia.comportamientos.Bark;

/**
 *
 * @author Labing
 */
public class Dog extends Animal{

    @Override
    public void makeSound() {
        super.soundType.makeSound();
    }
    
    public Dog(){
        super.soundType = new Bark();
    }
    
}
