/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3_decision_structures;
import java.util.Scanner;
/**
 *
 * @author sibus
 */
//Description: Evaluates a student's mark to determine distinctions and pass/fail status.
public class Practical3_Decision_structures {

    public static void main(String[] args) {
        // --- Question 1.1: Prompt and store the user input ---
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Student Mark: ");
        int studentMark = input.nextInt();
        
        // --- Question 1.2: Check for distinction ---
        // Distinction is awarded if the mark is 75 or higher
        if (studentMark >= 75) {
            System.out.println("Student qualifies for a distinction.");
        }
        
        // --- Question 1.3 & 1.4: Pass/Fail evaluation with multiple statements ---
        // A student passes with 50 or above, and fails below 50
        if (studentMark >= 50) {
            System.out.println("Congratulations, you passed!");
            System.out.println("You may proceed to the next module.");
        } else {
            System.out.println("Unfortunately, you did not achieve the required pass mark.");
            System.out.println("Please consult your lecturer for academic support.");
        }
        
        // Close the scanner resource
        input.close();
    }
}

