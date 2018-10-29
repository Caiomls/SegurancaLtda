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
public class Alarme implements Observer {

    public Alarme() {
        Sensores sensor = new Sensores();
        sensor.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        boolean sensorDisparado = (boolean) arg;
        if (sensorDisparado) {
            System.out.println("SIRENE E SMS");
        }
        else {
            System.out.println("PAZ E LOVE");
        }
    }
    
}
