
package lab4.s2;

public class MyLinkedList<E> {
    protected int size;
    
    public MyLinkedList(){
        this.size = 0;
    }
    
    Node<E> head ;
    Node<E> tail ;
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head; //create pointer to current head
        head = newNode; //new node created & assigned to new head
        size++; //increase size
        if (tail == null) //no node exists
        tail = head;
    }
    
    public void addLast(E e){
        if(tail == null){ // no nodes exist 
            head = tail = new Node<>(e);
        }
        else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
        if(index == 0){
            addFirst(e); // addFirst(e) already have size++
        }
        else if(index >= size){
            addLast(e);
        }
        else{
            head = tail = null;
            Node<E> current = head;
            for(int i = 1; i<index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    public E removeFirst(){
        if(size == 0){
            return null; 
        }
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head==null){
                tail = null;
            }
            return temp.element; // to know what we delete
        }
    }
    
    public E removeLast(){
        if (size == 0) 
            return null;
        else if (size == 1){
        Node<E> temp = head;
        head = tail = null;
        size = 0; //reset
        return temp.element; //to know what we delete
        }
        else{
        Node<E> current = head;
        for (int i = 0; i < size - 1; i++) // traverse until the previous node of tail
        current = current.next; //stop 1 node before tail
        Node<E> temp = tail; 
        tail = current;
        tail.next = null; //cut the link between current and next node
        size--;
        return temp.element;
        }
    }
    
    public E remove(int index){
        Node<E> current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }
        Node<E> temp = current.next;
        current.next= temp.next;
        size--;
        return temp.element;
    }
    
    public void add(E e){//KIV
        tail.next = new Node<>(e);
        tail = tail.next;
        size++;
    }
    
    public boolean contain(E e){
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
    
    public E get(int index){
        Node<E> current = head;
        E ret = null;
        for(int i = 0; i<index; i++){
        ret = current.element;
            current = current.next;
        }
        return ret;
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public int indexOf(E e){ // will return the index of the element that matches with the required element
        int checkIndex = 0;
        Node<E> current = head;
        for(int i = 0; i<size; i++){
            if(current.element==e){
                checkIndex = i;
            }
            current = current.next;
        }
        return checkIndex;
    }
    
    public int LastIndexOf(E e){ // will return the index of the last element
        int checkIndex = 0;
        Node<E> current = head;
        for(int i = 0; i<size-1; i++){
            current = current.next;
            checkIndex++;
        }
        return checkIndex;
    }
    
    public E set(int index, E e){ // will return the replaced element
        Node<E> current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }
        Node<E> ret = current.next;
        Node<E> temp = current.next;
        temp.element=e;
        return ret.element;
    }
    
    public void clear(){
        head = tail = null;
        head.next = null;
        size = 0;
    }
    
    public void print(){
        Node<E> current = head;
        for(int i = 0; i<size; i++){
            System.out.println(current.element);
            current = current.next;
        }
    }
    
    public void reverse(){ // dont know 
        Node<E> current = head;
        Node<E> next = null;
        Node<E> prev = null;
        
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        tail = head;
        tail.next = null;
        head = prev;
    }
    
    public E getMiddleValue(){ // returns the value of the middle element of a linked list
        Node<E> current = head;
        for(int i = 0; i<size/2; i++){
            current = current.next;
        }
        Node<E> temp = current.next;
        return temp.element;
    }
    
    
}
