/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorador.componentes;

/**
 *
 * @author JuanFelipe
 */
public class Latte extends Cafe{

    @Override
    public int getPrecio() {
        return 1500;
    }

    @Override
    public String getName() {
        return "Latte";
    }
    
}
