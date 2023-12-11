// Client 
package com.mycompany.practs;
import java.util.*;
import java.io.*;
import java.net.*;
public class Prac8Client {
    public static void main(String args[]){
        Socket socket = null;
        java.io.InputStreamReader insr = null;
        java.io.OutputStreamWriter oswr = null;
        java.io.BufferedReader br = null;
        java.io.BufferedWriter bw = null;
        try{
            socket = new Socket("localhost", 4000);
            insr = new InputStreamReader(socket.getInputStream());
            oswr = new OutputStreamWriter(socket.getOutputStream());
            br = new BufferedReader(insr);
            bw = new BufferedWriter(oswr);
            Scanner sc = new Scanner(System.in);
            while(true){
                String msgtosend = sc.next();
                bw.write(msgtosend);
                bw.newLine();
                bw.flush();
                String m = br.readLine();
                System.out.println(m);
                if(msgtosend.equalsIgnoreCase("BYE")){
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
