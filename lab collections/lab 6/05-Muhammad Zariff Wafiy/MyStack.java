
package lab6.s2;

import java.util.ArrayList;

public class MyStack<E> { // generic stack
    
    private ArrayList<E> stackList;
    
    public MyStack(){
        stackList = new ArrayList<>();
    }
    
    public int getSize(){
        return stackList.size();
    }
    
    public E pop(){
        if(getSize()<=0){
            return null;
        }
        E o = stackList.get(stackList.size()-1);
        stackList.remove(stackList.size()-1);
        return o;
    }
    
    public void push(E o){
        stackList.add(o);
    }
    
    public E peek(){
        return stackList.get(stackList.size()-1);
    }
    
    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    
    @Override
    public String toString(){
        return "stack: " + stackList.toString() + " TOP";
    }
    
    public boolean search(E o){
        if(stackList.contains(o)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public E getFirstElement(){
        while(getSize()>1){
            pop(); // elements are objects
        }
        return pop();
    }
    
    public int half(){
        return getSize()/2;
    }
    
    public boolean isPalindrome(){
        boolean b = false;
        if(getSize()%2==0){
            MyStack<E> temp = new MyStack<>();
            while(temp.getSize()<=getSize()/2){ // pop until the new stack is == 3
                temp.push(pop()); // cannot 
            }
            System.out.println("the og stack" + toString());
            System.out.println("the new stack: "+temp.toString());
            while(temp.getSize()>0){
                if(pop().equals(temp.pop())){
                    b = true;
                }
            }
            System.out.println("the og stack" + toString()); // to show both the stack is now empty
            System.out.println("the new stack: "+temp.toString());
        }
        else{
            MyStack<E> temp = new MyStack<>();
            while(temp.getSize()<getSize()/2){ // pop until the new stack is == 3
                temp.push(pop()); // cannot 
            }
            //want to remove the last element of og stack
            pop();
            System.out.println("the og stack" + toString());
            System.out.println("the new stack: "+temp.toString());
            while(temp.getSize()>0){
                if(pop().equals(temp.pop())){
                    b = true;
                }
            }
            System.out.println("the og stack" + toString()); // to show both the stack is now empty
            System.out.println("the new stack: "+temp.toString());
        }
        return b;
    }
    
    public static MyStack toStack(String s){ // converting String to stack
        String[] tokens = s.split("");
        MyStack<String> stringStack = new MyStack<>();
        for(int i = 0; i<tokens.length; i++){
            stringStack.push(tokens[i]);
        }
        return stringStack;
    }
}
