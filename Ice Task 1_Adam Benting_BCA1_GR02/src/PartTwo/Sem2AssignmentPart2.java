/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PartTwo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Sem2AssignmentPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     // Create an ArrayList of integers named 'numbers'
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator App");
        System.out.println("****************************");

        // Loop until the user enters a non-integer (e.g., a letter)
        while (true) {
            System.out.println("Enter a number (press any letter to proceed):");

            // Check if the next input is an integer
            if (sc.hasNextInt()) {
                int userChoiceNumber = sc.nextInt();
                numbers.add(userChoiceNumber);
            } else {
                // Exit the loop if the input is not an integer
                System.out.println("Exiting input loop.");
                break;
            }
        }

        // Print the list of numbers
        System.out.println("You entered the following numbers: " + numbers);
        
        
        
    }
    
}
