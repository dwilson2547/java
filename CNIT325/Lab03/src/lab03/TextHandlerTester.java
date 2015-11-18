/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Daniel
 */
import java.util.*;
public class TextHandlerTester {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // import java.util.Scanner;
        
        TextHandler a = new TextHandler(); 
		
        String inputString = "";
        
        while (true) {
            // (1-1) Ask a string of text / (1-2)choose from the past
            System.out.println("Which option? \n1. Start with a new string \n2. Search past strings");
            int number = in.nextInt();
            in.nextLine(); // to consume '\n' left in the scanner
			
            if (number == 1) { // start with a new string
                System.out.print("Please type a string of text: ");
                inputString = in.nextLine();
                a.addText(inputString);			
            }
            else if (number == 2){ // search past strings
                System.out.print("Enter a search keyword: ");
                inputString = in.nextLine(); 
                ArrayList<String> b = a.recallPastStrings(inputString);
                String printOut = ""; 
                for (String object:b) 
                {
                    printOut += " [" + object + "] ";
                }
                System.out.println(printOut); 
		System.out.println("Choose which string to use (number): ");
                int index = in.nextInt(); 
                in.nextLine(); // consume /n 
                inputString = b.get(index - 1).toString(); 
            }
            // (2) Choose an operation (from lab2)
		while (true) {
            a.printLnText("****Please select an operation*****"); 
            a.printLnText("Palindrome________________________1"); 
            a.printLnText("Find_All_Palindromes______________2");
            a.printLnText("Search_Text_______________________3");
            a.printLnText("Remove_Text_______________________4");
            a.printLnText("Add_Text__________________________5");
            a.printLnText("Reverse_Text______________________6");
            a.printLnText("Reverse_Each_Word_________________7");
            a.printLnText("Print_Text________________________8");
            a.printLnText("***********************************");
            a.printText("Enter choice: "); 
            int choice = in.nextInt(); 
            String key = ""; 
            switch(choice) {
                case 1:  
                    // Palindrome
                    System.out.println(a.palindrome(inputString)); 
                    break;
                case 2: 
                    // Find All Palindromes
                    System.out.println(a.findAllPalindromes(inputString));
                    break;
                case 3:
                    //Search Text
                        a.printText("Enter a key: "); 
                        key = in.nextLine(); 
                        int result = a.searchText(inputString, key); 
                        if (result == -1) 
                            a.printLnText("Key is not in string"); 
                        else
                            System.out.println(result);  
                    break;
                case 4:
                    // Remove Text
                        a.printText("Enter a key: "); 
                        in.nextLine();
                        key = in.nextLine(); 
                        a.printLnText(a.removeText(inputString, key));
                    break; 
                case 5:
                    // Add Text
                        a.printText("Enter an add string: "); 
                        String add = in.nextLine();
                        a.printText("Enter an Index: "); 
                        int ind = in.nextInt(); 
                        in.nextLine(); // clear /n character
                        a.printLnText(a.addText(ind, inputString, add));
                    break; 
                case 6:
                    // Reverse Text
                        a.printLnText(a.reverseText(inputString));
                    break;
                case 7:
                    //Reverse Each Word
                        a.printLnText(a.reverseEachWord(inputString));
                    break;
                case 8:
                    // Print Text
                        a.printLnText(inputString);
                   break;
                default: 
                    // none of the above
                    a.printLnText("Invalid Input"); 
                    break;
            }
            
            a.printText("Would you like to continue with " + inputString + "? (Y/N) : "); 
            String ans = in.next(); 
            if ("n".equals(ans.toLowerCase()))
                break; 
                }
			
			// (3) Ask whether to continue
            System.out.println("== Continue?? (y/n) ==");
            in.nextLine();
            String exit = in.nextLine();
            if (exit.equalsIgnoreCase("n")) 
                break; // end the while(true) loop
            
            
        } // end of while(true)
    } // end of main method
} // end of class
