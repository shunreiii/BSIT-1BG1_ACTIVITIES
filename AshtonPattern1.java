/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
import java.util.Scanner;

public class AshtonPattern1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int ctr1 = scan.nextInt();
        
        
        while(ctr1>0){
            int ctr2 = 0;
            while(ctr2 < ctr1){
                System.out.print(ctr1 - ctr2++);
                System.out.print(" ");
            }
            ctr2--;
            System.out.println("");
        }
        
    }
}
