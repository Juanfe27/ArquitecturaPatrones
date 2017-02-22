/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObservador.observadores;

import patronObservador.sujetos.*;

/**
 *
 * @author JuanFelipe
 */
public interface Observer {
    
    public void notificar(Subject s);
    public String getName();
    public void setName(String name);
    
}
