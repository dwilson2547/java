/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Daniel
 */
public class OO_Client {
    String hostName; 
    int portNumber; 
    
    public OO_Client() {
        this.hostName = "localhost"; 
        this.portNumber = 8189; 
    }
    // default constructor ^ for localhost and below is where you can specify ip and port
    public OO_Client(String host, int port) {
        this.hostName = host; 
        this.portNumber = port; 
    }
    // again remove static
    public void main() {
        
        try (
            Socket echoSocket = new Socket(this.hostName, this.portNumber);
            PrintWriter out =
                new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in =
                new BufferedReader(
                    new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn =
                new BufferedReader(
                    new InputStreamReader(System.in))
        ) {
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println(in.readLine());
                if (userInput.equals("bye")) {
                    break; 
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        } 
    }
}
