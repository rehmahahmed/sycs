// mono alphabetic cipher
package com.mycompany.practs;

import java.util.Scanner;

public class Prac1B {
    public static char p[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
    public static char ch[] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', ' '};
    public static String doEncryption(String s){
        char c[]= new char[s.length()];
        for(int i=0; i<s.length();i++){
            for(int j=0; j<27; j++){
                if(p[j]==s.charAt(i)){
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return new String(c);
    }
    public static String doDecryption(String s){
        char p1[]= new char[s.length()];
        for(int i=0; i<s.length();i++){
            for(int j=0; j<27; j++){
                if(ch[j]==s.charAt(i)){
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return new String(p1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message: ");
        String en = doEncryption(sc.nextLine().toLowerCase());
        System.out.println("Encrypted Message: " + en);
        System.out.println("Decrypted Message: " + doDecryption(en));
        sc.close();
    }  

}
