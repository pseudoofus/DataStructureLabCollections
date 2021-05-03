
package lab5.s2.q3;

public class DNode<E> {
    
    E element;  
    DNode<E> next;
    DNode<E> prev;
    
    public DNode(E element, DNode next, DNode prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public DNode(E element){
        this(element, null, null);
    }
}
