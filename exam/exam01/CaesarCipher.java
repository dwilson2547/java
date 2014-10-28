/**
 * 
 * Lab Exam01
 * 
 * Program encrypts, decrypts, and hacks caesar cipher and has a method to corrent 
 * dirty letter strings
 * 
 * @Author Daniel Wilson
 * 
 * @Lab LN5
 * 
 * @Date October 10, 2014
 * 
 **/ 

public class CaesarCipher {
    public static String encrypt(String s, int key) {
        s = s.toLowerCase(); 
        String encrypted = "";
        int length = s.length(); 
        Character[] array = new Character[length]; 
        for (int i = 0; i < length; i++) {
            array[i] = new Character(s.charAt(i)); 
        }
        for (int i = 0; i < length; i++) {
            char a = array[i];
            char b = (char)(a + key); 
            if (b > 123)
            {
                b = (char)(b - 26); 
            }
            array[i] = b; 
            encrypted = encrypted + array[i].toString();
        }
        return encrypted.toUpperCase(); 
    }
    public static String decrypt(String s, int key) {
        s = s.toLowerCase(); 
        String decrypted = "";
        int length = s.length(); 
        Character[] array = new Character[length]; 
        for (int i = 0; i < length; i++) {
            array[i] = new Character(s.charAt(i)); 
        }
        for (int i = 0; i < length; i++) {
            char a = array[i];
            char b = (char)(a - key); 
            if (b < 97)
            {
                b = (char)(b + 26); 
            }
            array[i] = b; 
            decrypted = decrypted + array[i].toString();
        }
        return decrypted.toUpperCase(); 
    }
    public static String justTheLetters(String s) {
        String clean = ""; 
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(s.charAt(i))) 
            {
                clean = clean + s.charAt(i); 
            }
        }
        return clean.toUpperCase(); 
    } 
    public static int crack(String s) {
        //s = s.toLowerCase(); 
        s = justTheLetters(s); 
        int[] array = new int[26]; 
        int shift; 
        // count number of letters
        for (int i = 0; i < s.length(); i++) {
            int index = (int)(s.charAt(i) - 'A'); 
            array[index]++; 
        }
        // find most used letter
        int max = 0; 
        int maxIndex = 0; 
        for (int i = 0; i < 26; i++) {
            if (array[i] > max) {
                max = array[i]; 
                maxIndex = i; 
            }
        }
        // determine how much to shift by
        shift = (maxIndex - 4) % 26; 
        // return 
        return shift;
    }
}