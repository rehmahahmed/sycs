// Diffie Hellmen
package com.mycompany.practs;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers P an G, agreed on by both users:");
        int p = sc.nextInt();
        int g = sc.nextInt();
        System.out.println("Enter Alice's secret key: ");
        int a = sc.nextInt();
        System.out.println("Enter Bob's secret key: ");
        int b = sc.nextInt();
        int x = (int)Math.pow(g, a)%p;
        int y = (int)Math.pow(g, b)%p;
        System.out.println("X="+x);
        System.out.println("Y="+y);
        int Ka = (int)Math.pow(y, a)%p;
        int Kb = (int)Math.pow(x, b)%p;
        System.out.println("Secret key for Alice is "+Ka);
        System.out.println("Secret key for Bob is "+Kb);
    }

}
