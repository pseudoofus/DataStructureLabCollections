
package lab5.s2;

public class SList<E> {
    
    protected int size = 0;
    
    public SList(){
        this.size = 0;
    }
    
    private SNode<E> head ;
    private SNode<E> tail ;
    
    public void append(E e){
        if(tail == null){
            head = tail = new SNode<>(e);
        }
        else{
        tail.next = new SNode<>(e);;
        tail = tail.next;
        }
        size++;
    }
    
    public E removeInitial(){
        if(size==0){
            return null;
        }
        else{
        SNode<E> current = head;
        head = current.next;
        current.next = null;
        size--;
        
        return current.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
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
    
    public void clear(){
        while(size!=0){
            removeInitial();
        }
    }
    
    public void display(){
        SNode<E> current = head;
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
        System.out.println("current size is: " + size);
        System.out.println("");
    }
}
