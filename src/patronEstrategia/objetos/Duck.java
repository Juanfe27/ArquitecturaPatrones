/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronEstrategia.objetos;

import patronEstrategia.comportamientos.*;

/**
 *
 * @author Labing
 */
public abstract class Duck {
    
    protected Flyable FlyBehavior;
    protected Quackable QuackBehavior;
    
    public abstract void fly();
    
    public abstract void quack();
}
