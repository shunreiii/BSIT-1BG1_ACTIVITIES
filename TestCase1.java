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
public class TestCase1 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int fNum = object.nextInt();
        System.out.print("Enter second number: ");
        int sNum = object.nextInt();    
        System.out.print("Enter third number: ");
        int tNum = object.nextInt();
        
        if(fNum == 13){
            System.out.println("0");    
        }
        
        else if(sNum == 13){
            System.out.println(fNum);
        }
        
        else if(tNum == 13){
            System.out.println(fNum + sNum);
        }
        else{
            System.out.println(fNum + sNum + tNum); 
        }
        
    }   
}
