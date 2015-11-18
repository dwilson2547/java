/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

/**
 *
 * @author Daniel
 */
public class OO_Call {
    public static void main(String[] args) {
        // call classes here
        OO_Server a = new OO_Server(); 
        a.main(); 
        // obviously call them in different classes but this is the theory behind it 
        OO_Client b = new OO_Client(); 
        b.main(); 
    }
}
