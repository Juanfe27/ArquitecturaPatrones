/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronEstrategia.objetos;

import patronEstrategia.comportamientos.Soundable;

/**
 *
 * @author Labing
 */
public abstract class Animal {
    
    protected Soundable soundType;
    
    public abstract void makeSound();
}
