/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronEstrategia.comportamientos;

/**
 *
 * @author Labing
 */
public class CanFly implements Flyable{

    @Override
    public void fly() {
        System.out.println("I believe i can fly");
    }
    
}
