// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.Scanner;

public class TestMyStack{
    public static void main(String[] args){
        int optionNumber = 0; //will hold the user's option number
        Object item;
        Stack myStack = new Stack(); //creates a stack called myStack

        Scanner optionNumberScanner = new Scanner(System.in);
        Scanner itemScanner = new Scanner(System.in);
        do{
            Menu(); //displays the menu
            optionNumber = optionNumberScanner.nextInt(); //reads user's input for which
            switch (optionNumber){
                case 1:
                    System.out.print("What would you like to push to the stack: ");
                        item = itemScanner.next();
                    System.out.print("Stack before pushing " + item + ": ");
                        myStack.printStack();
                    System.out.print("\nStack after pushing " + item + ": ");
                        myStack.push(item);
                        myStack.printStack();
                        break;
                case 2:
                    System.out.print("Stack before popping: ");
                    myStack.printStack();
                    System.out.print("\nStack after popping: " );
                    myStack.pop();
                    myStack.printStack();
                    break;
                case 3:
                    myStack.peek();
                    break;
                case 4:
                    System.out.println("The size of the stack is: " + myStack.size());
                    break;
                case 5:
                    System.out.println("Is stack empty: " + myStack.isEmpty());
                    break;
                case 6:
                    System.out.print("Contents in stack: ");
                    myStack.printStack();
                    break;
                case 7:
                    break;
                default:
                    System.out.print("Invalid input. Please input a valid number: ");
                    optionNumber = optionNumberScanner.nextInt();
            }
        }while(optionNumber != 7);

    }

    public static void Menu(){
        System.out.print("\n\n--------MAIN MENU-------\n" +
                           "1 – Push element\n" +
                           "2 – Pop element\n" +
                           "3 – Top element\n" +
                           "4 – Size of stack\n" +
                           "5 – Is Empty stack?\n" +
                           "6 - Print stack content\n" +
                           "7 - Exit program\n\n" +
                           "Enter option number: ");
    }
}
