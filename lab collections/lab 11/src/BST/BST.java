    
package BST;
import java.util.ArrayList;

public class BST<E extends Comparable<E>>{
    
    protected TreeNode<E> root;
    TreeNode<E> current;
    TreeNode<E> parent;
    protected int size = 0;
    
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }
    
    public boolean search(E e){ // return true if the element is in the tree
        current = root; // start from the root 
        
        while(current != null) {
            if (e.compareTo(current.element) < 0){ // because we implement comparable for the element
                current = current.left; // if e is is lesser than current element will move to the left subtree
            }
            else if (e.compareTo(current.element) > 0){
                current = current.right; // go to the right side 
            }
            else // element matches current.element
                return true; // element found
        }
        return false ; // element not found in the tree
    }
    
    public boolean insert (E e){ // insert element e into the binary tree and return true if success
        if (root == null){
            root = createNewNode(e);
        }
        else {
            // locate the parent node 
            parent = null;
            current = root;
            while (current!= null)
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }
                else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }
                else 
                    return false; // duplicate node not inserted
            // create the new node and attach it to the parent node 
            if (e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            }
            else{
                parent.right = createNewNode(e);
            }
        }
        size ++;
        return true;
    }
    
    // get the number of nodes in tree
    public int getSize(){
        return size;
    }
    
    // return the height of the tree, need to see the longest between right and left, recursively
    public int height(TreeNode<E> root){
        // there is no node in the tree
        int leftHeight;
        int rightHeight;
        // base case
        if (root == null){
            return -1; 
        }
        // recursive case 
        else { 
            // recursively call height method
            leftHeight = height(root.left);
            rightHeight = height(root.right);
        }
        // compare the heights of the left and right, return the one which is greater
        // each time recursive call +1
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    public E getRoot(){
        return root.element;
    }
    
    // returns the min value of BST
    public E minValue(){
        current = root;
        while(current.left!=null){
            current = current.left;
        }
        return current.element;
    }
    
    public E maxValue(){
        current = root;
        while(current.right!=null){
            current = current.right;
        }
        return current.element;
    }
    
    // returns a path from the root leading to the specified element 
    public void path(E e){
        ArrayList<TreeNode<E>> list = new ArrayList<>();
        current = root;
        
        // transfering the nodes into an array list 
        while (current != null){
            // adding the node to the list
            list.add(current);
            if(e.compareTo(current.element)<0){
                current = current.left;
            }
            else if(e.compareTo(current.element) >0){
                current = current.right;
            }
            else
                break;
        }
        // return an array list of node
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i).element + " ");
        }
        System.out.println("");
    }
        
    public boolean delete(E e){
        current = root;
        parent = null;
            
        // locate element e in the tree
        while(current != null){
            if(e.compareTo(current.element) < 0){
                parent = current;
                current = current.left;
            }
            else if(e.compareTo(current.element) > 0){
                parent = current;
                current = current.right;
            }
            // current is holding element e, e.compareTo(current.element) == 0
            else 
                break; 
        }
        // current holding null, means not found e
        if(current == null)
            return false;
        
        // case 1: current has no left child
        if (current.left == null){
            // connect the parent with the right child of the current node 
            if(parent == null){
                root = current.right;
            }
            else{
                parent.right = current.right;
            }
        }
        // case 2: current node has a left child
        else{
            TreeNode<E> parentOfRightMost = current;
            // to the left of current to find the right most
            TreeNode<E> rightMost = current.left;
            
            while(rightMost.right != null){
                parentOfRightMost = rightMost;
                // keep going right 
                rightMost = rightMost.right; 
            }
            
            // replace the element in current by the element in the right most
            current.element = rightMost.element;
            
            // eliminate rightmost node 
            if(parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
                // special case; parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        // element deleted successfully
        size--;
        return true;
    }
    
    public boolean clear(){
        root = null;
        size = 0;
        return true;
    }
    
    // display inorder traversal from a subtree recursively
    protected void inorder(TreeNode<E> root){
        if(root == null) 
            return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    
    // inorder traversal from the root
    public void inorder(){
        inorder(root);
    }
    
    // display inorder traversal from a subtree recursively
    protected void postorder(TreeNode<E> root){
        if(root == null) 
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    
    // inorder traversal from the root
    public void postorder(){
        postorder(root);
    }
    
    // display inorder traversal from a subtree recursively
    protected void preorder(TreeNode<E> root){
        if(root == null) 
            return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    // inorder traversal from the root
    public void preorder(){
        preorder(root);
    }
    
}
