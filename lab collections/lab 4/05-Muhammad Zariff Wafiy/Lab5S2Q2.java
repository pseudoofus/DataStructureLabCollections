
package lab5.s2.q2;

import java.util.Scanner;

public class Lab5S2Q2 {

    public static void main(String[] args) {
        
        List<String> nameList = new List<>(); 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        while(true){
            String willAdd = scan.next();
            if(!"n".equals(willAdd)){
                nameList.add(willAdd);
            }
            else{
                System.out.println("");
                break;
            }
        }
        
        System.out.println("You have entered the following students' name : ");
        nameList.printList();
        
        System.out.println("The number of students entered is : " + nameList.getSize() + "\n");
        
        System.out.println("All the name entered correct? Enter 'r' to rename the student name, 'n' to proceed");
        String checkRename = scan.next();
        
        String oldName;
        String newName;
        String checkRemove;
        
        while(checkRename.equals("r")){
            System.out.println("Enter the existing student name that you want to rename : ");
            oldName = scan.next();
            
            System.out.println("Enter the new name :");
            newName = scan.next();
            
            nameList.replace(oldName, newName);
            System.out.println("The new student list is : ");
            nameList.printList();
            
            if(checkRename.equals("n")){
                break;
            }
        }
        
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed");
        checkRemove = scan.next();
        
        while(checkRemove.equals("y")){
            System.out.println("Enter a student name to remove :");
            nameList.removeElement(scan.next());
            if(checkRemove.equals("n")){
                break;
            }
        }
        
        System.out.println("The number of updated student is : " + nameList.getSize());
        System.out.println("The updated student list is : ");
        nameList.printList();
        System.out.println("All student data captured complete. Thank you!");
        
    }
    
}
