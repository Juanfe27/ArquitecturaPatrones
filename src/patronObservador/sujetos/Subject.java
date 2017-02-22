/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObservador.sujetos;

import patronObservador.observadores.*;

/**
 *
 * @author JuanFelipe
 */
public interface Subject {
    
    public void subscribe(Observer o);
    public void unsubscribe(String userName);
    public String getState();
    public void setState(String newstate);
    
}
