/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObservador.sujetos;

import java.util.ArrayList;
import patronObservador.observadores.Observer;

/**
 *
 * @author JuanFelipe
 */
public class Channel implements Subject{
    
    ArrayList<Observer> observers;
    String state;
    String name;
    
    public Channel(){
        observers = new ArrayList();
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(String userName) {
        for(int i = 0; i < observers.size();i++){
            if(observers.get(i).getName().equals(userName)){
                observers.remove(i);
            }
        }
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String newstate) {
        state = newstate;
        for(int i = 0; i < observers.size();i++){
            observers.get(i).notificar(this);
        }        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
