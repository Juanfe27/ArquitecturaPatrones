/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorador.decoradores;

import patronDecorador.componentes.*;

/**
 *
 * @author JuanFelipe
 */
public class Chocolate extends Adicion{

    public Chocolate(Cafe cafesito){
        this.miCafe = cafesito;
    }
    
    @Override
    public int getPrecio() {
        return this.miCafe.getPrecio() + 500;
    }

    @Override
    public String getName() {
        return this.miCafe.getName() + "Chocolate ";
    }
    
}
