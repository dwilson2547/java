/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */

public class EchoServer {
    
    public static void main (String[] args) {
        try {
            ServerSocket s = new ServerSocket(8189); 
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
