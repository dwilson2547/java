/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab07;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Daniel
 */
public class TimeClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time-A.timefreq.bldrdoc.gov",13);
            try {
                InputStream inStream = s.getInputStream();
                Scanner in = new Scanner(inStream); 
                while (in.hasNextLine()) {
                    String line = in.nextLine(); 
                    System.out.println(line); 
                }
            }
            finally {
                s.close();
            }
//            catch (Exception ex) {
//                
//            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
