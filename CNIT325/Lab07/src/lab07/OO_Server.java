/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class OO_Server {
    int portNumber; 
    
    public OO_Server() {
        this.portNumber = 8189; 
    }
    
    public OO_Server(int port) {
        this.portNumber = port; 
    }
    
    public void main() { // got rid of "static" so it could be called from other classes
        try {
            ServerSocket s = new ServerSocket(this.portNumber); 
            boolean over = false; 
            while (!over) {
                Socket incoming = s.accept();
                try {
                    InputStream inStream = incoming.getInputStream(); 
                    OutputStream outStream = incoming.getOutputStream(); 
                    Scanner in = new Scanner(inStream); 
                    PrintWriter out = new PrintWriter(outStream, true); 
                    boolean done = false; 
                    while (!done && in.hasNextLine()) {
                        String lineIn = in.nextLine();
                        System.out.println(lineIn);
                        out.println("You Said: " + lineIn);
                        out.flush();
                        if (lineIn.trim().equals("bye"))
                        {
                            done = true;
                        }
                    }
                }
                catch (Exception ex) {
                    System.out.println(ex); 
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(EchoServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
