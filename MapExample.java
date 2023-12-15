import java.util.*;    
class LoveBook {    
int id;    
String name,author,publisher;    
int quantity;    
public LoveBook(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class MapExample {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,LoveBook> map=new HashMap<Integer,LoveBook>();    
    //Creating Books    
    LoveBook b1=new LoveBook(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    LoveBook b2=new LoveBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    LoveBook b3=new LoveBook(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, LoveBook> entry:map.entrySet()){    
        int key=entry.getKey();  
        LoveBook b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}    