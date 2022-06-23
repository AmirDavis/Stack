// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 3

public class Stack<e> {
    public Node head;
    int size;

    public Stack(){
        head = null;
        size = 0;
    }

    //adds element to stack
    public void push(e element){
        if(isEmpty()){
            head = new Node(element);
            size++;
        }
        else{
            Node temp = head;
            head = new Node(element);
            head.next = temp;
            size++;
        }
    }

    //removes the top element on the stack
    public void pop(){
        if(isEmpty()){
            System.out.print("Stack is empty");
        }
        else{
            head = head.next;
            size--;
        }
    }

    //returns the head of the stack
    public Node popPalindrome(){
        return head;
    }
    //removes the first node
    public void nextNode(){
        head = head.next;
    }

    //Displays the contents of the first node
    public Node peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top of stack: " + head);
        }
        return head;
    }

    //returns the size of the stack
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if((head == null)){
            return true;
        }
        return false;
    }

        //prints the stack
        public void printStack() {
            Node temp = head;

            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        //class to create nodes as objects
        private class Node<e>{
        private e data; //data field
        private Node next; //link field

        //constructor method
        public Node(e item){
            data = item;
            next = null;
        }
        @Override
            public String toString(){
            return "" + data;
        }
    }
}


