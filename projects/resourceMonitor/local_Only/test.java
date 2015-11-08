/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*; 
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class test {

    public static ArrayList getCPU() throws IOException {
        Runtime rt= Runtime.getRuntime();
        Process pr = rt.exec("iostat -c"); 
        BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream())); 
        
        String line = null; 
        String total = "";
        ArrayList<String> value = new ArrayList<String>(); 
        
        while((line = in.readLine()) != null) {
            total += line;  
        }

        Scanner s = new Scanner(total); 
        while(s.hasNext()) {
            value.add(s.next()); 
        }
        in.close();
        s.close();
        
        return value; 
    }
    
    public static ArrayList getRam() throws IOException {
        Runtime rt= Runtime.getRuntime();
        Process pr = rt.exec("free -m"); 
        
        BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream())); 
        
        String line = null; 
        String total = "";
        ArrayList<String> value = new ArrayList<String>(); 
        
        while((line = in.readLine()) != null) {
            total += line;  
        }
        Scanner s = new Scanner(total); 
        while(s.hasNext()) {
            value.add(s.next()); 
        }
        
        in.close();
        s.close();
        
        return value; 
    }
    
    public static void main(String[] args) throws IOException {        
        ArrayList<String> ram; 
        ram = getRam(); 
        String fStr = "%8s%8s%8s%10s%8s"; 
        System.out.println("*****************Memory*******************");
        String out1 = String.format("%8s%8s%8s%8s%10s", ram.get(0),ram.get(1),ram.get(2),ram.get(3),ram.get(4));
        String out2 = String.format("%8s%8s%8s%8s%10s", ram.get(6),ram.get(7),ram.get(8),ram.get(9),ram.get(10));
        
        System.out.println(out1); 
        System.out.println(out2);
        
        ArrayList<String> cpu; 
        cpu = getCPU(); 
        System.out.println("******************CPU*********************");
        String out3 = String.format(fStr, cpu.get(cpu.size() - 12), cpu.get(cpu.size() - 11), cpu.get(cpu.size() - 10), cpu.get(cpu.size() - 9),cpu.get(cpu.size() - 7));
        String out4 = String.format(fStr, cpu.get(cpu.size() - 6), cpu.get(cpu.size() - 5), cpu.get(cpu.size() - 4), cpu.get(cpu.size() - 3),cpu.get(cpu.size() - 1));
        System.out.println(out3); 
        System.out.println(out4); 
        System.out.println("******************************************");
    }
    
}
