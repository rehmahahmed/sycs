// Stream Cipher encryption
package com.mycompany.practs;
import java.util.Scanner;
public class Prac1A1 {
    public static void main(String[] args) {
        String message, encryptMessage = "";
        int key;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a plain text message: ");
        message = sc.nextLine();
        System.out.println("Enter Key: ");
        key = sc.nextInt();
        for(int i = 0; i < message.length(); i++){
            ch = message.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char) (ch + key);
                if(ch>'z'){
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptMessage = encryptMessage + ch;
            }
            else if(Character.isUpperCase(ch)){
                ch = (char)(ch+key);
                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' -1);
                }
                encryptMessage = encryptMessage + ch;
            }
            else{
                encryptMessage = encryptMessage + ch;
            }
        }
        System.out.println("Encrypted Message: " + encryptMessage);
    }
}

