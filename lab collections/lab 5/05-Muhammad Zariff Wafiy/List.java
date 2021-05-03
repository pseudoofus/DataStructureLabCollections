
package lab5.s2.q2;

public class List<E> {
     
    protected int size = 0;
    
    public List(){
        this.size = 0;
    }
    
    private Node<E> head ;
    private Node<E> tail ;
    
    public void add(E e){
        if(tail == null){
            head = tail = new Node<>(e);
        }
        else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public E removeElement(E e){
        
        if(size==0){
            return null;
        }
        else{
        Node<E> current = head;
        Node<E> temp;
        E remove = null;
        for(int i = 0; i<size-2; i++){
            if(current.element==e){
                temp = current.next;
                current.next.next = temp.next;
                temp.next = null;
                remove = temp.element;
                size--;
            }
            current = current.next; // until the last node
        }
        return remove;
        }
    }
    
    public boolean contains(E e){
        Node<E> current = head;
        boolean b = false;
        for(int i = 0; i<size-1; i++){
            current = current.next;
            if(current.element==e){
                b = true;
            }
            else{
                b = false;
            }
        }
        return b;
    }

    public void printList(){
        
        Node<E> current = head;
        if(size!=0){
            for(int i = 0; i<size; i++){
                System.out.print(current.element + " ");
                current = current.next;
            }
            System.out.println("");
        }
        else{
            System.out.println("list is empty");
        }
        System.out.println("");
    }
    
    public int getSize(){
        return size;
    }
    
    public void replace(E e,E newE){
        Node<E> current = head;
        for(int i = 0; i<size-1; i++){ // until the last node 
            if(current.element.equals(e)){
                current.element = newE;
            }
            else{
            current = current.next;
            }
        }
    }
}
