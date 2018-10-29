/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class SegurancaLtda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Central central = new Central();
        Alarme alarme = new Alarme();
        Sensores sensores = new Sensores();
        sensores.addObserver(central);
        sensores.addObserver(alarme);
        sensores.detectar();
        sensores.nadaAcontecendo();
    }
    
}
