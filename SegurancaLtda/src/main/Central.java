/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author User
 */
public class Central implements Observer {

    public Central() {
    }

    @Override
    public void update(Observable o, Object arg) {
        boolean notificarPoliciaUsuario = (boolean) arg;
        if (notificarPoliciaUsuario == true){
            System.out.println("Ligando Para Policia");
        }
        else {
            System.out.println("Paz e Tranquilidade");
        }
    }
    
}
