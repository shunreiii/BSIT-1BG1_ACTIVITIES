/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
import java.util.Scanner;

/**
 *Calculator: Give two digit type a if addition, b if subtraction, c if multiplication, and d is division 
 */
public class CalculatorNiAviel {
    public static void main(String[] args) {
       Scanner calc = new Scanner(System.in);
       System.out.print("Enter First number: ");
       int oneNum = calc.nextInt();
       System.out.print("Enter second number: ");
       int twoNum = calc.nextInt();
       
       System.out.println("a = addition (+)");
       System.out.println("b = subtraction (-)");
       System.out.println("c = multiplication (x)");
       System.out.println("d = division (/)");
       System.out.print("Enter operation (a, b, c, d): ");
       char operator = calc.next().charAt(0);
       
       if(operator == 'a') {
           System.out.println(oneNum + " + " + twoNum + " = " + (oneNum + twoNum));
       }
       
       else if(operator == 'b') {
           System.out.println(oneNum + " - " + twoNum + " = " + (oneNum - twoNum));
       }
       
       else if(operator == 'c') {
           System.out.println(oneNum + " x " + twoNum + " = " + (oneNum * twoNum));
       }
       
       else if(operator == 'd') {
           System.out.println(oneNum + " / " + twoNum + " = " + (oneNum / twoNum));
       }
       
       else{
           System.out.println("invalid operator :<");
       }
    }
}
