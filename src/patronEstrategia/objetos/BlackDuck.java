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
public class BlackDuck extends Duck{

    @Override
    public void fly() {
        super.FlyBehavior.fly();
        
    }
    
    public BlackDuck(){
        super.FlyBehavior = new CanFly();
        super.QuackBehavior = new RepublicanQuack();
    }

    @Override
    public void quack() {
        super.QuackBehavior.quack();
    }
    
}
