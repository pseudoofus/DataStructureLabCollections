
package lab4.s2;

public class Lab4S2 {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");
        list.add(4, "e");
        
        list.print();
        
        list.reverse();
        
        System.out.println("the size of the list: " + list.size);
        
        System.out.println("the first value of the list is: " + list.getFirst());
        
        System.out.println("the last value of the list is: " + list.getLast());
        
        list.remove(list.size/2);
        
        System.out.println("the index of the second value is: " + list.indexOf("d"));
        
        System.out.println("the index of the second value is: " + list.indexOf("c"));
        
        
    }
    
}
