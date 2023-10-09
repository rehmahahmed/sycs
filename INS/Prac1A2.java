// Stream cipher decryption
package com.mycompany.practs;
import java.util.Scanner;
public class Prac1A2 {
    public static void main(String[] args) {
        String message, encryptMessage = "";
        int key;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an cipher text message: ");
        message = sc.nextLine();
        System.out.println("Enter decryption Key: ");
        key = sc.nextInt();
        for(int i = 0; i < message.length(); i++){
            ch = message.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char) (ch - key);
                if(ch < 'a'){
                    ch = (char) (ch - 'a' + 'z' + 1);
                }
                encryptMessage = encryptMessage + ch;
            }
            else if(Character.isUpperCase(ch)){
                ch = (char)(ch - key);
                if(ch < 'A'){
                    ch = (char)(ch - 'A' + 'Z' + 1);
                }
                encryptMessage = encryptMessage + ch;
            }
            else{
                encryptMessage = encryptMessage + ch;
            }
        }
        System.out.println("Decrypted Message: " + encryptMessage);
    }
}
