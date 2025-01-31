/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
import java.util.Scanner;


public class TestCase3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        int hrs;
        double mis = 500, mkt = 400, act = 550, hof = 0.15, swd = 0.25, sod = 0.35, grsSalary, ttlDeduct, netSalary;
        String dpt1 = "MIS", dpt2 = "MKT", dpt3 = "ACT", st1 = "HOF", st2 = "SWD", st3 = "SOD", name, dptCode, status;
        
        System.out.print("Enter Name: \t\t");
        name = scan.nextLine();
        
        if(!(name.isBlank()||name.isEmpty()||name.equals(""))){
            
            System.out.print("Enter Department Code: \t");
            dptCode = scan.nextLine();
            
            if(dptCode.equalsIgnoreCase(dpt1)){
                 
                System.out.print("No. of hours worked: \t");
                hrs = scan.nextInt();
                
                grsSalary = (mis * hrs);
                
                System.out.print("Enter Status: \t\t");
                status = scan2.nextLine();
                
                if(status.equalsIgnoreCase(st1)){
                    ttlDeduct = grsSalary * hof;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
                else if(status.equalsIgnoreCase(st2)){
                    ttlDeduct = grsSalary * swd;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
                else if(status.equalsIgnoreCase(st3)){
                    ttlDeduct = grsSalary * sod;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
            }
            
            if(dptCode.equalsIgnoreCase(dpt2)){
                 
                System.out.print("No. of hours worked: ");
                hrs = scan.nextInt();
                
                grsSalary = (mkt * hrs);
                
                System.out.print("Enter Status: ");
                status = scan2.nextLine();
                
                if(status.equalsIgnoreCase(st1)){
                    ttlDeduct = grsSalary * hof;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
                else if(status.equalsIgnoreCase(st2)){
                    ttlDeduct = grsSalary * swd;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
                else if(status.equalsIgnoreCase(st3)){
                    ttlDeduct = grsSalary * sod;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
            }
            
            if(dptCode.equalsIgnoreCase(dpt3)){
                 
                System.out.print("No. of hours worked: ");
                hrs = scan.nextInt();
                
                grsSalary = (act * hrs);
                
                System.out.print("Enter Status: ");
                status = scan2.nextLine();
                
                if(status.equalsIgnoreCase(st1)){
                    ttlDeduct = grsSalary * hof;
                    netSalary = grsSalary - ttlDeduct;
                    
                   System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
                else if(status.equalsIgnoreCase(st2)){
                    ttlDeduct = grsSalary * swd;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
                else if(status.equalsIgnoreCase(st3)){
                    ttlDeduct = grsSalary * sod;
                    netSalary = grsSalary - ttlDeduct;
                    
                    System.out.println("================================");
                    System.out.println("Gross Salary:\t\t" + grsSalary + "\nTotal Deduct:\t\t" + ttlDeduct + "\nNet Salary:\t\t" + netSalary);
                }
            }

            
        }//IF OF THE WHOLE PROCESS
        
    }//PSVM
}//PUBLIC CLASS
