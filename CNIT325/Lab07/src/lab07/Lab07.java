/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        System.out.println("Choose an option");
        System.out.println("****************");
        System.out.println("1) EchoClient");
        System.out.println("2) TransmissionClient");
        System.out.println("3) EchoServer");
        System.out.println("4) TimeClient");
        System.out.println("5) TransmissionServer");
        System.out.println("6) coming soon"); 
        System.out.println("****************");
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); 
        if (a == 1) {
            EchoClient.main(args);
        }
        else if (a == 2) {
            TransmissionClient.main(args);
        }
        else if (a == 3) {
            EchoServer.main(args);
        }
        else if (a == 4) {
            TimeClient.main(args); 
        }
        else if (a == 5) {
            System.out.println("coming soon"); 
        }
        else if (a == 6) {
            System.out.println("coming soon"); 
        }
        else 
            System.out.println("Invalid Input"); 
    }
}
