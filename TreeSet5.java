import java.util.*;  
class TreeSet5{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
           
         System.out.println("Intial Set: "+set); //initial 
           
         System.out.println("Head Set: "+set.headSet("C")); //After C 
          
         System.out.println("SubSet: "+set.subSet("A", "E"));  //between A- E include A exclude E
           
         System.out.println("TailSet: "+set.tailSet("C"));  //Greater than C
 }  
}  