/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;
import java.io.*;
import java.net.*;
/**
 *
 * @author Daniel
 */
public class TransmissionClient {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
 
        String hostName = "192.168.64.139";
        //String hostName = "10.184.106.213"; 
        int portNumber = 8180;
        Transmission a = new Transmission("asd;lkfa;lksdf",12); 
 
        try {
                Socket echoSocket = new Socket(hostName, portNumber);
                
                ObjectOutputStream outToServer = new ObjectOutputStream(echoSocket.getOutputStream());
                ObjectInputStream inFromServer = new ObjectInputStream(echoSocket.getInputStream());
                
                outToServer.writeObject(a); 
                Transmission b = (Transmission)inFromServer.readObject(); 
                System.out.println(b.name + " " + Integer.toString(b.number)); 
                                
                echoSocket.close();
        }
        catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        } 
    }
}
