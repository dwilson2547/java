/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Daniel
 */
public class TransmissionServer {
    public static void main(String[] args) {
        try {
            ServerSocket trSocket = new ServerSocket(8180); 
            
            while (true) {
                Socket receiveSocket = trSocket.accept(); 
                try {
                
                ObjectInputStream inFromClient = new ObjectInputStream(receiveSocket.getInputStream()); 
                ObjectOutputStream outToClient = new ObjectOutputStream(receiveSocket.getOutputStream()); 
                
                Transmission a; 
                a = (Transmission)inFromClient.readObject(); 
                System.out.println(a.name + " " + Integer.toString(a.number)); 
                
                Transmission b; 
                b = new Transmission(a.name + a.name, a.number + a.number); 
                
                System.out.println(b.name + " " + Integer.toString(b.number));
                
                outToClient.writeObject(b); 
                outToClient.flush();
                }
                catch (Exception ex) {
                    System.out.println(ex); 
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex); 
        }
    }
}
