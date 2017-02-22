/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObservador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import patronObservador.observadores.User;
import patronObservador.sujetos.Channel;

/**
 *
 * @author JuanFelipe
 */
public class Client {
    
    public static void main(String[] args) throws IOException {
        Channel Jeff = new Channel();
        Jeff.setName("My Name Is Jeff");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag){    
            System.out.println("Seleccione la opción: ");
            System.out.println("1. Suscribir \n2. Desuscribir \n3. Cambiar estado");
            int opc = Integer.parseInt(br.readLine());
        switch(opc){
            case 1: System.out.println("Ingrese su nombre");
            String userName = br.readLine();
            User user = new User(userName);
            Jeff.subscribe(user);
            break;
            case 2: System.out.println("Ingrese su nombre");
            Jeff.unsubscribe(br.readLine());
            break;
            case 3: System.out.println("Ingrese el nuevo estado");
            Jeff.setState(br.readLine());
            break;
            default: flag = false;break;
        }
        }
        
        
    }
    
}
