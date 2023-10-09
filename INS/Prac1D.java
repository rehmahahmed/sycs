// Railfence cipher
package com.mycompany.practs;

import java.util.Scanner;

public class Prac1D {
    public static void main(String[] args){
        String rf;
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        rf = sc.nextLine();
        int i;
        System.out.println("---\nFirst Half: ");
        for(i=0; i<rf.length();i=i+2){
            char c = rf.charAt(i);
            s = s+c;
            System.out.print(c);
        }
        System.out.println("\n---\nSecond Half: ");
        for(i=1; i<rf.length();i=i+2){
            char c = rf.charAt(i);
            s = s+c;
            System.out.print(c);
        }
        System.out.println("\n---\nCipher Text: "+s);
    }
}
