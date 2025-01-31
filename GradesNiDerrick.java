/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradesNiDerrick {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    
    System.out.print("Quiz: ");
    double quiz = scan.nextDouble() * 0.20;
    System.out.print("Activity: ");
    double act = scan.nextDouble() * 0.15;
    System.out.print("Project: ");
    double proj = scan.nextDouble() * 0.25;
    System.out.print("Exam: ");
    double exam = scan.nextDouble() * 0.30;
    System.out.print("Class Standing: ");
    double clsStand = scan.nextDouble() * 0.10;
    
    System.out.println("================================");
    
    double fnlGrade = (quiz + act + proj + exam + clsStand);
    
    String formatGrade = decimalFormat.format(fnlGrade);
    System.out.println("Final Grade: " + formatGrade);
    
    if (fnlGrade > 74){
        System.out.println("Remarks: PASSED");
    }
    
    else {
        System.out.println("Remarks: FAILED");
    }
    
    }
}