/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import patronDecorador.componentes.*;
import patronDecorador.decoradores.*;

/**
 *
 * @author JuanFelipe
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Cafe miCafe = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenido a la tienda de Cafe");
        System.out.println("Seleccione el cafe que desea: \n1. Capuccino \n2. Latte");
        int opc = Integer.parseInt(br.readLine());
        switch (opc){
            case 1: miCafe = new Capuccino(); break;
            case 2: miCafe = new Latte(); break;
            default: break;
        }
        boolean flag= true;
        while (flag == true){
        System.out.println("Seleccione las adiciones que desee: \n1. Chantilly \n2.Chocolate \n3. Ron \n4. Finalizar pedido");
        opc = Integer.parseInt(br.readLine());
        switch (opc){
            case 1: miCafe = new Chantilly(miCafe); break;
            case 2: miCafe = new Chocolate(miCafe); break;
            case 3: miCafe = new Ron(miCafe); break;
            case 4: flag = false;break; 
            default: flag = false;break;
            
        }
        }
        System.out.println("Su pedido es: "+miCafe.getName()+" con valor de: "+miCafe.getPrecio());
    }
    
}
