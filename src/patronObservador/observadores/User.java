/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObservador.observadores;

import patronObservador.sujetos.Subject;

/**
 *
 * @author JuanFelipe
 */
public class User implements Observer{
    
    String name;

    public User(String name){
        this.name = name;
    }
    @Override
    public void notificar(Subject s) {
        System.out.println(name+" : "+s.getState());
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name= name;
    }
    
}
