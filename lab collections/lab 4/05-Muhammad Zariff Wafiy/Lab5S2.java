
package lab5.s2;

public class Lab5S2 {
    
    public static void main(String[] args) {
        
        //Q1
        SList<String> slist = new SList<>();
        
        slist.append("Linked list,");
        slist.append(" is,");
        slist.append(" easy.");
        slist.display();
        
        slist.removeInitial(); // remove "Linked list"
        slist.display();
        
        System.out.println(slist.contains("difficult") + "\n");
        
        slist.clear();
        slist.display();
        
        //Q2
        
    }
    
}
