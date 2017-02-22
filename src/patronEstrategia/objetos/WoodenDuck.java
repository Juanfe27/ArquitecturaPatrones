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
public class WoodenDuck extends Duck{

    public WoodenDuck(){
        super.FlyBehavior = new CantFly();
        super.QuackBehavior = new CantQuack();
    }
    @Override
    public void fly() {
        super.FlyBehavior.fly();
    }

    @Override
    public void quack() {
        super.QuackBehavior.quack();
    }
    
}
