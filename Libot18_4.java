/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
    
import java.util.Scanner;
import java.text.DecimalFormat;


public class Libot18_4 {
    public static void main(String[] args) {
   
        Scanner inp = new Scanner (System.in);
        DecimalFormat tdc = new DecimalFormat ("0.00");
        
        double q, a, p, e, c, q1, a1, p1, e1, c1, fg;
        System.out.print("Quiz                    :   " );
        q = inp.nextDouble();
        q1 = q * .20;
        System.out.print("Activity               :   " );
        a = inp.nextDouble();
        a1 = a * .15;
        System.out.print("Project                 :   " );
        p = inp.nextDouble();
        p1 = p * .25;
        System.out.print("Exam                   :   " );
        e = inp.nextDouble();
        e1 = e * .30;
        System.out.print("Class Standing     :   " );
        c = inp.nextDouble();
        c1 = c * .10;
        System.out.println("---------------------------------------------------------------------------" );
        fg = q1 + a1 + p1 + e1 + c1;
        
        System.out.println("Final Grade          :   " + tdc.format(fg));
        
        if (fg >=75)
        {
            System.out.println("Remarks               :   PASSED");
        }
        else
        {
            System.out.println("Remarks               :   FAILED");
        }
    }   
}
