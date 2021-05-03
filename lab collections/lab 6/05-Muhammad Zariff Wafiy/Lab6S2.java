
package lab6.s2;

import java.util.Scanner;
import static lab6.s2.MyStack.toStack;

public class Lab6S2 {

    public static void main(String[] args) {
        TestMyStack.main(args);
        
        TestInMyStack.main(args);
        
        //q4
        /*
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str = scan.next();
        
        MyStack<String> newStack = toStack(str);
        System.out.println(newStack.toString());
        
        System.out.println(newStack.isPalindrome());
*/
        
        //q5
        //big-medium-small
        //have 3 stack, first stack push big medium and small 
        //start game
        
        MyStack<String> tower1 = new MyStack<>();
        MyStack<String> tower2 = new MyStack<>();
        MyStack<String> tower3 = new MyStack<>();
        
        tower1.push("big");
        tower1.push("medium");
        tower1.push("small");
        //start
        tower3.push(tower1.pop());
        tower2.push(tower1.pop());
        tower2.push(tower3.pop());
        tower3.push(tower1.pop());
        tower1.push(tower2.pop());
        tower3.push(tower2.pop());
        tower3.push(tower1.pop());
        //7 steps
        System.out.println(tower3.toString());
    }
    
}
