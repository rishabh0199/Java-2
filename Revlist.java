import java.util.*;
public class Revlist{  
public static void main(String args[]){  
List<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");      
        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println(itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println(itr.previous());    
        }    
}  
}  

