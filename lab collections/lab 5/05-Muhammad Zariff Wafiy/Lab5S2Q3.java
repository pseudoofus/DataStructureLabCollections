
package lab5.s2.q3;

public class Lab5S2Q3 {

    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> dlist = new DoublyLinkedList<>();
        
        dlist.addFirst(1);
        //System.out.println("size of current Doubly Linked List: "+dlist.size);
        
        dlist.add(1, 10);
        //System.out.println("size of current Doubly Linked List: "+dlist.size);
        
        dlist.addLast(100);
        //System.out.println("size of current Doubly Linked List: "+dlist.size);
        
        dlist.add(2, 2); // index,element
        //System.out.println("size of current Doubly Linked List: "+dlist.size);
        
        dlist.remove(3);
        System.out.println("");
        
        dlist.iterateForward();
        
        dlist.iterateBackward();
        
        System.out.println("size of current Doubly Linked List: "+dlist.size);
        
        dlist.clear();
        System.out.println("");
        
        System.out.println("size of current Doubly Linked List: "+dlist.size);
    }
    
}
