/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Observable;

/**
 *
 * @author User
 */
public class Sensores extends Observable {
    boolean sendoAssaltado;
    public Sensores() {
    }
    
    void detectar(){
        this.sendoAssaltado = true;
        setChanged();
        notifyObservers(sendoAssaltado);
    }
    
    void nadaAcontecendo(){
        this.sendoAssaltado = false;
        setChanged();
        notifyObservers(sendoAssaltado);
    }
}
