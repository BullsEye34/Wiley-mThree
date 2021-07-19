package jpMorgan.banking.withdraw.stacks;

import java.util.Scanner;
import java.util.*;

public class Stacker {

    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    // Creating a stack
    Stacker(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // pop elements from top of stack
    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return arr[top--];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacker stack;
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        stack = new Stacker(size);
        int choice = 0;
        while(choice!=5){
            System.out.println("Enter your choice! ");
            System.out.println("\n1: Push\n2: Pop\n3: Peek \n4: Exit\n");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter Element to be pushed: ");
                    int ele = sc.nextInt();
                    stack.push(ele);
                    stack.printStack();
                    System.out.println();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(stack.top);
                    break;
                default: return;
            }
        }


    }
}
