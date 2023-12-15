import java.util.*;

class Book {
	String name;
	int price;
	String author;
	int pages;
	public Book(String name,int price,String author,int pages) {
		this.name= name;
		this.price=price;
		this.author=author;
		this.pages=pages;
		
	}
}
	
public class Booklist{
		public static void main(String args[])
		{
		List<Book> li=new ArrayList<Book>();
		Book b1=new Book("rishabh",30,"rishabh",30);
		Book b2=new Book("Rishabh",45,"rishabh",35);
		li.add(b1);
		li.add(b2);
		for(Book b:li)
		{
			System.out.println( b.name + b.price + b.author + b.pages);
		}
	}
}
