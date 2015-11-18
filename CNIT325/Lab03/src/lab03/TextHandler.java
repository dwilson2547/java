/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class TextHandler {
    /* Member variables */    
    private ArrayList<String> textList; // private variable (encaptulation)
   
    /* Constructors */  
    public TextHandler(){ 
        textList = new ArrayList(); // Constructs an empty list with an initial capacity of ten.
    }
   
    /* Getter & setter */
	public ArrayList<String> getTextList(){ // getter
        return textList;
    }
	
    public void addText(String input){	// setter
        textList.add(input);
    }
   
    public boolean palindrome(String s) {
        int i; 
        int j; 
        if (s == null || s.length() <= 1)
            return false;
        for (i = 0, j = s.length() - 1; i < j; i++, j--) {
        if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true; 
    }
    
    public String findAllPalindromes(String in) {
        int i; 
        int j; 
        String ret = ""; 
        for (i = 0; i < in.length(); i++) {
            for (j =  i + 2; j < in.length() + 1; j++) {
                if (i == j) 
                    continue; 
                if (palindrome(in.substring(i, j))) {
                    ret = ret + " " + in.substring(i,j); 
                }
            }
        }
        return ret; 
    }
    
    public int searchText(String in, String key) {
        if (in.contains(key))
                return in.indexOf(key);
        return -1; 
    }
    
    public String removeText(String in, String rm) {
        String repl; 
        if (in.contains(rm)) {
            repl = in.replace(rm, "");
            return repl; 
        }
        return in; 
    }
    
    public String addText(int index, String in, String add) {
        String ret;  
        ret = in.substring(0, index) + add + in.substring(index); 
        return ret; 
    }
    
    public String reverseText(String s) {
        String b = ""; 
        for (int i = s.length() - 1; i >= 0; i--) {
            b = b + s.charAt(i); 
        }
        return b; 
    }
    
    public String reverseEachWord(String s) {
        String[] a = s.split(" "); 
        String ret = ""; 
        for (int i = 0; i < a.length; i++) {
            a[i] = reverseText(a[i]); 
            ret = ret + a[i] + " ";  
        }
        return ret; 
    }
    
    public void printText(String s) {
        System.out.print(s); 
    }
    
    public void printLnText(String s) {
        System.out.println(s); 
    }
    
    // Lab3: recallPastStrings
    public ArrayList<String> recallPastStrings(String substring) {
        ArrayList<String> searchResult = new ArrayList<>();
        for (int i = 0; i < textList.size(); i++) 
        {
            
            if(textList.get(i).contains(substring))
            {
                searchResult.add(textList.get(i));
            }
        }
        return searchResult;
    }
}