
package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab11s2 {

    public static void main(String[] args) {
        // list of numbers:
        // 45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14
        // inputs through prompt user
        /*
        BST bst1 = new BST();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Data: ");
        while(true){
            int num = sc.nextInt();
            if(num == -1)
                break;
            else
                bst1.insert(num);
        }

        
        ArrayList list1 = bst1.path(2);
        System.out.println(list1);
        for (int i = 0; list1 != null && i < list1.size(); i++)
            System.out.print(list1.get(i) + " ");
*/
        
        // inputs through default array
        BST bst2 = new BST();
        int[] inputs = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        System.out.print("Input Data: ");
        for (int x : inputs){
            System.out.print(x + " ");
            bst2.insert(x);
        }
        // inorder
        System.out.print("\nInorder (sorted): ");
        bst2.inorder();
        System.out.println("");
        // postorder 
        System.out.print("Postorder: ");
        bst2.postorder();
        System.out.println("");
        // preorder 
        System.out.print("Preorder: ");
        bst2.preorder();
        System.out.println("");
        // height
        System.out.println("Height of BST: " + bst2.height(bst2.root));
        // root 
        System.out.println("Root for BST is: " + bst2.getRoot());
        // checking 10
        System.out.println("Checking whether 10 is in the tree? " + bst2.search(10));
        // delete 53
        System.out.println("Delete 53: " + bst2.delete(53));
        // updated inorder 
        System.out.println("Updated Inorder data (sorted): " );
        bst2.inorder();
        System.out.println("");
        // Min Value
        System.out.println("Min Value: " + bst2.minValue());
        // Max Value 
        System.out.println("Max Value: " + bst2.maxValue());
        // path 
        System.out.print("A path from the root to 6 is: ");
        bst2.path(6);
        
        
    }
    
}
