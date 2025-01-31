/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
import java.util.Scanner;
/**
 * @author ShunRei
 */
public class DemoClass2 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);      
        System.out.println("APPLE - 20.00 Php/ pcs");
        System.out.println("ORANGE - 10.00 Php/ pcs");
        System.out.println("GRAPES - 5.00 Php/ pcs");
        
        System.out.println();
        System.out.print("How many apples did you take? : ");
        int apl = object.nextInt();
        System.out.print("how many orange did you take? : ");
        int orng = object.nextInt();
        System.out.print("How many grapes did you take? : ");
        int grp = object.nextInt();
          
        float apple = 20;
        float orange = 10;
        float grapes = 5;
        
        float sum1 = apple * apl;
        float sum2 = orange * orng;
        float sum3 = grapes * grp;
        float total = (sum1 + sum2 + sum3);
        
        System.out.println();
        System.out.println("Apple: " + apl + " = " + sum1);
        System.out.println("Orange: " + orng + " = " + sum2);
        System.out.println("Grapes: " + grp + " = " + sum3);
        
        System.out.println();
        System.out.println("TOTAL: " + total + " Php");
        
        System.out.println();
        System.out.print("ENTER PAYMENT: ");
        float pay = object.nextFloat();
        
        if (pay < total){
            System.out.println("KULANG PERA MO TEH");
        }
        
        else {
            float change = pay - total;
        
            System.out.println();
            System.out.println("CHANGE: " + change + " Php");
        
        }
        

    }     
}

