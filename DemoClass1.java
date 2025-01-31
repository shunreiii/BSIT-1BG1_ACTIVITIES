/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
import java.util.Scanner;
/**
 *
 * @author ShunRei
 */
public class DemoClass1 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fNum = object.nextInt();
        System.out.print("Enter second number: ");
        int sNum = object.nextInt();
        
        System.out.println();
        System.out.println("The sum of " + fNum + " + " + sNum + " is " + (fNum + sNum) + ".");
        System.out.println("The product of " + fNum + " * " + sNum + " is " + (fNum * sNum) + ".");
        System.out.println("The difference of " + fNum + " - " + sNum + " is " + (fNum - sNum) + ".");
        System.out.println("The quotient of " + fNum + " / " + sNum + " is " + (fNum / sNum) + ".");
        System.out.println("The modulus of " + fNum + " % " + sNum + " is " + (fNum % sNum) + ".");
               
    }
}
