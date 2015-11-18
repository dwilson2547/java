/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Transmission implements Serializable {
    String name; 
    int number;
    
    public Transmission(String Name, int Number) {
        this.name = Name;
        this.number = Number; 
    }
}
