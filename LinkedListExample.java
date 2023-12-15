import java.util.*;  
class MyBook {  
int id;  
String name,author,publisher;  
int quantity;  
public MyBook(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class LinkedListExample {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<MyBook> list=new LinkedList<MyBook>();  
    //Creating Books  
    MyBook b1=new MyBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    MyBook b2=new MyBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    MyBook b3=new MyBook(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(MyBook b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  