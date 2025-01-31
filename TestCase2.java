/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cruz_shaun;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 20% - QUIZ
 * 30% - ACTIVITY
 * 30% - EXAMS
 * 20% - RECIT
 * 
5.00 - 0
3.00 - 75
2.75 - 76-78
2.50 - 79-81
2.25 - 82-84
2.00 - 85-87
1.75 - 88-90
1.50 - 91-93
1.25 - 94-96
1.00 - 97-100
 * 
 */
public class TestCase2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        System.out.println("Enter Student Name: ");
        String stdName = scan.nextLine();
        
        if(stdName == "") {
            System.out.println("NO NAME FOUND!");
        }
            
        else {  
            System.out.println();
            System.out.print("Quiz: ");
            float quiz = scan.nextFloat();
            System.out.print("Activity: ");
            float act = scan.nextFloat();
            System.out.print("Exam: ");
            float exam = scan.nextFloat();
            System.out.print("Att/rec: ");
            float recit = scan.nextFloat();

            System.out.println();
            System.out.println("---------------------------");
            System.out.println("    STUDENT'S DETAILS");
            System.out.println("---------------------------");

            double fnlQuiz = (quiz * 0.20);
            double fnlAct = (act * 0.30);
            double fnlExam = (exam * 0.30);
            double fnlRecit = (recit * 0.20);

            System.out.println("STUDENT NAME: " + stdName);
                String formatQuiz = decimalFormat.format(fnlQuiz);
            System.out.println("QUIZ: " + formatQuiz);
                String formatAct = decimalFormat.format(fnlAct);
            System.out.println("ACTIVITY: " + formatAct);
                String formatExam = decimalFormat.format(fnlExam);
            System.out.println("EXAM: " + formatExam);
                String formatRecit = decimalFormat.format(fnlRecit);
            System.out.println("ATT/REC: " + formatRecit);

            double fnlGrade = (fnlQuiz + fnlAct + fnlExam + fnlRecit);
            String formattedNumber = decimalFormat.format(fnlGrade);
            System.out.println("STUDENT'S FINAL GRADE: " + formattedNumber);

            if(fnlGrade >= 97 && fnlGrade <= 100) {
                System.out.println("EQUIVALENT GRADE: 1.00");
            }          
            else if(fnlGrade >= 94 && fnlGrade <= 96) {
                System.out.println("EQUIVALENT GRADE: 1.25");
            }            
            else if(fnlGrade >= 91 && fnlGrade <= 93) {
                System.out.println("EQUIVALENT GRADE: 1.50");
            }            
            else if(fnlGrade >= 88 && fnlGrade <= 90) {
                System.out.println("EQUIVALENT GRADE: 1.75");
            }            
            else if(fnlGrade >= 85 && fnlGrade <= 87) {
                System.out.println("EQUIVALENT GRADE: 2.00");
            }           
            else if(fnlGrade >= 82 && fnlGrade <= 84) {
                System.out.println("EQUIVALENT GRADE: 2.25");
            }           
            else if(fnlGrade >= 79 && fnlGrade <= 81) {
                System.out.println("EQUIVALENT GRADE: 2.50");
            }
            else if(fnlGrade >= 76 && fnlGrade <= 78) {
                System.out.println("EQUIVALENT GRADE: 2.75");
            }
            else if(fnlGrade >= 75) {
                System.out.println("EQUIVALENT GRADE: 3.00");
            }
            else{
                System.out.println("EQUIVALENT GRADE: 5.00");
            }
  
            if(fnlGrade >= 75 && fnlGrade <= 100) {
                System.out.println("REMARKS: PASSED");
            }
            else{
                System.out.println("REMARKS: FAILED");
            }
            
        }   
    }
}
