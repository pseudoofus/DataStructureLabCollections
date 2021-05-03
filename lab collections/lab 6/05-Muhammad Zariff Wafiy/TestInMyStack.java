
package lab6.s2;

import java.util.Scanner;
import java.util.Stack;

public class TestInMyStack {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        /*
        MyStack<Integer> st1 = new MyStack<>();
        
        System.out.println("Enter an integer value, Enter -1 integer when done");
        
        while(true){
            int num = scan.nextInt();
            if(num!=-1){
                st1.push(num);
            }
            else{
                break;
            }
        }
        
        System.out.println(st1.getSize());
        
        while(st1.getSize()!=0){ // printing the popped/removed element from the list
            System.out.println(st1.pop());
        }
        */
        
        //the output of the elements are as first in last out because the last 
        //element that is pushed in the stack is the one will be popped first
        
        //q3
        /*
        add() // function that adds popped elements until the list is empty
            while(S.getSize()>1){
                int operandTwo = S.pop();
                int operandOne = S.pop();
                double result = operandTwo + operandOne;
                S.push(result);
            }
            return S.peek();
        */
        
        
    }
    
}
