
package lab5.s2.q3;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    protected int size; 
    
    public DoublyLinkedList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(E element){
        Node<E> temp = new Node(element, head, null);
        if(head != null){
            head.prev = temp;
        }
        head = temp;
        if(tail == null){
            tail = temp;
        }
        size++;
        System.out.println("adding: " + element);
    }
    
    public void addLast(E element){
        Node<E> temp = new Node(element, null, tail);
        if(tail != null){
            tail.next = temp;
        }
        tail = temp;
        if(head == null){
            head = temp;
        }
        size++;
        System.out.println("adding: " + element);
    }
    
    public void add(int index, E element){
        //index can only be 0 ~ size()
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            addFirst(element);
        }
        else if(index == size){
            addLast(element);
        }
        else{
            /*set from head and begin traverse
                stop on required position
            */
            Node<E> temp = head;
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
            /* create object insert and set pointer of the next pointer
            to the temp node and also set pointer of the prev pointer 
            to the temp.prev node
            */
            Node<E> insert = new Node (element, temp, temp.prev);
            //set pointer 'next' of the node temp.prev to new node insert
            temp.prev.next = insert;
            //sest pointer 'prev' of the node temp to new node insert
            temp.prev = insert;
            size++;
            System.out.println("adding: " + element);
        }
    }
    
    public void iterateForward(){
        
        System.out.println("iterating forward..");
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward...");
        Node<E> temp = tail;
        while(temp!= null){
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
        System.out.println("");
    }
    
    public E removeFirst(){
        if(size == 0){
            throw new NoSuchElementException(); // copy head to node temp
        }
        Node<E> temp = head; // head.next become a head
        head = head.next; // set pointer of prev of new head to be null
        head.prev = null; // reduce number of node
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E removeLast(){
        if(size==0){
            throw new NoSuchElementException(); // copy tail to node temp
        }
        Node<E> temp = tail; // tail.prev become a tail
        tail = tail.prev; // set pointer of next of new tail to be null
        tail.next = null; // reduce number of node
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E remove(int index){
        E element = null;
        if(index<0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            element = removeFirst();
        }
        else if(index==size-1){
            element = removeLast();
        }
        else{
            Node<E> temp = head;
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }
        return element;
    }
    
    public void clear(){
        Node<E> temp = head;
        while(head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
        System.out.println("succesfully clear 3 node(s)");
    }
    
}
