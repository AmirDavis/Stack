// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 3

import  java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        String userInput;
        Character userDecision = 'Y';
        Scanner stringScanner = new Scanner(System.in);
        Scanner characterScanner = new Scanner(System.in);

        do{
            Stack<String> reverseStack = new Stack<>();
            System.out.print("Enter a string: ");
            userInput = stringScanner.nextLine(); //reads the user's string
            String[] stringArray = userInput.split(" "); //Splits the user's string apart by whitespaces and then adds each word into an array called stringArray

            //adds each word into the stack called reverseStack
            for(int i = 0; i < stringArray.length; i++){
                reverseStack.push(stringArray[i]);
            }

            System.out.println("\nInput string: " + userInput);
            System.out.print("Reversed string: " );
                reverseStack.printStack();
            System.out.print("\nDo you want to re-run code with different input string (Y/N): ");
                userDecision = characterScanner.next().charAt(0);
                userDecision = Character.toUpperCase(userDecision);
            System.out.println("");
        }while(!userDecision.equals('N'));
        stringScanner.close();
        characterScanner.close();
    }
}
