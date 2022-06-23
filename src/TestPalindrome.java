// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args){
        String userString; //holds the user's string
        String reversedString = "";
        Character userDecision; //holds the user's decision for whether they want to test another string for being a palindrome

        Scanner stringScanner = new Scanner(System.in);
        Scanner characterScanner = new Scanner(System.in);

        do{
            Stack<Character> Palindrome = new Stack<>();
            System.out.print("Input string: ");
            userString = stringScanner.next();

            //Inserting one character at a time from the user's string into the stack
            for(int i = 0; i < userString.length(); i++){
                Palindrome.push(userString.charAt(i));
            }

            //adds each object from the stack Palindrome to the string reverseString
            for(int i = 0; i < userString.length(); i++){
                reversedString += Palindrome.popPalindrome();
                Palindrome.nextNode();
            }

            System.out.println("\nInput String: " + userString);
            System.out.print("Judgement: ");

            //checks to see the user inputted string is a palindrome
            if(userString.equalsIgnoreCase(reversedString)){
                System.out.print("Palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }

            System.out.print("\nDo you want to re-run code with different input string (Y/N): ");
            userDecision = characterScanner.next().charAt(0); //Reads user input for if they want to enter another string or not
            userDecision = Character.toUpperCase(userDecision); //Changes user's input to uppercase if the user accidentally types lowercase
        }while(!userDecision.equals('N'));
    }
}
