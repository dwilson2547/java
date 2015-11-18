package lab03;

import java.util.Scanner;

/**
 * @author Daniel Wilson
 * @lab Wednesday 1:30 pm
 * @version 1.0
 * @date 9/8/15
 */
public class Lab02 {

    public static boolean palindrome(String s) {
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
    
    public static String findAllPalindromes(String in) {
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
    
    public static int searchText(String in, String key) {
        if (in.contains(key))
                return in.indexOf(key);
        return -1; 
    }
    
    public static String removeText(String in, String rm) {
        String repl; 
        if (in.contains(rm)) {
            repl = in.replace(rm, "");
            return repl; 
        }
        return in; 
    }
    
    public static String addText(int index, String in, String add) {
        String ret;  
        ret = in.substring(0, index) + add + in.substring(index); 
        return ret; 
    }
    
    public static String reverseText(String s) {
        String b = ""; 
        for (int i = s.length() - 1; i >= 0; i--) {
            b = b + s.charAt(i); 
        }
        return b; 
    }
    
    public static String reverseEachWord(String s) {
        String[] a = s.split(" "); 
        String ret = ""; 
        for (int i = 0; i < a.length; i++) {
            a[i] = reverseText(a[i]); 
            ret = ret + a[i] + " ";  
        }
        return ret; 
    }
    
    public static void printText(String s) {
        System.out.print(s); 
    }
    
    public static void printLnText(String s) {
        System.out.println(s); 
    }
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); 
        while (true) {
            printLnText("****Please select an operation*****"); 
            printLnText("Palindrome________________________1"); 
            printLnText("Find_All_Palindromes______________2");
            printLnText("Search_Text_______________________3");
            printLnText("Remove_Text_______________________4");
            printLnText("Add_Text__________________________5");
            printLnText("Reverse_Text______________________6");
            printLnText("Reverse_Each_Word_________________7");
            printLnText("Print_Text________________________8");
            printLnText("***********************************");
            printText("Enter choice: "); 
            int choice = a.nextInt(); 
            
            switch(choice) {
                case 1:  
                    // Palindrome
                    while (true) {
                        printText("Enter a string: ");  
                        a.nextLine();
                        String in = a.nextLine();
                        System.out.println(palindrome(in));
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }
                    break;
                case 2: 
                    // Find All Palindromes
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine(); 
                        String in = a.nextLine();
                        System.out.println(findAllPalindromes(in)); 
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }  
                    break; 
                case 3:
                    //Search Text
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine();
                        String in = a.nextLine();
                        printText("Enter a key: "); 
                        String key = a.nextLine(); 
                        int result = searchText(in, key); 
                        if (result == -1) 
                            printLnText("Key is not in string"); 
                        else
                            System.out.println(result); 
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }  
                    break;
                case 4:
                    // Remove Text
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine();
                        String in = a.nextLine();
                        printText("Enter a key: "); 
                        String key = a.nextLine(); 
                        printLnText(removeText(in, key));
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }
                    break; 
                case 5:
                    // Add Text
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine();
                        String in = a.nextLine();
                        printText("Enter an add string: "); 
                        String add = a.nextLine();
                        printText("Enter an Index: "); 
                        int ind = a.nextInt(); 
                        printLnText(addText(ind, in, add));
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }  
                    break; 
                case 6:
                    // Reverse Text
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine();
                        String in = a.nextLine();
                        printLnText(reverseText(in));
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }  
                    break;
                case 7:
                    //Reverse Each Word
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine();
                        String in = a.nextLine();
                        printLnText(reverseEachWord(in));
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    }  
                    break;
                case 8:
                    // Print Text
                    while (true) {
                        printText("Enter a string: "); 
                        a.nextLine();
                        String in = a.nextLine();
                        printLnText(in);
                        printText("Would you like to try again? (Y/N)"); 
                        String ans = a.next(); 
                        if ("n".equals(ans.toLowerCase())) 
                            break;
                    } 
                   break;
                default: 
                    // none of the above
                    printLnText("Invalid Input"); 
                    break;
            }
            
            printText("Would you like to continue? (Y/N) : "); 
            String ans = a.next(); 
            if ("n".equals(ans.toLowerCase()))
                break; 
        }
        a.close();
    }
}